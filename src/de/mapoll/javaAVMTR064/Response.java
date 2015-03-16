package de.mapoll.javaAVMTR064;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.w3c.dom.NodeList;

public class Response {

	private SOAPMessage response;
	private Map<String, Type> stateToType;
	private Map<String, String> argumentState;
	private Map<String, String> data;

	public Response(SOAPMessage response, Map<String, Type> stateToType, Map<String, String> argumentState)
			throws SOAPException {
		this.response = response;
		this.stateToType = stateToType;
		this.argumentState = argumentState;
		this.data = new HashMap<String, String>();

		NodeList nodes = null;
		NodeList tmp = null;
		try {
			tmp = response.getSOAPBody().getChildNodes();
			for (int i = 1; i < tmp.getLength() && nodes == null; i++) {
				if (tmp.item(i).getNodeName().equals("#text"))
					continue;
				nodes = tmp.item(i).getChildNodes();
			}
		} catch (SOAPException e) {
			throw e;
		}

		for (int i = 1; i < nodes.getLength(); i++) {
			if (nodes.item(i).getNodeName().equals("#text"))
				continue;
			data.put(nodes.item(i).getNodeName(), nodes.item(i).getTextContent());
		}

	}

	public SOAPMessage getSOAPMessage() {
		return response;
	}
	
	public Map<String, String> getData() {
		return data;
	}

	public String getValueAsString(String argument) throws NoSuchFieldException {
		if (!argumentState.containsKey(argument) || !data.containsKey(argument))
			throw new NoSuchFieldException(argument);
		return data.get(argument);
	}

	public int getValueAsInteger(String argument) throws ClassCastException, NoSuchFieldException {
		if (!argumentState.containsKey(argument) || !data.containsKey(argument))
			throw new NoSuchFieldException(argument);
		if (stateToType.get(argumentState.get(argument)) != Integer.class)
			throw new ClassCastException(argument);

		int ret = -1;

		try {
			ret = Integer.parseInt(data.get(argument));
		} catch (NumberFormatException e) {
			throw new ClassCastException(argument + " " + e.getMessage());
		}

		return ret;
	}

	public boolean getValueAsBoolean(String argument) throws ClassCastException, NoSuchFieldException {
		if (!argumentState.containsKey(argument) || !data.containsKey(argument))
			throw new NoSuchFieldException(argument);
		if (stateToType.get(argumentState.get(argument)) != Boolean.class)
			throw new ClassCastException(argument);

		boolean ret = false;

		if (data.get(argument).equals("1") || data.get(argument).equalsIgnoreCase("true"))
			ret = true;
		else if (data.get(argument).equals("0") || data.get(argument).equalsIgnoreCase("false"))
			ret = false;
		else
			throw new ClassCastException(argument);

		return ret;
	}

	public Date getValueAsDate(String argument) throws ClassCastException, NoSuchFieldException {
		if (!argumentState.containsKey(argument) || !data.containsKey(argument))
			throw new NoSuchFieldException(argument);
		if (stateToType.get(argumentState.get(argument)) != Date.class)
			throw new ClassCastException(argument);

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		Date ret = null;

		try {
			ret = dateFormat.parse(data.get(argument));
		} catch (ParseException e) {
			throw new ClassCastException(argument + " " + e.getMessage());
		}

		return ret;
	}

	public UUID getValueAsUUID(String argument) throws ClassCastException, NoSuchFieldException {
		if (!argumentState.containsKey(argument) || !data.containsKey(argument))
			throw new NoSuchFieldException(argument);
		if (stateToType.get(argumentState.get(argument)) != UUID.class)
			throw new ClassCastException(argument);
		UUID ret = null;
		
		try{
			ret = UUID.fromString(data.get(argument));
		} catch (IllegalArgumentException e) {
			throw new ClassCastException(argument + " " + e.getMessage());
		}
		
		
		return ret;
	}

}
