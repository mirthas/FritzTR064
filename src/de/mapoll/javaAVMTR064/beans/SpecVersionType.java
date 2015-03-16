//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.03.11 um 12:26:24 PM CET 
//


package de.mapoll.javaAVMTR064.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für specVersionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="specVersionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specVersionType", propOrder = {
    "major",
    "minor"
})
public class SpecVersionType {

    protected byte major;
    protected byte minor;

    /**
     * Ruft den Wert der major-Eigenschaft ab.
     * 
     */
    public byte getMajor() {
        return major;
    }

    /**
     * Legt den Wert der major-Eigenschaft fest.
     * 
     */
    public void setMajor(byte value) {
        this.major = value;
    }

    /**
     * Ruft den Wert der minor-Eigenschaft ab.
     * 
     */
    public byte getMinor() {
        return minor;
    }

    /**
     * Legt den Wert der minor-Eigenschaft fest.
     * 
     */
    public void setMinor(byte value) {
        this.minor = value;
    }

}
