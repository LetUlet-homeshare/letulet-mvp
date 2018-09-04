
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultimediaDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultimediaDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ImageItems" type="{http://www.escapia.com/EVRN/2007/02}ImageItemsType" minOccurs="0"/>
 *           &lt;element name="TextItems" type="{http://www.escapia.com/EVRN/2007/02}TextItemsType" minOccurs="0"/>
 *           &lt;element name="VideoItems" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.escapia.com/EVRN/2007/02}VideoItemsType">
 *                   &lt;attribute name="MoreData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaDescriptionType", propOrder = {
    "imageItems",
    "textItems",
    "videoItems"
})
public class MultimediaDescriptionType {

    @XmlElement(name = "ImageItems")
    protected ImageItemsType imageItems;
    @XmlElement(name = "TextItems")
    protected TextItemsType textItems;
    @XmlElement(name = "VideoItems")
    protected MultimediaDescriptionType.VideoItems videoItems;

    /**
     * Gets the value of the imageItems property.
     * 
     * @return
     *     possible object is
     *     {@link ImageItemsType }
     *     
     */
    public ImageItemsType getImageItems() {
        return imageItems;
    }

    /**
     * Sets the value of the imageItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageItemsType }
     *     
     */
    public void setImageItems(ImageItemsType value) {
        this.imageItems = value;
    }

    /**
     * Gets the value of the textItems property.
     * 
     * @return
     *     possible object is
     *     {@link TextItemsType }
     *     
     */
    public TextItemsType getTextItems() {
        return textItems;
    }

    /**
     * Sets the value of the textItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextItemsType }
     *     
     */
    public void setTextItems(TextItemsType value) {
        this.textItems = value;
    }

    /**
     * Gets the value of the videoItems property.
     * 
     * @return
     *     possible object is
     *     {@link MultimediaDescriptionType.VideoItems }
     *     
     */
    public MultimediaDescriptionType.VideoItems getVideoItems() {
        return videoItems;
    }

    /**
     * Sets the value of the videoItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaDescriptionType.VideoItems }
     *     
     */
    public void setVideoItems(MultimediaDescriptionType.VideoItems value) {
        this.videoItems = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}VideoItemsType">
     *       &lt;attribute name="MoreData" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoItems
        extends VideoItemsType
    {

        @XmlAttribute(name = "MoreData")
        protected Boolean moreData;

        /**
         * Gets the value of the moreData property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoreData() {
            return moreData;
        }

        /**
         * Sets the value of the moreData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoreData(Boolean value) {
            this.moreData = value;
        }

    }

}
