
package com.siebel.xml.siebelsearchdoindex_output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoIndex_Status complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DoIndex_Status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoIndex_Status", propOrder = { "errorStatus" })
public class DoIndexStatus {

    @XmlElement(name = "ErrorStatus")
    protected String errorStatus;

    /**
     * Gets the value of the errorStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorStatus() {
        return errorStatus;
    }

    /**
     * Sets the value of the errorStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorStatus(String value) {
        this.errorStatus = value;
    }

}
