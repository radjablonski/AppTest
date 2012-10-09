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

	private final String APP_TEST = "/util/app_test.ftl";
	
    private static class PSGlobals
    {
	    public BaseServletIO bio;
	    public User u;
	    public HashMap<String,Object> vars = new HashMap<String,Object>();

	    
	    public PSGlobals(BaseServletIO bio, User u)
   		{
	        this.bio = bio;
	        this.u = u;
   		}
    }
    
	public void process(BaseServletIO bio, User u)	{

		PSGlobals globals = new PSGlobals(bio, u);
		
		if (! Allow (bio, u, ACCESS_SUPERUSER | ACCESS_PVT_LABEL_ADMIN | ACCESS_REALM_ADMIN | ACCESS_REALM_LIST_MANAGER | ACCESS_REALM_EDITOR ))
			return;

		
		Date date;		
		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		date = new Date();    
		System.out.println("Start time.....  " + dateFormat.format(date));
		
		try {
		
		AppTest at = new AppTest();
		Hashtable ht = at.processCall();
		String output ="";
		 
		//Get all the messages to display
		Enumeration enu = ht.keys(); 
		while(enu.hasMoreElements()) {
			 
			 String str = (String) enu.nextElement();
			 output += ht.get(str);	
			 System.out.println(".....output.. " + output);
			 
		
		}
		globals.vars.put("error", "Site name cannot be blank");
		globals.vars.put("mode", "add");
		globals.vars.put("list", output);
		globals.vars.put("types", "NEW APP TEST");
		fmRender(bio, u, globals.vars, APP_TEST);
		return;
            	
		}catch (Exception e){
			System.out.println("ERROR " + e.getMessage());
			//System.out.println("ERROR " + e.getStackTrace());
			
		}

		date = new Date(); 
		System.out.println("End time.....  " + dateFormat.format(date));
	}
	
    
}
