//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.03.11 um 12:26:24 PM CET 
//


package de.mapoll.javaAVMTR064.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für scpdType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="scpdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specVersion" type="{urn:dslforum-org:service-1-0}specVersionType"/&gt;
 *         &lt;element name="actionList" type="{urn:dslforum-org:service-1-0}actionListType"/&gt;
 *         &lt;element name="serviceStateTable" type="{urn:dslforum-org:service-1-0}serviceStateTableType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "scpd", namespace="urn:dslforum-org:service-1-0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scpdType", propOrder = {
    "specVersion",
    "actionList",
    "serviceStateTable"
})
public class ScpdType {

    @XmlElement(required = true)
    protected SpecVersionType specVersion;
    @XmlElement(required = true)
    protected ActionListType actionList;
    @XmlElement(required = true)
    protected ServiceStateTableType serviceStateTable;

    /**
     * Ruft den Wert der specVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpecVersionType }
     *     
     */
    public SpecVersionType getSpecVersion() {
        return specVersion;
    }

    /**
     * Legt den Wert der specVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecVersionType }
     *     
     */
    public void setSpecVersion(SpecVersionType value) {
        this.specVersion = value;
    }

    /**
     * Ruft den Wert der actionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionListType }
     *     
     */
    public ActionListType getActionList() {
        return actionList;
    }

    /**
     * Legt den Wert der actionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionListType }
     *     
     */
    public void setActionList(ActionListType value) {
        this.actionList = value;
    }

    /**
     * Ruft den Wert der serviceStateTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStateTableType }
     *     
     */
    public ServiceStateTableType getServiceStateTable() {
        return serviceStateTable;
    }

    /**
     * Legt den Wert der serviceStateTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStateTableType }
     *     
     */
    public void setServiceStateTable(ServiceStateTableType value) {
        this.serviceStateTable = value;
    }

}
