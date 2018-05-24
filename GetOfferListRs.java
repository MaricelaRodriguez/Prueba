//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.23 a las 11:25:11 PM CDT 
//


package com.example.howtodoinjava.schemas.school;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetOfferListRs complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetOfferListRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ResponseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ResponseText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ControlField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ChannelOfferListGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOfferListRs", namespace = "http://www.citi.com/gcgi/services/common/MX/channels/v3_0_MX_0", propOrder = {
    "responseCode",
    "responseText",
    "controlField",
    "channelOfferListGroup"
})
@XmlRootElement(name = "GetOfferListRs")
public class GetOfferListRs {

    @XmlElement(name = "ResponseCode", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String responseCode;
    @XmlElement(name = "ResponseText", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String responseText;
    @XmlElement(name = "ControlField", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected List<String> controlField;
    @XmlElement(name = "ChannelOfferListGroup", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected List<ChannelOfferListGroup> channelOfferListGroup;

    /**
     * Obtiene el valor de la propiedad responseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Define el valor de la propiedad responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad responseText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Define el valor de la propiedad responseText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

    /**
     * Gets the value of the controlField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getControlField() {
        if (controlField == null) {
            controlField = new ArrayList<String>();
        }
        return this.controlField;
    }

    /**
     * Gets the value of the channelOfferListGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelOfferListGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelOfferListGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelOfferListGroup }
     * 
     * 
     */
    public List<ChannelOfferListGroup> getChannelOfferListGroup() {
        if (channelOfferListGroup == null) {
            channelOfferListGroup = new ArrayList<ChannelOfferListGroup>();
        }
        return this.channelOfferListGroup;
    }

}
