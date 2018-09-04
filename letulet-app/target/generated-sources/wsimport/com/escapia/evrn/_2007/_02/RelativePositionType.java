
package com.escapia.evrn._2007._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativePositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativePositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.escapia.com/EVRN/2007/02}TransportationsType">
 *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DistanceUnitName" type="{http://www.escapia.com/EVRN/2007/02}DistanceUnitNameType" />
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Nearest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IndexPointCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrimaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ToFrom">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ToFacility"/>
 *             &lt;enumeration value="FromFacility"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ApproximateDistanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePositionType")
public class RelativePositionType
    extends TransportationsType
{

    @XmlAttribute(name = "Direction")
    protected String direction;
    @XmlAttribute(name = "Distance")
    protected String distance;
    @XmlAttribute(name = "DistanceUnitName")
    protected DistanceUnitNameType distanceUnitName;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "Nearest")
    protected Boolean nearest;
    @XmlAttribute(name = "IndexPointCode")
    protected String indexPointCode;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "PrimaryIndicator")
    protected Boolean primaryIndicator;
    @XmlAttribute(name = "ToFrom")
    protected String toFrom;
    @XmlAttribute(name = "ApproximateDistanceInd")
    protected Boolean approximateDistanceInd;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the distanceUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public DistanceUnitNameType getDistanceUnitName() {
        return distanceUnitName;
    }

    /**
     * Sets the value of the distanceUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public void setDistanceUnitName(DistanceUnitNameType value) {
        this.distanceUnitName = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * Gets the value of the nearest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNearest() {
        return nearest;
    }

    /**
     * Sets the value of the nearest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNearest(Boolean value) {
        this.nearest = value;
    }

    /**
     * Gets the value of the indexPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexPointCode() {
        return indexPointCode;
    }

    /**
     * Sets the value of the indexPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexPointCode(String value) {
        this.indexPointCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the primaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * Sets the value of the primaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

    /**
     * Gets the value of the toFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToFrom() {
        return toFrom;
    }

    /**
     * Sets the value of the toFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToFrom(String value) {
        this.toFrom = value;
    }

    /**
     * Gets the value of the approximateDistanceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateDistanceInd() {
        return approximateDistanceInd;
    }

    /**
     * Sets the value of the approximateDistanceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateDistanceInd(Boolean value) {
        this.approximateDistanceInd = value;
    }

}
