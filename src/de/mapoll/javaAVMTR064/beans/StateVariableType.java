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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für stateVariableType complex type.
 *
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="stateVariableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sendEvents" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stateVariableType", propOrder = {
    "name",
    "dataType"
})
public class StateVariableType {

    @XmlElement(required = true, namespace = "urn:dslforum-org:service-1-0")
    protected String name;
    @XmlElement(required = true, namespace = "urn:dslforum-org:service-1-0")
    protected String dataType;
    @XmlAttribute(name = "sendEvents", namespace = "urn:dslforum-org:service-1-0")
    protected String sendEvents;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der dataType-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Legt den Wert der dataType-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Ruft den Wert der sendEvents-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSendEvents() {
        return sendEvents;
    }

    /**
     * Legt den Wert der sendEvents-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSendEvents(String value) {
        this.sendEvents = value;
    }

}
