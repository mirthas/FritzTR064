/***********************************************************************************************************************
 *
 * javaAVMTR064 - open source Java TR-064 API
 *===========================================
 *
 * Copyright 2015 Marin Pollmann <pollmann.m@gmail.com>
 * 
 *
 ***********************************************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 ***********************************************************************************************************************/

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
@XmlRootElement(name = "scpd", namespace="urn:schemas-upnp-org:service-1-0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scpdType", propOrder = {
    "specVersion",
    "actionList",
    "serviceStateTable"
})
public class ScpdType2 {

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
