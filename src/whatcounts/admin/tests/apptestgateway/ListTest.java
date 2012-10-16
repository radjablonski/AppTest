package whatcounts.admin.tests.apptestgateway;

import java.util.Hashtable;
import java.util.List;

import persist.managers.wc.ListsDTOManager;
import persist.wrappers.wc.ListsDTOWrapper;
import artamedia.utility.Utility;

public class ListTest {

	public static Hashtable <String,Integer> htList = new Hashtable();
	public static String nameRemember 		= "";
	public static String newNameRemember 	= "";
	public static int realmIdRemember		= 0;
	
	public static boolean lists(int realmId) throws Exception {
		
		String success 				= "";
	    ListsDTOManager ldm 		= new ListsDTOManager();
		List<ListsDTOWrapper> lists	= ldm.loadAll(realmId);
		
		if (lists.size() > 0) {
			String listName		= "";
			int listId			= 0;
			int i 				= 0;
		
			System.out.println("Ready to display the list");
			for (ListsDTOWrapper list : lists) {
				i++;
				listName 	= list.getName();
				listId 	= list.getListId();
				htList.put(listName, listId);
			}
			return true;
	    }
		if (lists.size() == 0) {
	    	System.out.println("List is empty,no records");
	    	return false;
	    }
		return false;

	}
	
	public static boolean copy(int realmId, String newName, int listId) throws Exception {

		String success 		= "";
	    ListsDTOManager ldm = new ListsDTOManager();
		
		if (newName == null || newName.length() == 0) {
			System.out.println("Unable to Copy List There was an error copying your list. You have not supplied a valid list name. " +
					"Please press your browser's <a href=\"javascript:history.back();\">back</a> button to try again.");
			return false;
    	}
		
		if (ldm.getListId(realmId, newName) > 0) {
			System.out.println("Duplicate name");
			return false;
		}
		
		ListsDTOWrapper list = ldm.load(realmId, listId);
		
		if (list == null) {
			System.out.println("Unable to Copy List There was an error copying your list. The source list does not exist.");
            return false;
        }
		
		System.out.println("Ready to copy a list");
		ldm.copyList(realmId, listId, newName);
		AppTestHelper.setNewName(newName);
		return true;
	}
	
	public static boolean create(int realmId, String name, int type) throws Exception {

		String success 			= "";
	    ListsDTOManager ldm 	= new ListsDTOManager();			
		ListsDTOWrapper list 	= null;
		list 					= ldm.loadByName(realmId, name);

		if (list == null) {
			list = new ListsDTOWrapper(realmId);
			list.setName (name);
            //list.setType(type);
			list.setType(type);
			list.setTrackingClickthroughEnabled(true);
			list.setTrackingReadEnabled(true);

			if (ldm.create(list)) {
				System.out.println("Ready to create a list");
				AppTestHelper.setName(name);
				return true;
			} 
			else {
				System.out.println("Error: Unable to create list.");
				return false;
			}
		}
		else {
			System.out.println("Error: The name " + name + " is already being used by another list. Please select another.");
			return false;
		}
	}
	
	
	public static boolean delete(int realmId, String newName, String name) throws Exception {
	
		String success 				= "";
	    ListsDTOManager ldm 		= new ListsDTOManager();
		List<ListsDTOWrapper> lists = ldm.loadAll(realmId);
		lists(realmId);
		
	    if (lists.size() > 0) {
	    	
	    	if ((newName.length() > 0) || (name.length() > 0)) {
	    		System.out.println("Ready to delete the list");
		    	if (newName.length() > 0) {
		    		int listId = htList.get(newName);
					ListsDTOWrapper list = ldm.load(realmId, listId);
					if (ldm.deleteList(list)) {				
						//return true;
					}
		    	}
		    	
		    	if (name.length() > 0) {
		    		int listId = htList.get(name);
					ListsDTOWrapper list = ldm.load(realmId, listId);
					if (ldm.deleteList(list)) {				
						//return true;
					}
		    	}
		    	return true;
	    	}
			return false;
	    }
	    
	    if (lists.size() == 0 ) {
	    	System.out.println("No list to Delete");
	    	return false;
	    }
		return false;
	}

}
