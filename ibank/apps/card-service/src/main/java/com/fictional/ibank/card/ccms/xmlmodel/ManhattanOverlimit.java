
package com.fictional.ibank.card.ccms.xmlmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManhattanOverlimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManhattanOverlimit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="manhattanOverlimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manhattanOverlimitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManhattanOverlimit", propOrder = {
    "manhattanOverlimitValue",
    "manhattanOverlimitDate"
})
public class ManhattanOverlimit {

    @XmlElementRef(name = "manhattanOverlimitValue", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manhattanOverlimitValue;
    @XmlElementRef(name = "manhattanOverlimitDate", namespace = "http://entity.cards.common.scb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manhattanOverlimitDate;

    /**
     * Gets the value of the manhattanOverlimitValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManhattanOverlimitValue() {
        return manhattanOverlimitValue;
    }

    /**
     * Sets the value of the manhattanOverlimitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManhattanOverlimitValue(JAXBElement<String> value) {
        this.manhattanOverlimitValue = value;
    }

    /**
     * Gets the value of the manhattanOverlimitDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManhattanOverlimitDate() {
        return manhattanOverlimitDate;
    }

    /**
     * Sets the value of the manhattanOverlimitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManhattanOverlimitDate(JAXBElement<String> value) {
        this.manhattanOverlimitDate = value;
    }

}
