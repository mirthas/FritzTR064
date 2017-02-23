/**
 * *********************************************************************************************************************
 *
 * javaAVMTR064 - open source Java TR-064 API
 *===========================================
 *
 * Copyright 2015 Marin Pollmann <pollmann.m@gmail.com>
 *
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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the de.mapoll.javaAVMTR064.beans package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Scpd_QNAME = new QName("urn:dslforum-org:service-1-0", "scpd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: de.mapoll.javaAVMTR064.beans
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScpdType }
     *
     */
    public ScpdType createScpdType() {
        return new ScpdType();
    }

    /**
     * Create an instance of {@link DeviceSpecVersionType }
     *
     */
    public DeviceSpecVersionType createSpecVersionType() {
        return new DeviceSpecVersionType();
    }

    /**
     * Create an instance of {@link ArgumentType }
     *
     */
    public ArgumentType createArgumentType() {
        return new ArgumentType();
    }

    /**
     * Create an instance of {@link ArgumentListType }
     *
     */
    public ArgumentListType createArgumentListType() {
        return new ArgumentListType();
    }

    /**
     * Create an instance of {@link ActionType }
     *
     */
    public ActionType createActionType() {
        return new ActionType();
    }

    /**
     * Create an instance of {@link ActionListType }
     *
     */
    public ActionListType createActionListType() {
        return new ActionListType();
    }

    /**
     * Create an instance of {@link StateVariableType }
     *
     */
    public StateVariableType createStateVariableType() {
        return new StateVariableType();
    }

    /**
     * Create an instance of {@link ServiceStateTableType }
     *
     */
    public ServiceStateTableType createServiceStateTableType() {
        return new ServiceStateTableType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link ScpdType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "urn:dslforum-org:service-1-0", name = "scpd")
    public JAXBElement<ScpdType> createScpd(ScpdType value) {
        return new JAXBElement<ScpdType>(_Scpd_QNAME, ScpdType.class, null, value);
    }

}
