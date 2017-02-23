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
 * Java-Klasse für iconType complex type.
 *
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="iconType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iconType", propOrder = {
    "mimetype",
    "width",
    "height",
    "depth",
    "url"
})
public class IconType {

    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String mimetype;
    @XmlElement(namespace = "urn:dslforum-org:device-1-0")
    protected byte width;
    @XmlElement(namespace = "urn:dslforum-org:device-1-0")
    protected byte height;
    @XmlElement(namespace = "urn:dslforum-org:device-1-0")
    protected byte depth;
    @XmlElement(required = true, namespace = "urn:dslforum-org:device-1-0")
    protected String url;

    /**
     * Ruft den Wert der mimetype-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Legt den Wert der mimetype-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     *
     */
    public byte getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     *
     */
    public void setWidth(byte value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     *
     */
    public byte getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     *
     */
    public void setHeight(byte value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der depth-Eigenschaft ab.
     *
     */
    public byte getDepth() {
        return depth;
    }

    /**
     * Legt den Wert der depth-Eigenschaft fest.
     *
     */
    public void setDepth(byte value) {
        this.depth = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
