
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userNameToken" type="{http://entity.service.common.scb}UserNameToken" minOccurs="0"/&gt;
 *         &lt;element name="consumerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consumerCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHeader", namespace = "http://entity.service.common.scb", propOrder = {
    "userNameToken",
    "consumerID",
    "consumerCountry",
    "serviceTimeStamp",
    "requestID",
    "targetFlag"
})
public class ServiceHeader {

    @XmlElementRef(name = "userNameToken", namespace = "http://entity.service.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<UserNameToken> userNameToken;
    @XmlElementRef(name = "consumerID", namespace = "http://entity.service.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerID;
    @XmlElementRef(name = "consumerCountry", namespace = "http://entity.service.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerCountry;
    @XmlElementRef(name = "serviceTimeStamp", namespace = "http://entity.service.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceTimeStamp;
    @XmlElementRef(name = "requestID", namespace = "http://entity.service.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestID;
    @XmlElementRef(name = "targetFlag", namespace = "http://entity.service.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetFlag;

    /**
     * Gets the value of the userNameToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserNameToken }{@code >}
     *     
     */
    public JAXBElement<UserNameToken> getUserNameToken() {
        return userNameToken;
    }

    /**
     * Sets the value of the userNameToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserNameToken }{@code >}
     *     
     */
    public void setUserNameToken(JAXBElement<UserNameToken> value) {
        this.userNameToken = value;
    }

    /**
     * Gets the value of the consumerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerID() {
        return consumerID;
    }

    /**
     * Sets the value of the consumerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerID(JAXBElement<String> value) {
        this.consumerID = value;
    }

    /**
     * Gets the value of the consumerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerCountry() {
        return consumerCountry;
    }

    /**
     * Sets the value of the consumerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerCountry(JAXBElement<String> value) {
        this.consumerCountry = value;
    }

    /**
     * Gets the value of the serviceTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceTimeStamp() {
        return serviceTimeStamp;
    }

    /**
     * Sets the value of the serviceTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceTimeStamp(JAXBElement<String> value) {
        this.serviceTimeStamp = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestID(JAXBElement<String> value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the targetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetFlag() {
        return targetFlag;
    }

    /**
     * Sets the value of the targetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetFlag(JAXBElement<String> value) {
        this.targetFlag = value;
    }

}
