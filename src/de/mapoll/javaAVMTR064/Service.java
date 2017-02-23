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
package de.mapoll.javaAVMTR064;

import java.io.IOException;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

import de.mapoll.javaAVMTR064.beans.ActionType;
import de.mapoll.javaAVMTR064.beans.ScpdType;
import de.mapoll.javaAVMTR064.beans.ScpdType2;
import de.mapoll.javaAVMTR064.beans.ServiceType;

public class Service {

    private ServiceType serviceXML;
    private Map<String, Action> actions;

    public Service(ServiceType serviceXML, FritzConnection connection) throws IOException, JAXBException {
        this.serviceXML = serviceXML;
        actions = new HashMap<String, Action>();

        try (InputStream is = connection.getXMLIS(serviceXML.getSCPDURL())) {
            JAXBContext jaxbContext = JAXBContext.newInstance(ScpdType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ScpdType scpd = (ScpdType) jaxbUnmarshaller.unmarshal(is);
            for (ActionType a : scpd.getActionList().getAction()) {
                actions.put(a.getName(), new Action(a, scpd.getServiceStateTable().getStateVariable(), connection, this.serviceXML));
            }
        } catch (UnmarshalException e) {
            InputStream is = connection.getXMLIS(serviceXML.getSCPDURL());
            JAXBContext jaxbContext = JAXBContext.newInstance(ScpdType2.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ScpdType2 scpd = (ScpdType2) jaxbUnmarshaller.unmarshal(is);
            for (ActionType a : scpd.getActionList().getAction()) {
                actions.put(a.getName(), new Action(a, scpd.getServiceStateTable().getStateVariable(), connection, this.serviceXML));
            }
        }

    }

    public Map<String, Action> getActions() {
        return actions;
    }

    public Action getAction(String name) {
        return getActions().get(name);
    }

    public String toString() {
        return serviceXML.getServiceType();
    }
}
