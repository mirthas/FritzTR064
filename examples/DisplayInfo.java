

import java.io.IOException;


import javax.xml.bind.JAXBException;



import de.mapoll.javaAVMTR064.FritzConnection;


public class DisplayInfo {
	static String ip = "192.168.0.1";
	static String user = "user";
	static String password = "password";
	
	
	public static void main(String[] args) throws  IOException, JAXBException{
	
		
		
		FritzConnection fcWithoutUser = new FritzConnection(ip);
		fcWithoutUser.init();
		fcWithoutUser.printInfo();
		System.out.println("##################################################################");
		FritzConnection fcWithUser = new FritzConnection(ip,user,password);
		fcWithUser.init();
		fcWithUser.printInfo();
	}
}
