
package com.escapia.evrn._2007._02;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ArrayOfUnitInfoTypeService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitInfoTypeService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelativePosition" type="{http://www.escapia.com/EVRN/2007/02}RelativePositionType" minOccurs="0"/>
 *                   &lt;element name="OperationSchedules" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
 *                   &lt;element name="MultimediaDescriptions" type="{http://www.escapia.com/EVRN/2007/02}MultimediaDescriptionsType" minOccurs="0"/>
 *                   &lt;element name="Features" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
 *                   &lt;element name="DescriptiveText" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Rel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ArrayOfUnitInfoTypeService", propOrder = {
    "service"
})
public class ArrayOfUnitInfoTypeService {

    @XmlElement(name = "Service")
    protected List<ArrayOfUnitInfoTypeService.Service> service;

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfUnitInfoTypeService.Service }
     * 
     * 
     */
    public List<ArrayOfUnitInfoTypeService.Service> getService() {
        if (service == null) {
            service = new ArrayList<ArrayOfUnitInfoTypeService.Service>();
        }
        return this.service;
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
     *         &lt;element name="RelativePosition" type="{http://www.escapia.com/EVRN/2007/02}RelativePositionType" minOccurs="0"/>
     *         &lt;element name="OperationSchedules" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule" minOccurs="0"/>
     *         &lt;element name="MultimediaDescriptions" type="{http://www.escapia.com/EVRN/2007/02}MultimediaDescriptionsType" minOccurs="0"/>
     *         &lt;element name="Features" type="{http://www.escapia.com/EVRN/2007/02}ArrayOfFeaturesTypeFeature" minOccurs="0"/>
     *         &lt;element name="DescriptiveText" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Rel" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ExistsCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AvailableToAnyGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProximityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MealPlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MeetingRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relativePosition",
        "operationSchedules",
        "multimediaDescriptions",
        "features",
        "descriptiveText"
    })
    public static class Service {

        @XmlElement(name = "RelativePosition")
        protected RelativePositionType relativePosition;
        @XmlElement(name = "OperationSchedules")
        protected ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule operationSchedules;
        @XmlElement(name = "MultimediaDescriptions")
        protected MultimediaDescriptionsType multimediaDescriptions;
        @XmlElement(name = "Features")
        protected ArrayOfFeaturesTypeFeature features;
        @XmlElement(name = "DescriptiveText")
        protected ArrayOfUnitInfoTypeService.Service.DescriptiveText descriptiveText;
        @XmlAttribute(name = "Included")
        protected Boolean included;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "BusinessServiceCode")
        protected String businessServiceCode;
        @XmlAttribute(name = "ExistsCode")
        protected String existsCode;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "AvailableToAnyGuest")
        protected Boolean availableToAnyGuest;
        @XmlAttribute(name = "InvCode")
        protected String invCode;
        @XmlAttribute(name = "ProximityCode")
        protected String proximityCode;
        @XmlAttribute(name = "MealPlanCode")
        protected String mealPlanCode;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "Sort")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sort;
        @XmlAttribute(name = "MeetingRoomCode")
        protected String meetingRoomCode;

        /**
         * Gets the value of the relativePosition property.
         * 
         * @return
         *     possible object is
         *     {@link RelativePositionType }
         *     
         */
        public RelativePositionType getRelativePosition() {
            return relativePosition;
        }

        /**
         * Sets the value of the relativePosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link RelativePositionType }
         *     
         */
        public void setRelativePosition(RelativePositionType value) {
            this.relativePosition = value;
        }

        /**
         * Gets the value of the operationSchedules property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
         *     
         */
        public ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * Sets the value of the operationSchedules property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule }
         *     
         */
        public void setOperationSchedules(ArrayOfOperationSchedulesPlusChargeTypeOperationSchedule value) {
            this.operationSchedules = value;
        }

        /**
         * Gets the value of the multimediaDescriptions property.
         * 
         * @return
         *     possible object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public MultimediaDescriptionsType getMultimediaDescriptions() {
            return multimediaDescriptions;
        }

        /**
         * Sets the value of the multimediaDescriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultimediaDescriptionsType }
         *     
         */
        public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
            this.multimediaDescriptions = value;
        }

        /**
         * Gets the value of the features property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public ArrayOfFeaturesTypeFeature getFeatures() {
            return features;
        }

        /**
         * Sets the value of the features property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFeaturesTypeFeature }
         *     
         */
        public void setFeatures(ArrayOfFeaturesTypeFeature value) {
            this.features = value;
        }

        /**
         * Gets the value of the descriptiveText property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfUnitInfoTypeService.Service.DescriptiveText }
         *     
         */
        public ArrayOfUnitInfoTypeService.Service.DescriptiveText getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * Sets the value of the descriptiveText property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfUnitInfoTypeService.Service.DescriptiveText }
         *     
         */
        public void setDescriptiveText(ArrayOfUnitInfoTypeService.Service.DescriptiveText value) {
            this.descriptiveText = value;
        }

        /**
         * Gets the value of the included property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncluded() {
            return included;
        }

        /**
         * Sets the value of the included property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncluded(Boolean value) {
            this.included = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the businessServiceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * Sets the value of the businessServiceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

        /**
         * Gets the value of the existsCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExistsCode() {
            return existsCode;
        }

        /**
         * Sets the value of the existsCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExistsCode(String value) {
            this.existsCode = value;
        }

        /**
         * Gets the value of the codeDetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * Sets the value of the codeDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * Gets the value of the availableToAnyGuest property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAvailableToAnyGuest() {
            return availableToAnyGuest;
        }

        /**
         * Sets the value of the availableToAnyGuest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAvailableToAnyGuest(Boolean value) {
            this.availableToAnyGuest = value;
        }

        /**
         * Gets the value of the invCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvCode() {
            return invCode;
        }

        /**
         * Sets the value of the invCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvCode(String value) {
            this.invCode = value;
        }

        /**
         * Gets the value of the proximityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProximityCode() {
            return proximityCode;
        }

        /**
         * Sets the value of the proximityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProximityCode(String value) {
            this.proximityCode = value;
        }

        /**
         * Gets the value of the mealPlanCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMealPlanCode() {
            return mealPlanCode;
        }

        /**
         * Sets the value of the mealPlanCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMealPlanCode(String value) {
            this.mealPlanCode = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the sort property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSort() {
            return sort;
        }

        /**
         * Sets the value of the sort property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSort(BigInteger value) {
            this.sort = value;
        }

        /**
         * Gets the value of the meetingRoomCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeetingRoomCode() {
            return meetingRoomCode;
        }

        /**
         * Sets the value of the meetingRoomCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeetingRoomCode(String value) {
            this.meetingRoomCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Rel" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DescriptiveText {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Rel")
            protected Integer rel;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the rel property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRel() {
                return rel;
            }

            /**
             * Sets the value of the rel property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRel(Integer value) {
                this.rel = value;
            }

        }

    }

}
