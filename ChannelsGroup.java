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
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ChannelId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}Status" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}Priority" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}SalesScriptID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}SalesScriptText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}PreFulfillmentID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UpdateDateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ControlField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "channelId",
    "status",
    "priority",
    "salesScriptID",
    "salesScriptText",
    "preFulfillmentID",
    "updateDateTime",
    "controlField"
})
@XmlRootElement(name = "ChannelsGroup")
public class ChannelsGroup {

    @XmlElement(name = "ChannelId")
    protected String channelId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "SalesScriptID")
    protected String salesScriptID;
    @XmlElement(name = "SalesScriptText")
    protected String salesScriptText;
    @XmlElement(name = "PreFulfillmentID")
    protected String preFulfillmentID;
    @XmlElement(name = "UpdateDateTime")
    protected String updateDateTime;
    @XmlElement(name = "ControlField")
    protected List<String> controlField;

    /**
     * Obtiene el valor de la propiedad channelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Define el valor de la propiedad channelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Obtiene el valor de la propiedad salesScriptID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesScriptID() {
        return salesScriptID;
    }

    /**
     * Define el valor de la propiedad salesScriptID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesScriptID(String value) {
        this.salesScriptID = value;
    }

    /**
     * Obtiene el valor de la propiedad salesScriptText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesScriptText() {
        return salesScriptText;
    }

    /**
     * Define el valor de la propiedad salesScriptText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesScriptText(String value) {
        this.salesScriptText = value;
    }

    /**
     * Obtiene el valor de la propiedad preFulfillmentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreFulfillmentID() {
        return preFulfillmentID;
    }

    /**
     * Define el valor de la propiedad preFulfillmentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreFulfillmentID(String value) {
        this.preFulfillmentID = value;
    }

    /**
     * Obtiene el valor de la propiedad updateDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Define el valor de la propiedad updateDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDateTime(String value) {
        this.updateDateTime = value;
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

}
