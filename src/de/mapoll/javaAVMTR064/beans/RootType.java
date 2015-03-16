//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.03.11 um 11:50:39 AM CET 
//


package de.mapoll.javaAVMTR064.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für rootType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="rootType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specVersion" type="{urn:dslforum-org:device-1-0}specVersionType"/&gt;
 *         &lt;element name="device" type="{urn:dslforum-org:device-1-0}deviceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "root", namespace="urn:dslforum-org:device-1-0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rootType", propOrder = {
    "specVersion",
    "device"
})
public class RootType {
	
    @XmlElement(required = true)
    protected SpecVersionType specVersion;
    @XmlElement(required = true)
    protected DeviceType device;

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
     * Ruft den Wert der device-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDevice() {
        return device;
    }

    /**
     * Legt den Wert der device-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDevice(DeviceType value) {
        this.device = value;
    }

}
