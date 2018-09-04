
package com.escapia.evrn._2007._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPref" type="{http://www.escapia.com/EVRN/2007/02}LoyaltyPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentFormPref" type="{http://www.escapia.com/EVRN/2007/02}PaymentFormPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelChainPref" type="{http://www.escapia.com/EVRN/2007/02}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyNamePref" type="{http://www.escapia.com/EVRN/2007/02}PropertyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyLocationPref" type="{http://www.escapia.com/EVRN/2007/02}PropertyLocationPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyTypePref" type="{http://www.escapia.com/EVRN/2007/02}PropertyTypePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyClassPref" type="{http://www.escapia.com/EVRN/2007/02}PropertyClassPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyAmenityPref" type="{http://www.escapia.com/EVRN/2007/02}PropertyAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomAmenityPref" type="{http://www.escapia.com/EVRN/2007/02}RoomAmenityPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomLocationPref" type="{http://www.escapia.com/EVRN/2007/02}RoomLocationPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BedTypePref" type="{http://www.escapia.com/EVRN/2007/02}BedTypePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FoodSrvcPref" type="{http://www.escapia.com/EVRN/2007/02}FoodSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MediaEntertainPref" type="{http://www.escapia.com/EVRN/2007/02}MediaEntertainPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PetInfoPref" type="{http://www.escapia.com/EVRN/2007/02}PetInfoPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.escapia.com/EVRN/2007/02}MealPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecreationSrvcPref" type="{http://www.escapia.com/EVRN/2007/02}RecreationSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessSrvcPref" type="{http://www.escapia.com/EVRN/2007/02}BusinessSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonalSrvcPref" type="{http://www.escapia.com/EVRN/2007/02}PersonalSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecurityFeaturePref" type="{http://www.escapia.com/EVRN/2007/02}SecurityFeaturePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysChallFeaturePref" type="{http://www.escapia.com/EVRN/2007/02}PhysChallFeaturePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecRequestPref" type="{http://www.escapia.com/EVRN/2007/02}SpecRequestPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://www.escapia.com/EVRN/2007/02}TPA_Extensions_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PreferLevel" type="{http://www.escapia.com/EVRN/2007/02}PreferLevelType" default="Preferred" />
 *       &lt;attribute name="ShareSynchInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShareMarketInd">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="Inherit"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelGuestType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPrefType", propOrder = {
    "loyaltyPref",
    "paymentFormPref",
    "hotelChainPref",
    "propertyNamePref",
    "propertyLocationPref",
    "propertyTypePref",
    "propertyClassPref",
    "propertyAmenityPref",
    "roomAmenityPref",
    "roomLocationPref",
    "bedTypePref",
    "foodSrvcPref",
    "mediaEntertainPref",
    "petInfoPref",
    "mealPref",
    "recreationSrvcPref",
    "businessSrvcPref",
    "personalSrvcPref",
    "securityFeaturePref",
    "physChallFeaturePref",
    "specRequestPref",
    "tpaExtensions"
})
public class HotelPrefType {

    @XmlElement(name = "LoyaltyPref")
    protected List<LoyaltyPrefType> loyaltyPref;
    @XmlElement(name = "PaymentFormPref")
    protected List<PaymentFormPrefType> paymentFormPref;
    @XmlElement(name = "HotelChainPref")
    protected List<CompanyNamePrefType> hotelChainPref;
    @XmlElement(name = "PropertyNamePref")
    protected List<PropertyNamePrefType> propertyNamePref;
    @XmlElement(name = "PropertyLocationPref")
    protected List<PropertyLocationPrefType> propertyLocationPref;
    @XmlElement(name = "PropertyTypePref")
    protected List<PropertyTypePrefType> propertyTypePref;
    @XmlElement(name = "PropertyClassPref")
    protected List<PropertyClassPrefType> propertyClassPref;
    @XmlElement(name = "PropertyAmenityPref")
    protected List<PropertyAmenityPrefType> propertyAmenityPref;
    @XmlElement(name = "RoomAmenityPref")
    protected List<RoomAmenityPrefType> roomAmenityPref;
    @XmlElement(name = "RoomLocationPref")
    protected List<RoomLocationPrefType> roomLocationPref;
    @XmlElement(name = "BedTypePref")
    protected List<BedTypePrefType> bedTypePref;
    @XmlElement(name = "FoodSrvcPref")
    protected List<FoodSrvcPrefType> foodSrvcPref;
    @XmlElement(name = "MediaEntertainPref")
    protected List<MediaEntertainPrefType> mediaEntertainPref;
    @XmlElement(name = "PetInfoPref")
    protected List<PetInfoPrefType> petInfoPref;
    @XmlElement(name = "MealPref")
    protected List<MealPrefType> mealPref;
    @XmlElement(name = "RecreationSrvcPref")
    protected List<RecreationSrvcPrefType> recreationSrvcPref;
    @XmlElement(name = "BusinessSrvcPref")
    protected List<BusinessSrvcPrefType> businessSrvcPref;
    @XmlElement(name = "PersonalSrvcPref")
    protected List<PersonalSrvcPrefType> personalSrvcPref;
    @XmlElement(name = "SecurityFeaturePref")
    protected List<SecurityFeaturePrefType> securityFeaturePref;
    @XmlElement(name = "PhysChallFeaturePref")
    protected List<PhysChallFeaturePrefType> physChallFeaturePref;
    @XmlElement(name = "SpecRequestPref")
    protected List<SpecRequestPrefType> specRequestPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "HotelGuestType")
    protected String hotelGuestType;

    /**
     * Gets the value of the loyaltyPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPrefType }
     * 
     * 
     */
    public List<LoyaltyPrefType> getLoyaltyPref() {
        if (loyaltyPref == null) {
            loyaltyPref = new ArrayList<LoyaltyPrefType>();
        }
        return this.loyaltyPref;
    }

    /**
     * Gets the value of the paymentFormPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentFormPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentFormPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormPrefType }
     * 
     * 
     */
    public List<PaymentFormPrefType> getPaymentFormPref() {
        if (paymentFormPref == null) {
            paymentFormPref = new ArrayList<PaymentFormPrefType>();
        }
        return this.paymentFormPref;
    }

    /**
     * Gets the value of the hotelChainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelChainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelChainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getHotelChainPref() {
        if (hotelChainPref == null) {
            hotelChainPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.hotelChainPref;
    }

    /**
     * Gets the value of the propertyNamePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyNamePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyNamePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyNamePrefType }
     * 
     * 
     */
    public List<PropertyNamePrefType> getPropertyNamePref() {
        if (propertyNamePref == null) {
            propertyNamePref = new ArrayList<PropertyNamePrefType>();
        }
        return this.propertyNamePref;
    }

    /**
     * Gets the value of the propertyLocationPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyLocationPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyLocationPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyLocationPrefType }
     * 
     * 
     */
    public List<PropertyLocationPrefType> getPropertyLocationPref() {
        if (propertyLocationPref == null) {
            propertyLocationPref = new ArrayList<PropertyLocationPrefType>();
        }
        return this.propertyLocationPref;
    }

    /**
     * Gets the value of the propertyTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyTypePrefType }
     * 
     * 
     */
    public List<PropertyTypePrefType> getPropertyTypePref() {
        if (propertyTypePref == null) {
            propertyTypePref = new ArrayList<PropertyTypePrefType>();
        }
        return this.propertyTypePref;
    }

    /**
     * Gets the value of the propertyClassPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyClassPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyClassPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyClassPrefType }
     * 
     * 
     */
    public List<PropertyClassPrefType> getPropertyClassPref() {
        if (propertyClassPref == null) {
            propertyClassPref = new ArrayList<PropertyClassPrefType>();
        }
        return this.propertyClassPref;
    }

    /**
     * Gets the value of the propertyAmenityPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyAmenityPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyAmenityPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyAmenityPrefType }
     * 
     * 
     */
    public List<PropertyAmenityPrefType> getPropertyAmenityPref() {
        if (propertyAmenityPref == null) {
            propertyAmenityPref = new ArrayList<PropertyAmenityPrefType>();
        }
        return this.propertyAmenityPref;
    }

    /**
     * Gets the value of the roomAmenityPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenityPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenityPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPrefType }
     * 
     * 
     */
    public List<RoomAmenityPrefType> getRoomAmenityPref() {
        if (roomAmenityPref == null) {
            roomAmenityPref = new ArrayList<RoomAmenityPrefType>();
        }
        return this.roomAmenityPref;
    }

    /**
     * Gets the value of the roomLocationPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomLocationPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomLocationPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomLocationPrefType }
     * 
     * 
     */
    public List<RoomLocationPrefType> getRoomLocationPref() {
        if (roomLocationPref == null) {
            roomLocationPref = new ArrayList<RoomLocationPrefType>();
        }
        return this.roomLocationPref;
    }

    /**
     * Gets the value of the bedTypePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedTypePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedTypePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BedTypePrefType }
     * 
     * 
     */
    public List<BedTypePrefType> getBedTypePref() {
        if (bedTypePref == null) {
            bedTypePref = new ArrayList<BedTypePrefType>();
        }
        return this.bedTypePref;
    }

    /**
     * Gets the value of the foodSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodSrvcPrefType }
     * 
     * 
     */
    public List<FoodSrvcPrefType> getFoodSrvcPref() {
        if (foodSrvcPref == null) {
            foodSrvcPref = new ArrayList<FoodSrvcPrefType>();
        }
        return this.foodSrvcPref;
    }

    /**
     * Gets the value of the mediaEntertainPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEntertainPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEntertainPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEntertainPrefType }
     * 
     * 
     */
    public List<MediaEntertainPrefType> getMediaEntertainPref() {
        if (mediaEntertainPref == null) {
            mediaEntertainPref = new ArrayList<MediaEntertainPrefType>();
        }
        return this.mediaEntertainPref;
    }

    /**
     * Gets the value of the petInfoPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfoPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfoPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PetInfoPrefType }
     * 
     * 
     */
    public List<PetInfoPrefType> getPetInfoPref() {
        if (petInfoPref == null) {
            petInfoPref = new ArrayList<PetInfoPrefType>();
        }
        return this.petInfoPref;
    }

    /**
     * Gets the value of the mealPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealPrefType }
     * 
     * 
     */
    public List<MealPrefType> getMealPref() {
        if (mealPref == null) {
            mealPref = new ArrayList<MealPrefType>();
        }
        return this.mealPref;
    }

    /**
     * Gets the value of the recreationSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreationSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreationSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecreationSrvcPrefType }
     * 
     * 
     */
    public List<RecreationSrvcPrefType> getRecreationSrvcPref() {
        if (recreationSrvcPref == null) {
            recreationSrvcPref = new ArrayList<RecreationSrvcPrefType>();
        }
        return this.recreationSrvcPref;
    }

    /**
     * Gets the value of the businessSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessSrvcPrefType }
     * 
     * 
     */
    public List<BusinessSrvcPrefType> getBusinessSrvcPref() {
        if (businessSrvcPref == null) {
            businessSrvcPref = new ArrayList<BusinessSrvcPrefType>();
        }
        return this.businessSrvcPref;
    }

    /**
     * Gets the value of the personalSrvcPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalSrvcPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalSrvcPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalSrvcPrefType }
     * 
     * 
     */
    public List<PersonalSrvcPrefType> getPersonalSrvcPref() {
        if (personalSrvcPref == null) {
            personalSrvcPref = new ArrayList<PersonalSrvcPrefType>();
        }
        return this.personalSrvcPref;
    }

    /**
     * Gets the value of the securityFeaturePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityFeaturePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityFeaturePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityFeaturePrefType }
     * 
     * 
     */
    public List<SecurityFeaturePrefType> getSecurityFeaturePref() {
        if (securityFeaturePref == null) {
            securityFeaturePref = new ArrayList<SecurityFeaturePrefType>();
        }
        return this.securityFeaturePref;
    }

    /**
     * Gets the value of the physChallFeaturePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physChallFeaturePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysChallFeaturePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysChallFeaturePrefType }
     * 
     * 
     */
    public List<PhysChallFeaturePrefType> getPhysChallFeaturePref() {
        if (physChallFeaturePref == null) {
            physChallFeaturePref = new ArrayList<PhysChallFeaturePrefType>();
        }
        return this.physChallFeaturePref;
    }

    /**
     * Gets the value of the specRequestPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specRequestPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecRequestPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecRequestPrefType }
     * 
     * 
     */
    public List<SpecRequestPrefType> getSpecRequestPref() {
        if (specRequestPref == null) {
            specRequestPref = new ArrayList<SpecRequestPrefType>();
        }
        return this.specRequestPref;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * Sets the value of the smokingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the hotelGuestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelGuestType() {
        return hotelGuestType;
    }

    /**
     * Sets the value of the hotelGuestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelGuestType(String value) {
        this.hotelGuestType = value;
    }

}
