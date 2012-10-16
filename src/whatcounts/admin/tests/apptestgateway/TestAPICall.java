package whatcounts.admin.tests.apptestgateway;

import java.io.*;
import java.net.*;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import whatcounts.api.client.soap.*;

public class TestAPICall {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String license = new String("<version>1</version><key>50E44DD6C9C73A2822FF880F5B45DDC</key><data>4D10964B58FC77AF1448314D51B0062BC842B93696B66A3092EC545A1085C26D61C0B07C0CE6AD1E44946D6A59C67F3E5EBEEBE307EDE92EDDF2F9A293145473E306E8BEF3AF0CE3129ECD4B7E16335B066020DB019FFFD3</data>");
		
		WhatCountsAPI api = null;
		String cookie = "";
		try {
			
			URL endpoint = new java.net.URL("http://localhost:8080/webservices/WhatCountsAPI");
			api = (WhatCountsAPI) new WhatCountsAPIServiceLocator().getWhatCountsAPI(endpoint);
			
			cookie = api.beginSession (license);
			
			String version = api.getVersion();
			System.out.println(version);

		}catch (javax.xml.rpc.ServiceException e){
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
				
	}		
}
