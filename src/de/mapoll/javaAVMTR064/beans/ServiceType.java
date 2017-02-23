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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für serviceType complex type.
 *
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="serviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="controlURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eventSubURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SCPDURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceType", propOrder = {
    "serviceType",
    "serviceId",
    "controlURL",
    "eventSubURL",
    "scpdurl"
})
public class ServiceType {

    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String serviceType;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String serviceId;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String controlURL;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String eventSubURL;
    @XmlElement(name = "SCPDURL", required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String scpdurl;

    /**
     * Ruft den Wert der serviceType-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Legt den Wert der serviceType-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Ruft den Wert der serviceId-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Legt den Wert der serviceId-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Ruft den Wert der controlURL-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getControlURL() {
        return controlURL;
    }

    /**
     * Legt den Wert der controlURL-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setControlURL(String value) {
        this.controlURL = value;
    }

    /**
     * Ruft den Wert der eventSubURL-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEventSubURL() {
        return eventSubURL;
    }

    /**
     * Legt den Wert der eventSubURL-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEventSubURL(String value) {
        this.eventSubURL = value;
    }

    /**
     * Ruft den Wert der scpdurl-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSCPDURL() {
        return scpdurl;
    }

    /**
     * Legt den Wert der scpdurl-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSCPDURL(String value) {
        this.scpdurl = value;
    }

}
