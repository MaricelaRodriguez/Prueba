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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UpdateOfferUserFieldsRq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UpdateOfferUserFieldsRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}RequestingChannel"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}WaveID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CustomerNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}AccountNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CardNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ProductCode"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField4" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField6" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField7" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField8" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField9" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField10" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField11" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField12" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField13" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField14" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField15" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField16" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField17" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField18" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField19" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField20" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField21" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField22" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField23" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField24" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField25" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField26" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField27" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField28" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField29" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}UserField30" minOccurs="0"/&gt;
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
@XmlType(name = "UpdateOfferUserFieldsRq", namespace = "http://www.citi.com/gcgi/services/common/MX/channels/v3_0_MX_0", propOrder = {
    "requestingChannel",
    "campaignID",
    "waveID",
    "customerNo",
    "accountNo",
    "cardNumber",
    "productCode",
    "userField1",
    "userField2",
    "userField3",
    "userField4",
    "userField5",
    "userField6",
    "userField7",
    "userField8",
    "userField9",
    "userField10",
    "userField11",
    "userField12",
    "userField13",
    "userField14",
    "userField15",
    "userField16",
    "userField17",
    "userField18",
    "userField19",
    "userField20",
    "userField21",
    "userField22",
    "userField23",
    "userField24",
    "userField25",
    "userField26",
    "userField27",
    "userField28",
    "userField29",
    "userField30",
    "controlField"
})
public class UpdateOfferUserFieldsRq {

    @XmlElement(name = "RequestingChannel", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0", required = true)
    protected String requestingChannel;
    @XmlElement(name = "CampaignID", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String campaignID;
    @XmlElement(name = "WaveID", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String waveID;
    @XmlElement(name = "CustomerNo", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String customerNo;
    @XmlElement(name = "AccountNo", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String accountNo;
    @XmlElement(name = "CardNumber", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String cardNumber;
    @XmlElement(name = "ProductCode", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0", required = true)
    protected String productCode;
    @XmlElement(name = "UserField1", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField1;
    @XmlElement(name = "UserField2", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField2;
    @XmlElement(name = "UserField3", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField3;
    @XmlElement(name = "UserField4", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField4;
    @XmlElement(name = "UserField5", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField5;
    @XmlElement(name = "UserField6", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField6;
    @XmlElement(name = "UserField7", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField7;
    @XmlElement(name = "UserField8", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField8;
    @XmlElement(name = "UserField9", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField9;
    @XmlElement(name = "UserField10", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField10;
    @XmlElement(name = "UserField11", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField11;
    @XmlElement(name = "UserField12", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField12;
    @XmlElement(name = "UserField13", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField13;
    @XmlElement(name = "UserField14", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField14;
    @XmlElement(name = "UserField15", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField15;
    @XmlElement(name = "UserField16", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField16;
    @XmlElement(name = "UserField17", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField17;
    @XmlElement(name = "UserField18", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField18;
    @XmlElement(name = "UserField19", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField19;
    @XmlElement(name = "UserField20", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField20;
    @XmlElement(name = "UserField21", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField21;
    @XmlElement(name = "UserField22", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField22;
    @XmlElement(name = "UserField23", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField23;
    @XmlElement(name = "UserField24", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField24;
    @XmlElement(name = "UserField25", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField25;
    @XmlElement(name = "UserField26", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField26;
    @XmlElement(name = "UserField27", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField27;
    @XmlElement(name = "UserField28", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField28;
    @XmlElement(name = "UserField29", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField29;
    @XmlElement(name = "UserField30", namespace = "http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0")
    protected String userField30;
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
     * Obtiene el valor de la propiedad productCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Define el valor de la propiedad productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Obtiene el valor de la propiedad userField1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField1() {
        return userField1;
    }

    /**
     * Define el valor de la propiedad userField1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField1(String value) {
        this.userField1 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField2() {
        return userField2;
    }

    /**
     * Define el valor de la propiedad userField2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField2(String value) {
        this.userField2 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField3() {
        return userField3;
    }

    /**
     * Define el valor de la propiedad userField3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField3(String value) {
        this.userField3 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField4() {
        return userField4;
    }

    /**
     * Define el valor de la propiedad userField4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField4(String value) {
        this.userField4 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField5() {
        return userField5;
    }

    /**
     * Define el valor de la propiedad userField5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField5(String value) {
        this.userField5 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField6() {
        return userField6;
    }

    /**
     * Define el valor de la propiedad userField6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField6(String value) {
        this.userField6 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField7() {
        return userField7;
    }

    /**
     * Define el valor de la propiedad userField7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField7(String value) {
        this.userField7 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField8() {
        return userField8;
    }

    /**
     * Define el valor de la propiedad userField8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField8(String value) {
        this.userField8 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField9() {
        return userField9;
    }

    /**
     * Define el valor de la propiedad userField9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField9(String value) {
        this.userField9 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField10() {
        return userField10;
    }

    /**
     * Define el valor de la propiedad userField10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField10(String value) {
        this.userField10 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField11.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField11() {
        return userField11;
    }

    /**
     * Define el valor de la propiedad userField11.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField11(String value) {
        this.userField11 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField12() {
        return userField12;
    }

    /**
     * Define el valor de la propiedad userField12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField12(String value) {
        this.userField12 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField13() {
        return userField13;
    }

    /**
     * Define el valor de la propiedad userField13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField13(String value) {
        this.userField13 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField14() {
        return userField14;
    }

    /**
     * Define el valor de la propiedad userField14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField14(String value) {
        this.userField14 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField15() {
        return userField15;
    }

    /**
     * Define el valor de la propiedad userField15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField15(String value) {
        this.userField15 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField16.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField16() {
        return userField16;
    }

    /**
     * Define el valor de la propiedad userField16.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField16(String value) {
        this.userField16 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField17.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField17() {
        return userField17;
    }

    /**
     * Define el valor de la propiedad userField17.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField17(String value) {
        this.userField17 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField18.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField18() {
        return userField18;
    }

    /**
     * Define el valor de la propiedad userField18.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField18(String value) {
        this.userField18 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField19.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField19() {
        return userField19;
    }

    /**
     * Define el valor de la propiedad userField19.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField19(String value) {
        this.userField19 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField20() {
        return userField20;
    }

    /**
     * Define el valor de la propiedad userField20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField20(String value) {
        this.userField20 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField21.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField21() {
        return userField21;
    }

    /**
     * Define el valor de la propiedad userField21.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField21(String value) {
        this.userField21 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField22.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField22() {
        return userField22;
    }

    /**
     * Define el valor de la propiedad userField22.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField22(String value) {
        this.userField22 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField23.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField23() {
        return userField23;
    }

    /**
     * Define el valor de la propiedad userField23.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField23(String value) {
        this.userField23 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField24.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField24() {
        return userField24;
    }

    /**
     * Define el valor de la propiedad userField24.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField24(String value) {
        this.userField24 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField25.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField25() {
        return userField25;
    }

    /**
     * Define el valor de la propiedad userField25.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField25(String value) {
        this.userField25 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField26.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField26() {
        return userField26;
    }

    /**
     * Define el valor de la propiedad userField26.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField26(String value) {
        this.userField26 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField27.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField27() {
        return userField27;
    }

    /**
     * Define el valor de la propiedad userField27.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField27(String value) {
        this.userField27 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField28.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField28() {
        return userField28;
    }

    /**
     * Define el valor de la propiedad userField28.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField28(String value) {
        this.userField28 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField29.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField29() {
        return userField29;
    }

    /**
     * Define el valor de la propiedad userField29.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField29(String value) {
        this.userField29 = value;
    }

    /**
     * Obtiene el valor de la propiedad userField30.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserField30() {
        return userField30;
    }

    /**
     * Define el valor de la propiedad userField30.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserField30(String value) {
        this.userField30 = value;
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
