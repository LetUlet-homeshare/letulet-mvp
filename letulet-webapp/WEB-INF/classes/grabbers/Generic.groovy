package grabbers

import org.crosspollinate.publishing.metagrabber.MemoryItemAlternative
//import org.crosspollinate.metagrabber.api.*
import org.crosspollinate.metagrabber.impl.groovy.*
import org.crosspollinate.publishing.PreviewImage
import org.crosspollinate.publishing.MetaParser
import org.crosspollinate.utils.Log
import org.crosspollinate.utils.URLUtil
import org.htmlparser.Parser
import org.htmlparser.parserapplications.filterbuilder.Filter
import org.htmlparser.filters.OrFilter
import org.htmlparser.filters.NodeClassFilter
import org.htmlparser.tags.MetaTag
import org.htmlparser.tags.TitleTag
import org.htmlparser.tags.ImageTag
import org.htmlparser.Node
import org.htmlparser.NodeFilter
import org.htmlparser.filters.NodeClassFilter
import org.htmlparser.tags.LinkTag
import org.htmlparser.nodes.TextNode
import org.htmlparser.util.NodeList

class Generic extends HtmlparserBasedScrapper {

	static nodesFilter = or(
			tag("META"),
			tag("TITLE"),
			tag("IMG")
		);
	
	
	def acceptFilter = {
		matchContentTypeWith(~/text\/html/)
	}

	/**
	 * Override this if you plan to create a scrapper based on Generic#doScrapp
	 * @returns type of the scrapped item page 
	 */
	String getType(){
		return null;
	}
	
	Parser parser
	NodeList page
	
	void doScrapp(String url, MemoryItemAlternative alternative){
		
		super.doScrapp(url,alternative);
		
		parser = newParser(url)
		page = parser.parse(null);
		
		NodeFilter filter = nodesFilter;
		
		def title = ""
		def metaTitle = ""
		def metaDescription = ""
		
		List<PreviewImage> previewImages = new ArrayList<PreviewImage>()
		List<PreviewImage> backupImages = new ArrayList<PreviewImage>()
		List<PreviewImage> duplicateImages = new ArrayList<PreviewImage>()
		
		def list = page.extractAllNodesThatMatch(filter,true);
		
		for (int i = 0; i < list.size(); i++) {
			
			Node htmlnode = list.elementAt(i);
			
			switch(htmlnode.class){
			
				case (ImageTag.class):
				ImageTag img = (ImageTag) htmlnode;
				String width = img.getAttribute("WIDTH");
				String height = img.getAttribute("HEIGHT");
				String imgurl = img.getImageURL()
				//println imgurl;
				MetaParser.classifyImage(URLUtil.getAbsoluteUrl(url,imgurl),img.getAttribute("ALT"),img.getAttribute("TITLE"),width,height,previewImages,backupImages,duplicateImages)
				break;
				
				case (TitleTag.class):
				if (!title){
					TitleTag titleTag = (TitleTag) htmlnode;
					title = titleTag.getTitle();
					Log.debug(this.getClass(), "EXTRACTED TITLE : "
							+ titleTag.getTitle());
				}
				break;
			
				case (MetaTag.class):
				MetaTag metaTag = (MetaTag) htmlnode;
				String metaName = metaTag.getMetaTagName();
				if (metaName
						&& metaName.toLowerCase().equals("description")) {
					metaDescription = metaTag.getMetaContent();
					Log.debug(this.getClass(), "EXTRACTED META : "
							+ metaName + " = " + metaDescription);
				}
				if (metaName && metaName.toLowerCase().equals("title")) {
					metaTitle = metaTag.getMetaContent();
					Log.debug(this.getClass(), "EXTRACTED META : "
							+ metaName + " = " + metaTitle);
				}
				break;
			
			}
		}
		
		if (title) {
			if (metaTitle) {
				alternative.setTitle(metaTitle);
			} else {
				alternative.setTitle(title);
			}
		}
	
		if (metaDescription) {
			alternative.setDescription(metaDescription);
		} else {
			String v = first(page,tag("P"))?.toPlainTextString();
			if (v)
				alternative.setDescription(v);
			else {
				v = nthText(1,page,tag("P"))
				if (v)
					alternative.setDescription(v);
			}
		}
		alternative.setType(getType());
		
		getSharingVideoSrc(alternative,page,true)
		getSharingFeedSrc(alternative,page)
	
	
		previewImages.each {
			PreviewImage img ->
			alternative.getThumbnails() << img;
		}
		
		if (previewImages.size()==0)
			backupImages.each {
				PreviewImage img ->
				alternative.getThumbnails() << img;
		}
		alternative.getThumbnails() << new PreviewImage("http://open.thumbshots.org/image.pxf?url=${URLUtil.encodeURL(url)}","","");
	}


}