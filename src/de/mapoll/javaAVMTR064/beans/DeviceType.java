/**
 * *********************************************************************************************************************
 *
 * javaAVMTR064 - open source Java TR-064 API
 *===========================================
 *
 * Copyright 2015 Marin Pollmann <pollmann.m@gmail.com>
 *
 * JAXB annotations fixed by Jan Gretza <j.gretza@anetos.de>
 *
 ***********************************************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 **********************************************************************************************************************
 */
package de.mapoll.javaAVMTR064.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für deviceType complex type.
 *
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="deviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="friendlyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="manufacturerURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="modelDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modelURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="UDN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iconList" type="{urn:dslforum-org:device-1-0}iconListType" minOccurs="0"/&gt;
 *         &lt;element name="serviceList" type="{urn:dslforum-org:device-1-0}serviceListType"/&gt;
 *         &lt;element name="deviceList" type="{urn:dslforum-org:device-1-0}deviceListType" minOccurs="0"/&gt;
 *         &lt;element name="presentationURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceType", propOrder = {
    "deviceType",
    "friendlyName",
    "manufacturer",
    "manufacturerURL",
    "modelDescription",
    "modelName",
    "modelNumber",
    "modelURL",
    "udn",
    "upc",
    "iconList",
    "serviceList",
    "deviceList",
    "presentationURL"
})
public class DeviceType {

    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String deviceType;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String friendlyName;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String manufacturer;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    @XmlSchemaType(name = "anyURI")
    protected String manufacturerURL;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String modelDescription;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String modelName;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String modelNumber;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    @XmlSchemaType(name = "anyURI")
    protected String modelURL;
    @XmlElement(name = "UDN", required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String udn;
    @XmlElement(name = "UPC", namespace = "urn:dslforum-org:device-1-0")
    protected String upc;
    @XmlElement(namespace = "urn:dslforum-org:device-1-0")
    protected IconListType iconList;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected ServiceListType serviceList;
    @XmlElement(namespace = "urn:dslforum-org:device-1-0")
    protected DeviceListType deviceList;
    @XmlElement(namespace = "urn:dslforum-org:device-1-0")
    @XmlSchemaType(name = "anyURI")
    protected String presentationURL;

    /**
     * Ruft den Wert der deviceType-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Legt den Wert der deviceType-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Ruft den Wert der friendlyName-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Legt den Wert der friendlyName-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der manufacturerURL-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getManufacturerURL() {
        return manufacturerURL;
    }

    /**
     * Legt den Wert der manufacturerURL-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setManufacturerURL(String value) {
        this.manufacturerURL = value;
    }

    /**
     * Ruft den Wert der modelDescription-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getModelDescription() {
        return modelDescription;
    }

    /**
     * Legt den Wert der modelDescription-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setModelDescription(String value) {
        this.modelDescription = value;
    }

    /**
     * Ruft den Wert der modelName-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Legt den Wert der modelName-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Ruft den Wert der modelNumber-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Legt den Wert der modelNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Ruft den Wert der modelURL-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getModelURL() {
        return modelURL;
    }

    /**
     * Legt den Wert der modelURL-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setModelURL(String value) {
        this.modelURL = value;
    }

    /**
     * Ruft den Wert der udn-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUDN() {
        return udn;
    }

    /**
     * Legt den Wert der udn-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUDN(String value) {
        this.udn = value;
    }

    /**
     * Ruft den Wert der upc-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Legt den Wert der upc-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Ruft den Wert der iconList-Eigenschaft ab.
     *
     * @return possible object is {@link IconListType }
     *
     */
    public IconListType getIconList() {
        return iconList;
    }

    /**
     * Legt den Wert der iconList-Eigenschaft fest.
     *
     * @param value allowed object is {@link IconListType }
     *
     */
    public void setIconList(IconListType value) {
        this.iconList = value;
    }

    /**
     * Ruft den Wert der serviceList-Eigenschaft ab.
     *
     * @return possible object is {@link ServiceListType }
     *
     */
    public ServiceListType getServiceList() {
        return serviceList;
    }

    /**
     * Legt den Wert der serviceList-Eigenschaft fest.
     *
     * @param value allowed object is {@link ServiceListType }
     *
     */
    public void setServiceList(ServiceListType value) {
        this.serviceList = value;
    }

    /**
     * Ruft den Wert der deviceList-Eigenschaft ab.
     *
     * @return possible object is {@link DeviceListType }
     *
     */
    public DeviceListType getDeviceList() {
        return deviceList;
    }

    /**
     * Legt den Wert der deviceList-Eigenschaft fest.
     *
     * @param value allowed object is {@link DeviceListType }
     *
     */
    public void setDeviceList(DeviceListType value) {
        this.deviceList = value;
    }

    /**
     * Ruft den Wert der presentationURL-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPresentationURL() {
        return presentationURL;
    }

    /**
     * Legt den Wert der presentationURL-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPresentationURL(String value) {
        this.presentationURL = value;
    }

}
