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
	private Map<String,Action> actions;
	
	public Service(ServiceType serviceXML, FritzConnection connection) throws IOException, JAXBException{
		this.serviceXML = serviceXML;
		actions = new HashMap<String,Action>();
		
		try (InputStream is = connection.getXMLIS(serviceXML.getSCPDURL())){
		JAXBContext jaxbContext = JAXBContext.newInstance(ScpdType.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		ScpdType scpd = (ScpdType)jaxbUnmarshaller.unmarshal(is);
		for (ActionType a : scpd.getActionList().getAction()){
			actions.put(a.getName(), new Action(a, scpd.getServiceStateTable().getStateVariable(), connection, this.serviceXML));
		}
		} catch (UnmarshalException e){
			InputStream  is = connection.getXMLIS(serviceXML.getSCPDURL());
			JAXBContext jaxbContext = JAXBContext.newInstance(ScpdType2.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			ScpdType2 scpd = (ScpdType2)jaxbUnmarshaller.unmarshal(is);
			for (ActionType a : scpd.getActionList().getAction()){
				
				actions.put(a.getName(), new Action(a, scpd.getServiceStateTable().getStateVariable(), connection, this.serviceXML));
			}
		}
		
	}
	
	public Map<String,Action> getActions(){
		return actions;
	}
	public Action getAction(String name){
		return getActions().get(name);
	}
	
	
	public String toString(){
		return serviceXML.getServiceType();
	}
}
