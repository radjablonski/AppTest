package whatcounts.servlets.authenticated.app_test;


import artamedia.registration.*;

import whatcounts.BaseServletIO;
import whatcounts.manager.gatway.AppTest;
import whatcounts.servlets.BaseServletLoginRequired;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings("serial")
public class app_test extends BaseServletLoginRequired
{

	public void process(BaseServletIO bio, User u)	{

		if (! Allow (bio, u, ACCESS_SUPERUSER | ACCESS_PVT_LABEL_ADMIN | ACCESS_REALM_ADMIN | ACCESS_REALM_LIST_MANAGER | ACCESS_REALM_EDITOR ))
			return;

		
		Date date;		
		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		date = new Date();    
		System.out.println("Start time.....  " + dateFormat.format(date));
		
		try {
			AppTest at = new AppTest();
			Hashtable ht = at.processCall();
			 
			//Get all the messages to display
			Enumeration enu = ht.keys(); 
			while(enu.hasMoreElements()) {
				 
				 String str = (String) enu.nextElement();
				 System.out.println(str + ": " + ht.get(str));				 
			} 
			 
		}catch (Exception e){
			System.out.println("ERROR " + e.getMessage());
			//System.out.println("ERROR " + e.getStackTrace());
			
		}

		date = new Date(); 
		System.out.println("End time.....  " + dateFormat.format(date));
	}
	
    
}
