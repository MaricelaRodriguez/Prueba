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
 * <p>Clase Java para GetOfferListRq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetOfferListRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}RequestingChannel"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}WaveID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}WaveStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CustomerNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}AccountNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CardNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ProductGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}OfferStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CreateDynamicOfferInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}Channels" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}LVCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}SkipStatusForAvailability" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ChannelInput1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ChannelInput2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ChannelInput3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ChannelInput4" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ChannelInput5" minOccurs="0"/&gt;
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
@XmlType(name = "GetOfferListRq", namespace = "http://www.citi.com/gcgi/services/common/MX/channels/v3_0_MX_0", propOrder = {
    "requestingChannel",
    "campaignID",
    "waveID",
    "campaignType",
    "campaignStatus",
    "waveStatus",
    "customerNo",
    "accountNo",
    "cardNumber",
    "productGroup",
    "offerStatus",
    "createDynamicOfferInd",
    "channels",
    "cardIndicator",
    "lvCode",
    "skipStatusForAvailability",
    "channelInput1",
    "channelInput2",
    "channelInput3",
    "channelInput4",
    "channelInput5",
    "controlField"
})
@XmlRootElement(name = "GetOfferListRq")
public class GetOfferListRq {

    @XmlElement(name = "RequestingChannel", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0", required = true)
    protected String requestingChannel;
    @XmlElement(name = "CampaignID", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String campaignID;
    @XmlElement(name = "WaveID", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String waveID;
    @XmlElement(name = "CampaignType", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String campaignType;
    @XmlElement(name = "CampaignStatus", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String campaignStatus;
    @XmlElement(name = "WaveStatus", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String waveStatus;
    @XmlElement(name = "CustomerNo", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String customerNo;
    @XmlElement(name = "AccountNo", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String accountNo;
    @XmlElement(name = "CardNumber", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String cardNumber;
    @XmlElement(name = "ProductGroup", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected List<ProductGroup> productGroup;
    @XmlElement(name = "OfferStatus", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String offerStatus;
    @XmlElement(name = "CreateDynamicOfferInd", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String createDynamicOfferInd;
    @XmlElement(name = "Channels", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String channels;
    @XmlElement(name = "CardIndicator", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String cardIndicator;
    @XmlElement(name = "LVCode", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String lvCode;
    @XmlElement(name = "SkipStatusForAvailability", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String skipStatusForAvailability;
    @XmlElement(name = "ChannelInput1", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String channelInput1;
    @XmlElement(name = "ChannelInput2", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String channelInput2;
    @XmlElement(name = "ChannelInput3", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String channelInput3;
    @XmlElement(name = "ChannelInput4", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String channelInput4;
    @XmlElement(name = "ChannelInput5", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String channelInput5;
    @XmlElement(name = "ControlField", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected List<String> controlField;

    /**
     * Obtiene el valor de la propiedad requestingChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingChannel() {
        return requestingChannel;
    }

    /**
     * Define el valor de la propiedad requestingChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingChannel(String value) {
        this.requestingChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignID() {
        return campaignID;
    }

    /**
     * Define el valor de la propiedad campaignID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignID(String value) {
        this.campaignID = value;
    }

    /**
     * Obtiene el valor de la propiedad waveID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaveID() {
        return waveID;
    }

    /**
     * Define el valor de la propiedad waveID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaveID(String value) {
        this.waveID = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignType() {
        return campaignType;
    }

    /**
     * Define el valor de la propiedad campaignType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignType(String value) {
        this.campaignType = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Define el valor de la propiedad campaignStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignStatus(String value) {
        this.campaignStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad waveStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaveStatus() {
        return waveStatus;
    }

    /**
     * Define el valor de la propiedad waveStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaveStatus(String value) {
        this.waveStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad customerNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Define el valor de la propiedad customerNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
    }

    /**
     * Obtiene el valor de la propiedad accountNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Define el valor de la propiedad accountNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Obtiene el valor de la propiedad cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Define el valor de la propiedad cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the productGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductGroup }
     * 
     * 
     */
    public List<ProductGroup> getProductGroup() {
        if (productGroup == null) {
            productGroup = new ArrayList<ProductGroup>();
        }
        return this.productGroup;
    }

    /**
     * Obtiene el valor de la propiedad offerStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferStatus() {
        return offerStatus;
    }

    /**
     * Define el valor de la propiedad offerStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferStatus(String value) {
        this.offerStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad createDynamicOfferInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDynamicOfferInd() {
        return createDynamicOfferInd;
    }

    /**
     * Define el valor de la propiedad createDynamicOfferInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDynamicOfferInd(String value) {
        this.createDynamicOfferInd = value;
    }

    /**
     * Obtiene el valor de la propiedad channels.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannels() {
        return channels;
    }

    /**
     * Define el valor de la propiedad channels.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannels(String value) {
        this.channels = value;
    }

    /**
     * Obtiene el valor de la propiedad cardIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIndicator() {
        return cardIndicator;
    }

    /**
     * Define el valor de la propiedad cardIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIndicator(String value) {
        this.cardIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad lvCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLVCode() {
        return lvCode;
    }

    /**
     * Define el valor de la propiedad lvCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLVCode(String value) {
        this.lvCode = value;
    }

    /**
     * Obtiene el valor de la propiedad skipStatusForAvailability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipStatusForAvailability() {
        return skipStatusForAvailability;
    }

    /**
     * Define el valor de la propiedad skipStatusForAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipStatusForAvailability(String value) {
        this.skipStatusForAvailability = value;
    }

    /**
     * Obtiene el valor de la propiedad channelInput1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelInput1() {
        return channelInput1;
    }

    /**
     * Define el valor de la propiedad channelInput1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelInput1(String value) {
        this.channelInput1 = value;
    }

    /**
     * Obtiene el valor de la propiedad channelInput2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelInput2() {
        return channelInput2;
    }

    /**
     * Define el valor de la propiedad channelInput2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelInput2(String value) {
        this.channelInput2 = value;
    }

    /**
     * Obtiene el valor de la propiedad channelInput3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelInput3() {
        return channelInput3;
    }

    /**
     * Define el valor de la propiedad channelInput3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelInput3(String value) {
        this.channelInput3 = value;
    }

    /**
     * Obtiene el valor de la propiedad channelInput4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelInput4() {
        return channelInput4;
    }

    /**
     * Define el valor de la propiedad channelInput4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelInput4(String value) {
        this.channelInput4 = value;
    }

    /**
     * Obtiene el valor de la propiedad channelInput5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelInput5() {
        return channelInput5;
    }

    /**
     * Define el valor de la propiedad channelInput5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelInput5(String value) {
        this.channelInput5 = value;
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
