package grabbers

import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.methods.*
import org.crosspollinate.metagrabber.impl.groovy.*
import org.htmlparser.filters.*
import org.htmlparser.NodeFilter
import org.htmlparser.Node
import org.htmlparser.nodes.*
import org.htmlparser.util.NodeList
import org.htmlparser.Parser
import org.htmlparser.PrototypicalNodeFactory
import org.htmlparser.tags.ParagraphTag
import org.htmlparser.NodeFactory
import org.htmlparser.PrototypicalNodeFactory
import org.htmlparser.NodeFilter
import org.htmlparser.Node
import org.htmlparser.nodes.*
import org.crosspollinate.publishing.metagrabber.MemoryItemAlternative
import org.crosspollinate.publishing.PreviewImage
import org.crosspollinate.publishing.metagrabber.HtmlParser

abstract class HtmlparserBasedScrapper extends BaseGroovyScrapper {
	

	static NodeFactory nodeFactory = new PrototypicalNodeFactory();
	static {
		nodeFactory.registerTag (new AddressTag ());
		
		
		//ExpandoMetaClass.enableGlobally()
		NodeList.metaClass.getAt = { int i ->
			return elementAt(i);
		}
		NodeList.metaClass."collectNode" = {closure ->
			List result=[]
			
			for (int i=0; i<size();i++){
				result << closure(elementAt(i));
			}
			return result
		}
		NodeList.metaClass."eachNode" = {closure ->
			for (int i=0; i<size();i++){
				closure(elementAt(i));
			}
		}
	}
	Parser newParser(String url){
		Parser p = new HtmlParser(url,client);
		//Parser p = new Parser(url);
		p.setNodeFactory(nodeFactory);
		return  p;
	}
	
	
	// Some htmlparser filter helpers
	static or = {
			Object[] filters ->
			OrFilter f = new OrFilter((NodeFilter[])filters);
			return f
	}
	static and = {
			Object[] filters ->
				AndFilter f = new AndFilter((NodeFilter[])filters);
				return f
	}
	static not = {
			Object filter ->
			NotFilter f = new NotFilter((NodeFilter) filter);
			return f
	}
	
	static NodeFilter childOf(NodeFilter filterForParent){
		return new HasParentFilter(filterForParent,false);
	}
	static childOfAny = {
		NodeFilter[] filter ->
		return or(filters.collect(childOf(it)));
	}

	static NodeFilter descendantOf(NodeFilter filterForAncestor){
		return new HasParentFilter(filterForAncestor,true);
	}
	static descendantOfAny = {
		NodeFilter[] filter ->
		return or(filters.collect(descendantOf(it)));
	}
	static descendantOfAll = {
		NodeFilter[] filter ->
		return and(filters.collect(descendantOf(it)));
	}
	
	static NodeFilter parentOf(NodeFilter filterForChild){
		return new HasChildFilter(filterForChild,false);
	}
	static parentOfAny = {
		NodeFilter[] filters ->
		return or(filters.collect{parentOf(it)})
	}
	static parentOfAll = {
		NodeFilter[] filters ->
		return and(filters.collect{parentOf(it)})
	}
	
	static NodeFilter ancestorOf(NodeFilter filterForDescendant){
		return new HasChildFilter(filterForDescendant,true);
	}
	static ancestorOfAny = {
		NodeFilter[] filters ->
		return or(filters.collect{ancestorOf(it)})
	}
	
	static ancestorOfAll = {
		NodeFilter[] filters ->
		return and(filters.collect{ancestorOf(it)})
	}

	static NodeFilter siblingOf(NodeFilter filterForSibling){
		return new HasSiblingFilter(filterForSibling,true);
	}
	
	static siblingOfAny = {
		NodeFilter[] filters ->
		return or(filters.collect{siblingOf(it)})
	}
	
	static siblingOfAll = {
		NodeFilter[] filters ->
		return and(filters.collect{siblingOf(it)})
	}

	
	static NodeFilter tag(String name){
		return tag(name,[:]); 
	}
		
	// select the tags that are parents of the tag matching the node filter
	// for example, in IMDB, find the image within the div class="photo"
	static NodeFilter descendant(String name, NodeFilter filter){
		return and(tag(name),descendantOf(filter))
	}
	
	// same as descendamt, but only one level
	static NodeFilter child(String name, NodeFilter filter){
		return and(tag(name),childOf(filter))
	}
	
	// one level up
	static NodeFilter parent (String name, NodeFilter filter){
		return and(tag(name),parentOf(filter));
	}
	
	// within the parents tag (N levels)
	static NodeFilter ancestor (String name, NodeFilter filter){
		return and(tag(name),ancestorOf(filter));
	}
	
	static NodeFilter tag(Closure closure){
		return [
			accept: closure
		] as NodeFilter
	}
	
	static NodeFilter child(Closure closure, NodeFilter filter){
		return and(tag(closure),childOf(filter))
	}
	static NodeFilter descendant(Closure closure, NodeFilter filter){
		return and(tag(closure),descendantOf(filter))
	}
	static NodeFilter parent (Closure closure, NodeFilter filter){
		return and(tag(closure),parentOf(filter));
	}
	static NodeFilter ancestor (Closure closure, NodeFilter filter){
		return and(tag(closure),ancestorOf(filter));
	}
	
	static NodeFilter tag(String name, Map attributes){
		NodeFilter f = [
			accept: {
				Node node ->
				if (!(node instanceof TagNode)) return false;
				else {
					TagNode t = (TagNode) node;
					if ((name != "*")&&(name != t.getTagName())) return false;
					def rejectedattr = attributes.find{
						k,v->
						
						if (v instanceof Closure){
							return !v(t.getAttribute(k))
						} else {
							return (v != t.getAttribute(k));
						}
					}
					return !rejectedattr as Boolean;
				}
				
			}
		] as NodeFilter;
		
		return f;
	}
	static NodeFilter child(String name, Map attributes, NodeFilter filter){
		return and(tag(name,attributes),childOf(filter))
	}
	static NodeFilter descendant(String name, Map attributes, NodeFilter filter){
		return and(tag(name,attributes),descendantOf(filter))
	}
	static NodeFilter parent (String name, Map attributes, NodeFilter filter){
		return and(tag(name,attributes),parentOf(filter));
	}
	static NodeFilter ancestor (String name, Map attributes, NodeFilter filter){
		return and(tag(name,attributes),ancestorOf(filter));
	}
	
	static NodeFilter childText(NodeFilter filter){
		return and(textAny(),childOf(filter));
	}
	
	static NodeFilter childTextWith(String text,NodeFilter filter){
		return and(textWith(text),childOf(filter));
	}
	
	// match all decendent of filter that have text matching
	static NodeFilter descendantTextWith(String text,NodeFilter filter){
		return and(textWith(text),descendantOf(filter));
	}
	
	static NodeFilter textAny(){
		return new NodeClassFilter(TextNode.class);
	}
	static NodeFilter textWith(String text){
		return new StringFilter(text);
	}
	static NodeFilter textMatching(String pattern){
		return new RegexFilter(pattern);
	}
	
	// attribute predicate closures
	static _containsString = {
		searched, container ->
		if (container == null) return false
		return container.toString().contains(searched);
	}
	static containsString = { it -> return _containsString.curry(it)}
	
	
	
	// High level methods ...
	// HLF : first matching tag methods
	/**
	 * get the first tag matching a filter...
	 */
	static Node first(NodeList nodeList, NodeFilter filter){
		NodeList nl = nodeList.extractAllNodesThatMatch(filter,true);
		if (nl.size()>0) return nl[0]
		return null;
	}
	static Node nth(int n,NodeList nodeList, NodeFilter filter){
		NodeList nl = nodeList.extractAllNodesThatMatch(filter,true);
		if (nl.size()>n) return nl[n]
		return null;
	}
	/**
	 * Scrapp the plain text content of the first matching node.
	 * @return plain text content
	 */
	static String text(NodeList nodeList, NodeFilter filter){
		Node node = first(nodeList, filter)
		return node?.toPlainTextString();
	}
	static String nthText(int n,NodeList nodeList, NodeFilter filter){
		Node node = nth(n,nodeList, filter)
		return node?.toPlainTextString();
	}
	
	/**
	 * Scrapp the attribute value of the first matching node.
	 * @return the attribute value or null it the first node is not a tag...
	 */
	static String attribute(NodeList nodeList, String attribute, NodeFilter filter ){
		Node node = first(nodeList, filter);
		if (node && (node instanceof TagNode)){
			return node.getAttribute(attribute);
		}
		return null;
	}
	/**
	 * Scrapp the attributes values of the first matching node.
	 * @return the filled map or null it the first node is not a tag...
	 */
	static Map attributes(NodeList nodeList, Map attributes, NodeFilter filter ){
		Node node = first(nodeList, filter);
		if (node && (node instanceof TagNode)){
			attributes.each{
				k,v->
				attributes[k] = node.getAttribute(k);
			}
			return attributes
		}
		return null;
	}
	
	// HLF : matching tag methods
	static List<String> texts(NodeList nodeList, NodeFilter filter){
		return nodeList.extractAllNodesThatMatch(filter,true).collectNode{
			it.toPlainTextString()
		}
	}
	
	
	
	// scrapping...

	private String findSharingFeedSrc(NodeList nodeList){
		return attribute(nodeList, "HREF", tag("LINK",["REL":"alternate","TYPE":"application/rss+xml"]) )
	}
	private String findSharingVideoSrc(NodeList nodeList){
		return attribute(nodeList, "HREF", tag("LINK",["REL":"video_src"]) )
	}

	
	private String findSharingImageSrv(NodeList nodeList){
		String src = attribute(nodeList, "HREF", tag("LINK",["REL":"image_src"]) )
		if (!src) src = attribute(nodeList, "HREF", tag("LINK",["REL":"thumbnail"]) )
		return src;
	}
	public void getSharingFeedSrc(MemoryItemAlternative alternative,NodeList nodeList){
		String src = findSharingFeedSrc(nodeList);
		if (src){
			alternative.setSharingFeedSrc(src);
		}
		
	}
	public void getSharingVideoSrc(MemoryItemAlternative alternative,NodeList nodeList,boolean setVideoTypeIfFound){
		String src = findSharingVideoSrc(nodeList);
		if (src){
			alternative.setSharingVideoSrc(src);
			if (setVideoTypeIfFound){
				alternative.setType(MemoryItem.WEB_VIDEO_TYPE);
			}
		}
		String imgSrc = findSharingImageSrv(nodeList);
		if (imgSrc){
			alternative.getThumbnails() << new PreviewImage(imgSrc,"","");
		}
	}
}

class AddressTag extends ParagraphTag {
	String[] getEnders() {
		return ["ADDRESS"];
	}
	String[] getEndTagEnders() {
		return ["ADDRESS"];
	}
	String[] getIds(){
		return ["ADDRESS"];
	}
}
