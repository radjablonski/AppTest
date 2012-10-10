package whatcounts.admin.tests.apptestgateway;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import persist.managers.wc.ListsDTOManager;
import persist.wrappers.wc.ListsDTOWrapper;
import whatcounts.BaseServletIO;
import artamedia.registration.User;
import artamedia.utility.Utility;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AppTest {

	public static String categoryCall	= "";
	public static String testCall		= "";
	public static String realm			= "";
	public static String realmId		= "";
	public static String name 			= ""; 
	public static String type 			= "";
	public static String newName 		= ""; 
	public static String listId 		= ""; 
	public static int countRow			= 0;

    public static void main(String[] args) throws Exception {

    	processCall();
    }
    
    public static String testData(int jsonLine) {
    	
    	String json = "";
    	
    	/*
    	 * Json for list lists currently in db
    	 */
    	String json1 =  
    	  	"{"
    	   	+"	      	'categoryCall' : 'List',"
    	   	+"	      	'testCall' : 'ListLists',"
    		+"			'testData' : {"
    		+ "				'realm' : 'cobb'," 
    	   	+"	        	'realmId' : '2357'"
    		+" 			}"
    	   	+"	}";
       	
    	
    	/*
    	 * Json to copy a existing list
    	 */
		//int type = 0; //0=Normal/1=Super/2=Seed
		String json2 =  
			"{"
    	   	+"	      	'categoryCall' : 'List',"
    	   	+"	      	'testCall' : 'ListCopy',"
			+"			'testData' : {"
			+ "				'realm' : 'cobb'," 
			+ "				'realmId' : '2357'," 
			+ "				'name' : 'radman007'," 
			+ "				'type' : '0'," 
			+ "				'newName' : 'Rad_test_list_name2'," 
			+"	        	'listId' : '9234'"
			+" 			}"
			+"	}";
    	
    	/*
    	 * Json to create a new list
    	 */
		//int type = 0; //0=Normal/1=Super/2=Seed
		String json3 =  
			"{"
    	   	+"	      	'categoryCall' : 'List',"
    	   	+"	      	'testCall' : 'ListCreate',"
    	   	+"			'testData' : {"
    	   	+ "				'realm' : 'cobb'," 
			+ "				'realmId' : '2357'," 
			+ "				'name' : 'Rad_test_list_name'," 
			+ "				'type' : '0'" 
			+" 			}"
			+"	}";
    	
    	/*
    	 * Json to delete a list
    	 */
		//int type = 0; //0=Normal/1=Super/2=Seed
		String json4 =  
			"{"
    	   	+"	      	'categoryCall' : 'List',"
    	   	+"	      	'testCall' : 'ListDelete',"
    	   	+"			'testData' : {"
    		+ "				'realmId' : '2357'," 
    		+ "				'listId' : '9247'" 
			+" 			}"
			+"	}";
		
    	
    	switch(jsonLine) {
    	case 1: json = json1;
    		break;
    	case 2: json = json2;
    		break;
    	case 3: json = json3;
    		break;
    	case 4: json = json4;
    		break;
    	default: json = "";
    		break;
    	}
    	
		return json;
    }
    
    public static String[] processJSonParser(int jsonLine) {

    	String[] jsonParams = new String[8];
    	String json			= "";
    	
    	try {
    		json = testData(jsonLine);
			JsonElement jelement = new JsonParser().parse(json);
			JsonObject  jobject = jelement.getAsJsonObject();
			
			categoryCall = jobject.get("categoryCall").toString();
			testCall = jobject.get("testCall").toString();
			
			if (testCall.equals("\"ListLists\"")) {

				jobject 	= jobject.getAsJsonObject("testData");
				realm 		= jobject.get("realm").toString();
				realmId 	= jobject.get("realmId").toString();
				
			}
			if (testCall.equals("\"ListCopy\"")) {
		    	
				jobject 	= jobject.getAsJsonObject("testData");
				realm 		= jobject.get("realm").toString();
				realmId 	= jobject.get("realmId").toString();
				name 		= jobject.get("name").toString();
				type 		= jobject.get("type").toString();
				newName 	= jobject.get("newName").toString();
				listId 		= jobject.get("listId").toString();
				
			}
			if (testCall.equals("\"ListCreate\"")) {
		    	
				jobject 	= jobject.getAsJsonObject("testData");
				realm 		= jobject.get("realm").toString();
				realmId 	= jobject.get("realmId").toString();
				name 		= jobject.get("name").toString();
				type 		= jobject.get("type").toString();
				
			}
			if (testCall.equals("\"ListDelete\"")) {
		    	
				jobject 	= jobject.getAsJsonObject("testData");
				realmId 	= jobject.get("realmId").toString();
				listId 		= jobject.get("listId").toString();
			}

			jsonParams[0] 	= categoryCall.replace("\"", "");
			jsonParams[1] 	= testCall.replace("\"", "");
			jsonParams[2] 	= realm.replace("\"", "");
			jsonParams[3] 	= realmId.replace("\"", "");
			jsonParams[4] 	= name.replace("\"", "");
			jsonParams[5] 	= type.replace("\"", "");
			jsonParams[6] 	= newName.replace("\"", "");
			jsonParams[7] 	= listId.replace("\"", "");
			
			
    	}catch (Exception e) {
    		e.getMessage();
    	}                              

    	return jsonParams;
	}
    
    
	public static Hashtable processCall() {		
		
		Hashtable ht = new Hashtable();;
		
   		for (int i = 1; i<5; i++) {
			String jsonParams[]	= processJSonParser(i);

			categoryCall		= jsonParams[0];
			testCall 			= jsonParams[1];
			realm 				= jsonParams[2];
			realmId				= jsonParams[3];
			name				= jsonParams[4];
			type				= jsonParams[5];
			newName				= jsonParams[6];
			listId				= jsonParams[7];
					    
			if (categoryCall.equals("List")) {
				
				if (testCall.equals("ListLists")) {
					ListTest lt = new ListTest();
					try {
						boolean msg = lt.lists(Integer.parseInt(realmId));
						ht.put("LISTLISTS"+countRow , decision(msg));
						countRow++;
					} catch (Exception e) {
						ht.put("LISTLISTS"+countRow, "FAILURE");
						countRow++;
						e.getMessage();
					}
				}
				if (testCall.equals("ListCreate")) {
					ListTest lt = new ListTest();
					try {
						boolean msg = lt.create(Integer.parseInt(realmId), name, Integer.parseInt(type));
						ht.put("LISTCREATE"+countRow , decision(msg));
						countRow++;
					} catch (Exception e) {
						ht.put("LISTCREATE"+countRow, "FAILURE");
						countRow++;
						e.getMessage();
					}
				}
				
				if (testCall.equals("ListCopy")) {
					ListTest lt = new ListTest();
					try {
						boolean msg = lt.copy(Integer.parseInt(realmId), newName, Integer.parseInt(listId));
						ht.put("LISTCOPY"+countRow , decision(msg));
						countRow++;
					} catch (Exception e) {
						ht.put("LISTCOPY"+countRow, "FAILURE");
						countRow++;
						e.getMessage();
					}
				}
							
				if (testCall.equals("ListDelete")) {
					ListTest lt = new ListTest();
					try {
						boolean msg = lt.delete(Integer.parseInt(realmId), newName, name);
						ht.put("LISTDELETE"+countRow , decision(msg));
						countRow++;
					} catch (Exception e) {
						ht.put("LISTDELETE"+countRow, "FAILURE");
						countRow++;
						e.getMessage();
					}
				}
				
			}
			else if (testCall.equals("TemplateTest")) {
				TemplateTest tt = new TemplateTest();
				try {
					tt.Template();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			else if (testCall.equals("SubscriberTest")) {
				SubscriberTest st = new SubscriberTest();
				try {
					st.Subscriber();
				} catch (Exception e){
					e.getMessage();
				}
			}
   		}
		return ht;
	}

	
	public static void processAPICall() {
		
	}
	
	
	public static String decision(boolean msg) {
		
		String flag = "";
		if (msg) {
			flag = "SUCCESSFUL";
		}else {
			flag = "FAILURE";
		}
		return flag;
	}
}
