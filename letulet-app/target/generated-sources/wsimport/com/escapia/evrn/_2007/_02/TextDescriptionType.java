
package com.escapia.evrn._2007._02;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TextDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *           &lt;element name="Description" minOccurs="0">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.escapia.com/EVRN/2007/02>FormattedTextTextType">
 *                   &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CopyrightNotice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CopyrightOwner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CopyrightStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CopyrightEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectiveEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextDescriptionType", propOrder = {
    "urlOrDescription"
})
@XmlSeeAlso({
    com.escapia.evrn._2007._02.TextItemsType.TextItem.class
})
public class TextDescriptionType {

    @XmlElements({
        @XmlElement(name = "URL", type = String.class),
        @XmlElement(name = "Description", type = TextDescriptionType.Description.class)
    })
    protected List<Object> urlOrDescription;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "ContentID")
    protected String contentID;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "Author")
    protected String author;
    @XmlAttribute(name = "CopyrightNotice")
    protected String copyrightNotice;
    @XmlAttribute(name = "CopyrightOwner")
    protected String copyrightOwner;
    @XmlAttribute(name = "CopyrightStart")
    protected String copyrightStart;
    @XmlAttribute(name = "CopyrightEnd")
    protected String copyrightEnd;
    @XmlAttribute(name = "EffectiveStart")
    protected String effectiveStart;
    @XmlAttribute(name = "EffectiveEnd")
    protected String effectiveEnd;
    @XmlAttribute(name = "ApplicableStart")
    protected String applicableStart;
    @XmlAttribute(name = "ApplicableEnd")
    protected String applicableEnd;
    @XmlAttribute(name = "RecordID")
    protected String recordID;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;

    /**
     * Gets the value of the urlOrDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlOrDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLOrDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link TextDescriptionType.Description }
     * 
     * 
     */
    public List<Object> getURLOrDescription() {
        if (urlOrDescription == null) {
            urlOrDescription = new ArrayList<Object>();
        }
        return this.urlOrDescription;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the contentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentID() {
        return contentID;
    }

    /**
     * Sets the value of the contentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentID(String value) {
        this.contentID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the copyrightNotice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightNotice() {
        return copyrightNotice;
    }

    /**
     * Sets the value of the copyrightNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightNotice(String value) {
        this.copyrightNotice = value;
    }

    /**
     * Gets the value of the copyrightOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightOwner() {
        return copyrightOwner;
    }

    /**
     * Sets the value of the copyrightOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightOwner(String value) {
        this.copyrightOwner = value;
    }

    /**
     * Gets the value of the copyrightStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightStart() {
        return copyrightStart;
    }

    /**
     * Sets the value of the copyrightStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightStart(String value) {
        this.copyrightStart = value;
    }

    /**
     * Gets the value of the copyrightEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightEnd() {
        return copyrightEnd;
    }

    /**
     * Sets the value of the copyrightEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightEnd(String value) {
        this.copyrightEnd = value;
    }

    /**
     * Gets the value of the effectiveStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveStart() {
        return effectiveStart;
    }

    /**
     * Sets the value of the effectiveStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveStart(String value) {
        this.effectiveStart = value;
    }

    /**
     * Gets the value of the effectiveEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveEnd() {
        return effectiveEnd;
    }

    /**
     * Sets the value of the effectiveEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveEnd(String value) {
        this.effectiveEnd = value;
    }

    /**
     * Gets the value of the applicableStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableStart() {
        return applicableStart;
    }

    /**
     * Sets the value of the applicableStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableStart(String value) {
        this.applicableStart = value;
    }

    /**
     * Gets the value of the applicableEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableEnd() {
        return applicableEnd;
    }

    /**
     * Sets the value of the applicableEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableEnd(String value) {
        this.applicableEnd = value;
    }

    /**
     * Gets the value of the recordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.escapia.com/EVRN/2007/02>FormattedTextTextType">
     *       &lt;attribute name="ListItem" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Description
        extends FormattedTextTextType
    {

        @XmlAttribute(name = "ListItem")
        protected BigInteger listItem;

        /**
         * Gets the value of the listItem property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getListItem() {
            return listItem;
        }

        /**
         * Sets the value of the listItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setListItem(BigInteger value) {
            this.listItem = value;
        }

    }

}
