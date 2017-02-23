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
 * Java-Klasse für argumentType complex type.
 *
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="argumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="relatedStateVariable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "argumentType", propOrder = {
    "name",
    "direction",
    "relatedStateVariable"
})
public class ArgumentType {

    @XmlElement(required = true, namespace = "urn:dslforum-org:service-1-0")
    protected String name;
    @XmlElement(required = true, namespace = "urn:dslforum-org:service-1-0")
    protected String direction;
    @XmlElement(required = true, namespace = "urn:dslforum-org:service-1-0")
    protected String relatedStateVariable;

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
     * Ruft den Wert der direction-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Legt den Wert der direction-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Ruft den Wert der relatedStateVariable-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRelatedStateVariable() {
        return relatedStateVariable;
    }

    /**
     * Legt den Wert der relatedStateVariable-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRelatedStateVariable(String value) {
        this.relatedStateVariable = value;
    }

}
