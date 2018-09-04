
package com.escapia.evrn._2007._02;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ImageDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageFormat" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.escapia.com/EVRN/2007/02}ImageItemType">
 *                 &lt;attribute name="ContentID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CopyrightNotice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CopyrightOwner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CopyrightStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CopyrightEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EffectiveStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EffectiveEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ApplicableStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ApplicableEnd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RecordID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                 &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="DimensionCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsOriginalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.escapia.com/EVRN/2007/02>FormattedTextTextType">
 *                 &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDescriptionType", propOrder = {
    "imageFormat",
    "description"
})
@XmlSeeAlso({
    com.escapia.evrn._2007._02.ImageItemsType.ImageItem.class
})
public class ImageDescriptionType {

    @XmlElement(name = "ImageFormat")
    protected List<ImageDescriptionType.ImageFormat> imageFormat;
    @XmlElement(name = "Description")
    protected List<ImageDescriptionType.Description> description;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * Gets the value of the imageFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageDescriptionType.ImageFormat }
     * 
     * 
     */
    public List<ImageDescriptionType.ImageFormat> getImageFormat() {
        if (imageFormat == null) {
            imageFormat = new ArrayList<ImageDescriptionType.ImageFormat>();
        }
        return this.imageFormat;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageDescriptionType.Description }
     * 
     * 
     */
    public List<ImageDescriptionType.Description> getDescription() {
        if (description == null) {
            description = new ArrayList<ImageDescriptionType.Description>();
        }
        return this.description;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.escapia.com/EVRN/2007/02>FormattedTextTextType">
     *       &lt;attribute name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" />
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

        @XmlAttribute(name = "Caption")
        protected String caption;

        /**
         * Gets the value of the caption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaption() {
            return caption;
        }

        /**
         * Sets the value of the caption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaption(String value) {
            this.caption = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}ImageItemType">
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
     *       &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="DimensionCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsOriginalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ImageFormat
        extends ImageItemType
    {

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
        @XmlAttribute(name = "Format")
        protected String format;
        @XmlAttribute(name = "FileName")
        protected String fileName;
        @XmlAttribute(name = "FileSize")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger fileSize;
        @XmlAttribute(name = "DimensionCategory")
        protected String dimensionCategory;
        @XmlAttribute(name = "IsOriginalIndicator")
        protected Boolean isOriginalIndicator;

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
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }

        /**
         * Gets the value of the fileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFileName() {
            return fileName;
        }

        /**
         * Sets the value of the fileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFileName(String value) {
            this.fileName = value;
        }

        /**
         * Gets the value of the fileSize property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFileSize() {
            return fileSize;
        }

        /**
         * Sets the value of the fileSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFileSize(BigInteger value) {
            this.fileSize = value;
        }

        /**
         * Gets the value of the dimensionCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimensionCategory() {
            return dimensionCategory;
        }

        /**
         * Sets the value of the dimensionCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimensionCategory(String value) {
            this.dimensionCategory = value;
        }

        /**
         * Gets the value of the isOriginalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsOriginalIndicator() {
            return isOriginalIndicator;
        }

        /**
         * Sets the value of the isOriginalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsOriginalIndicator(Boolean value) {
            this.isOriginalIndicator = value;
        }

    }

}
