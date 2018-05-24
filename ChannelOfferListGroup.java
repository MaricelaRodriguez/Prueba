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
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignMode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CampaignCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}WaveID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}WaveDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CustomerNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}AccountNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CardNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ProductCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ProductType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}InboundPayout" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}OutboundPayout" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}EMIIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}BlueBandProduct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}PartialFulfillmentInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}OfferPriority" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}OfferStartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}OfferEndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}GreatestOfferStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}LatestOfferStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}ChannelsGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}RegionID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}DivisionID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}AreaID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}BranchID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}DepartmentID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}WorkgroupID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}AgentID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}AppointmentDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}AppointmentStartTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}AppointmentEndTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}OfferAvailability" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}OfferFlagGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}Sysversion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}OfferCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}RMCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CRMProductCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CRMProductDescripion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}BufferDays" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}FullFillmentProcessID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}CustomerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.citi.com/gcgi/entities/common/MX/basetypes/v3_0_MX_0}LocationIndicator" minOccurs="0"/&gt;
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
    "campaignID",
    "campaignDesc",
    "campaignType",
    "campaignMode",
    "campaignCategory",
    "waveID",
    "waveDescription",
    "customerNo",
    "accountNo",
    "cardNumber",
    "productCategory",
    "productType",
    "inboundPayout",
    "outboundPayout",
    "emiIndicator",
    "blueBandProduct",
    "partialFulfillmentInd",
    "offerPriority",
    "offerStartDate",
    "offerEndDate",
    "greatestOfferStatus",
    "latestOfferStatus",
    "channelsGroup",
    "regionID",
    "divisionID",
    "areaID",
    "branchID",
    "departmentID",
    "workgroupID",
    "agentID",
    "appointmentDate",
    "appointmentStartTime",
    "appointmentEndTime",
    "offerAvailability",
    "offerFlagGroup",
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
    "sysversion",
    "offerCategory",
    "rmCode",
    "crmProductCode",
    "crmProductDescripion",
    "bufferDays",
    "fullFillmentProcessID",
    "customerName",
    "locationIndicator",
    "controlField"
})
@XmlRootElement(name = "ChannelOfferListGroup")
public class ChannelOfferListGroup {

    @XmlElement(name = "CampaignID")
    protected String campaignID;
    @XmlElement(name = "CampaignDesc")
    protected String campaignDesc;
    @XmlElement(name = "CampaignType")
    protected String campaignType;
    @XmlElement(name = "CampaignMode")
    protected String campaignMode;
    @XmlElement(name = "CampaignCategory")
    protected String campaignCategory;
    @XmlElement(name = "WaveID")
    protected String waveID;
    @XmlElement(name = "WaveDescription")
    protected String waveDescription;
    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "AccountNo")
    protected String accountNo;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "ProductCategory")
    protected String productCategory;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "InboundPayout")
    protected String inboundPayout;
    @XmlElement(name = "OutboundPayout")
    protected String outboundPayout;
    @XmlElement(name = "EMIIndicator")
    protected String emiIndicator;
    @XmlElement(name = "BlueBandProduct")
    protected String blueBandProduct;
    @XmlElement(name = "PartialFulfillmentInd")
    protected String partialFulfillmentInd;
    @XmlElement(name = "OfferPriority")
    protected String offerPriority;
    @XmlElement(name = "OfferStartDate")
    protected String offerStartDate;
    @XmlElement(name = "OfferEndDate")
    protected String offerEndDate;
    @XmlElement(name = "GreatestOfferStatus")
    protected String greatestOfferStatus;
    @XmlElement(name = "LatestOfferStatus")
    protected String latestOfferStatus;
    @XmlElement(name = "ChannelsGroup")
    protected List<ChannelsGroup> channelsGroup;
    @XmlElement(name = "RegionID")
    protected String regionID;
    @XmlElement(name = "DivisionID")
    protected String divisionID;
    @XmlElement(name = "AreaID")
    protected String areaID;
    @XmlElement(name = "BranchID")
    protected String branchID;
    @XmlElement(name = "DepartmentID")
    protected String departmentID;
    @XmlElement(name = "WorkgroupID")
    protected String workgroupID;
    @XmlElement(name = "AgentID")
    protected String agentID;
    @XmlElement(name = "AppointmentDate")
    protected String appointmentDate;
    @XmlElement(name = "AppointmentStartTime")
    protected String appointmentStartTime;
    @XmlElement(name = "AppointmentEndTime")
    protected String appointmentEndTime;
    @XmlElement(name = "OfferAvailability")
    protected String offerAvailability;
    @XmlElement(name = "OfferFlagGroup")
    protected List<OfferFlagGroup> offerFlagGroup;
    @XmlElement(name = "UserField1")
    protected String userField1;
    @XmlElement(name = "UserField2")
    protected String userField2;
    @XmlElement(name = "UserField3")
    protected String userField3;
    @XmlElement(name = "UserField4")
    protected String userField4;
    @XmlElement(name = "UserField5")
    protected String userField5;
    @XmlElement(name = "UserField6")
    protected String userField6;
    @XmlElement(name = "UserField7")
    protected String userField7;
    @XmlElement(name = "UserField8")
    protected String userField8;
    @XmlElement(name = "UserField9")
    protected String userField9;
    @XmlElement(name = "UserField10")
    protected String userField10;
    @XmlElement(name = "UserField11")
    protected String userField11;
    @XmlElement(name = "UserField12")
    protected String userField12;
    @XmlElement(name = "UserField13")
    protected String userField13;
    @XmlElement(name = "UserField14")
    protected String userField14;
    @XmlElement(name = "UserField15")
    protected String userField15;
    @XmlElement(name = "UserField16")
    protected String userField16;
    @XmlElement(name = "UserField17")
    protected String userField17;
    @XmlElement(name = "UserField18")
    protected String userField18;
    @XmlElement(name = "UserField19")
    protected String userField19;
    @XmlElement(name = "UserField20")
    protected String userField20;
    @XmlElement(name = "UserField21")
    protected String userField21;
    @XmlElement(name = "UserField22")
    protected String userField22;
    @XmlElement(name = "UserField23")
    protected String userField23;
    @XmlElement(name = "UserField24")
    protected String userField24;
    @XmlElement(name = "UserField25")
    protected String userField25;
    @XmlElement(name = "UserField26")
    protected String userField26;
    @XmlElement(name = "UserField27")
    protected String userField27;
    @XmlElement(name = "UserField28")
    protected String userField28;
    @XmlElement(name = "UserField29")
    protected String userField29;
    @XmlElement(name = "UserField30")
    protected String userField30;
    @XmlElement(name = "Sysversion")
    protected String sysversion;
    @XmlElement(name = "OfferCategory")
    protected String offerCategory;
    @XmlElement(name = "RMCode")
    protected String rmCode;
    @XmlElement(name = "CRMProductCode")
    protected String crmProductCode;
    @XmlElement(name = "CRMProductDescripion")
    protected String crmProductDescripion;
    @XmlElement(name = "BufferDays")
    protected String bufferDays;
    @XmlElement(name = "FullFillmentProcessID")
    protected String fullFillmentProcessID;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "LocationIndicator")
    protected String locationIndicator;
    @XmlElement(name = "ControlField")
    protected List<String> controlField;

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
     * Obtiene el valor de la propiedad campaignDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignDesc() {
        return campaignDesc;
    }

    /**
     * Define el valor de la propiedad campaignDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignDesc(String value) {
        this.campaignDesc = value;
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
     * Obtiene el valor de la propiedad campaignMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignMode() {
        return campaignMode;
    }

    /**
     * Define el valor de la propiedad campaignMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignMode(String value) {
        this.campaignMode = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignCategory() {
        return campaignCategory;
    }

    /**
     * Define el valor de la propiedad campaignCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignCategory(String value) {
        this.campaignCategory = value;
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
     * Obtiene el valor de la propiedad waveDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaveDescription() {
        return waveDescription;
    }

    /**
     * Define el valor de la propiedad waveDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaveDescription(String value) {
        this.waveDescription = value;
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
     * Obtiene el valor de la propiedad productCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Define el valor de la propiedad productCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad productType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Define el valor de la propiedad productType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Obtiene el valor de la propiedad inboundPayout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundPayout() {
        return inboundPayout;
    }

    /**
     * Define el valor de la propiedad inboundPayout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundPayout(String value) {
        this.inboundPayout = value;
    }

    /**
     * Obtiene el valor de la propiedad outboundPayout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundPayout() {
        return outboundPayout;
    }

    /**
     * Define el valor de la propiedad outboundPayout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundPayout(String value) {
        this.outboundPayout = value;
    }

    /**
     * Obtiene el valor de la propiedad emiIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMIIndicator() {
        return emiIndicator;
    }

    /**
     * Define el valor de la propiedad emiIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMIIndicator(String value) {
        this.emiIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad blueBandProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlueBandProduct() {
        return blueBandProduct;
    }

    /**
     * Define el valor de la propiedad blueBandProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlueBandProduct(String value) {
        this.blueBandProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad partialFulfillmentInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialFulfillmentInd() {
        return partialFulfillmentInd;
    }

    /**
     * Define el valor de la propiedad partialFulfillmentInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialFulfillmentInd(String value) {
        this.partialFulfillmentInd = value;
    }

    /**
     * Obtiene el valor de la propiedad offerPriority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferPriority() {
        return offerPriority;
    }

    /**
     * Define el valor de la propiedad offerPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferPriority(String value) {
        this.offerPriority = value;
    }

    /**
     * Obtiene el valor de la propiedad offerStartDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferStartDate() {
        return offerStartDate;
    }

    /**
     * Define el valor de la propiedad offerStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferStartDate(String value) {
        this.offerStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad offerEndDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferEndDate() {
        return offerEndDate;
    }

    /**
     * Define el valor de la propiedad offerEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferEndDate(String value) {
        this.offerEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad greatestOfferStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreatestOfferStatus() {
        return greatestOfferStatus;
    }

    /**
     * Define el valor de la propiedad greatestOfferStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreatestOfferStatus(String value) {
        this.greatestOfferStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad latestOfferStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestOfferStatus() {
        return latestOfferStatus;
    }

    /**
     * Define el valor de la propiedad latestOfferStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestOfferStatus(String value) {
        this.latestOfferStatus = value;
    }

    /**
     * Gets the value of the channelsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelsGroup }
     * 
     * 
     */
    public List<ChannelsGroup> getChannelsGroup() {
        if (channelsGroup == null) {
            channelsGroup = new ArrayList<ChannelsGroup>();
        }
        return this.channelsGroup;
    }

    /**
     * Obtiene el valor de la propiedad regionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionID() {
        return regionID;
    }

    /**
     * Define el valor de la propiedad regionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionID(String value) {
        this.regionID = value;
    }

    /**
     * Obtiene el valor de la propiedad divisionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionID() {
        return divisionID;
    }

    /**
     * Define el valor de la propiedad divisionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionID(String value) {
        this.divisionID = value;
    }

    /**
     * Obtiene el valor de la propiedad areaID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * Define el valor de la propiedad areaID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
    }

    /**
     * Obtiene el valor de la propiedad branchID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchID() {
        return branchID;
    }

    /**
     * Define el valor de la propiedad branchID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchID(String value) {
        this.branchID = value;
    }

    /**
     * Obtiene el valor de la propiedad departmentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentID() {
        return departmentID;
    }

    /**
     * Define el valor de la propiedad departmentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentID(String value) {
        this.departmentID = value;
    }

    /**
     * Obtiene el valor de la propiedad workgroupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkgroupID() {
        return workgroupID;
    }

    /**
     * Define el valor de la propiedad workgroupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkgroupID(String value) {
        this.workgroupID = value;
    }

    /**
     * Obtiene el valor de la propiedad agentID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * Define el valor de la propiedad agentID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentID(String value) {
        this.agentID = value;
    }

    /**
     * Obtiene el valor de la propiedad appointmentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Define el valor de la propiedad appointmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentDate(String value) {
        this.appointmentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad appointmentStartTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentStartTime() {
        return appointmentStartTime;
    }

    /**
     * Define el valor de la propiedad appointmentStartTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentStartTime(String value) {
        this.appointmentStartTime = value;
    }

    /**
     * Obtiene el valor de la propiedad appointmentEndTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentEndTime() {
        return appointmentEndTime;
    }

    /**
     * Define el valor de la propiedad appointmentEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentEndTime(String value) {
        this.appointmentEndTime = value;
    }

    /**
     * Obtiene el valor de la propiedad offerAvailability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferAvailability() {
        return offerAvailability;
    }

    /**
     * Define el valor de la propiedad offerAvailability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferAvailability(String value) {
        this.offerAvailability = value;
    }

    /**
     * Gets the value of the offerFlagGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerFlagGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferFlagGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferFlagGroup }
     * 
     * 
     */
    public List<OfferFlagGroup> getOfferFlagGroup() {
        if (offerFlagGroup == null) {
            offerFlagGroup = new ArrayList<OfferFlagGroup>();
        }
        return this.offerFlagGroup;
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
     * Obtiene el valor de la propiedad sysversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysversion() {
        return sysversion;
    }

    /**
     * Define el valor de la propiedad sysversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysversion(String value) {
        this.sysversion = value;
    }

    /**
     * Obtiene el valor de la propiedad offerCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCategory() {
        return offerCategory;
    }

    /**
     * Define el valor de la propiedad offerCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCategory(String value) {
        this.offerCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad rmCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMCode() {
        return rmCode;
    }

    /**
     * Define el valor de la propiedad rmCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMCode(String value) {
        this.rmCode = value;
    }

    /**
     * Obtiene el valor de la propiedad crmProductCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRMProductCode() {
        return crmProductCode;
    }

    /**
     * Define el valor de la propiedad crmProductCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRMProductCode(String value) {
        this.crmProductCode = value;
    }

    /**
     * Obtiene el valor de la propiedad crmProductDescripion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRMProductDescripion() {
        return crmProductDescripion;
    }

    /**
     * Define el valor de la propiedad crmProductDescripion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRMProductDescripion(String value) {
        this.crmProductDescripion = value;
    }

    /**
     * Obtiene el valor de la propiedad bufferDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBufferDays() {
        return bufferDays;
    }

    /**
     * Define el valor de la propiedad bufferDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBufferDays(String value) {
        this.bufferDays = value;
    }

    /**
     * Obtiene el valor de la propiedad fullFillmentProcessID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullFillmentProcessID() {
        return fullFillmentProcessID;
    }

    /**
     * Define el valor de la propiedad fullFillmentProcessID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullFillmentProcessID(String value) {
        this.fullFillmentProcessID = value;
    }

    /**
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad locationIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIndicator() {
        return locationIndicator;
    }

    /**
     * Define el valor de la propiedad locationIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIndicator(String value) {
        this.locationIndicator = value;
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
