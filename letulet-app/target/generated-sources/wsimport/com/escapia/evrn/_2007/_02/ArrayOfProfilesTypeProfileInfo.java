
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfilesTypeProfileInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfilesTypeProfileInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" type="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="Profile" type="{http://www.escapia.com/EVRN/2007/02}ProfileType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfilesTypeProfileInfo", propOrder = {
    "profileInfo"
})
public class ArrayOfProfilesTypeProfileInfo {

    @XmlElement(name = "ProfileInfo")
    protected List<ArrayOfProfilesTypeProfileInfo.ProfileInfo> profileInfo;

    /**
     * Gets the value of the profileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfProfilesTypeProfileInfo.ProfileInfo }
     * 
     * 
     */
    public List<ArrayOfProfilesTypeProfileInfo.ProfileInfo> getProfileInfo() {
        if (profileInfo == null) {
            profileInfo = new ArrayList<ArrayOfProfilesTypeProfileInfo.ProfileInfo>();
        }
        return this.profileInfo;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UniqueID" type="{http://www.escapia.com/EVRN/2007/02}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="Profile" type="{http://www.escapia.com/EVRN/2007/02}ProfileType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uniqueID",
        "profile"
    })
    public static class ProfileInfo {

        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;
        @XmlElement(name = "Profile")
        protected ProfileType profile;

        /**
         * Gets the value of the uniqueID property.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * Sets the value of the uniqueID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
        }

        /**
         * Gets the value of the profile property.
         * 
         * @return
         *     possible object is
         *     {@link ProfileType }
         *     
         */
        public ProfileType getProfile() {
            return profile;
        }

        /**
         * Sets the value of the profile property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileType }
         *     
         */
        public void setProfile(ProfileType value) {
            this.profile = value;
        }

    }

}
