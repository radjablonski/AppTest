package whatcounts.manager.gatway;

import java.util.Hashtable;
import java.util.List;

import persist.managers.wc.ListsDTOManager;
import persist.wrappers.wc.ListsDTOWrapper;
import artamedia.utility.Utility;

public class ListTest {

	//public static Hashtable ht;
	
	public static boolean ListLists(int realmId) throws Exception {

		String success = "";
		// initialize our list manager
	    ListsDTOManager ldm = new ListsDTOManager();
		// get a list of all the lists that have been defined so far
		List<ListsDTOWrapper> lists = ldm.loadAll(realmId);

		if (lists.size() > 0) {
			System.out.println("....size... " + lists.size());
			String list_name = "";
			int list_id;
			int i = 0;
		
			for (ListsDTOWrapper list : lists) {
				i++;
				
				list_name = list.getName();
				list_id = list.getListId();
				//ht.put(list_name, list_id);
		
				System.out.println(".... " + list_name +"-"+list_id);	
			}
			return true;
	    }
		if (lists.size() == 0) {
	    	System.out.println("List is empty,no records");
	    	return false;
	    }
		return false;

	}
	
	public static boolean ListCopy(int realmId, String newName, int listId) throws Exception {

		String success = "";
		// initialize our list manager
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
		return true;
	}
	
	public static boolean ListCreate(int realmId, String name, int type) throws Exception {

		String success = "";
		// initialize our list manager
	    ListsDTOManager ldm = new ListsDTOManager();
			
		ListsDTOWrapper list = null;

		list = ldm.loadByName(realmId, name);

		if (list == null)
		{
			list = new ListsDTOWrapper(realmId);
			list.setName (name);
            //list.setType(type);
			list.setType(type);
			list.setTrackingClickthroughEnabled(true);
			list.setTrackingReadEnabled(true);

			if (ldm.create(list)) {
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
	
	public static boolean ListDelete(int realmId, int listId) throws Exception {

		String success = "";
		// initialize our list manager
	    ListsDTOManager ldm = new ListsDTOManager();
		// get a list of all the lists that have been defined so far
		List<ListsDTOWrapper> lists = ldm.loadAll(realmId);

	    if (lists.size() > 0) {
	    	System.out.println("Ready to delete the list");
	    	//deleteList(realmId, listId, ldm);
	    	
			ListsDTOWrapper list = ldm.load(realmId, listId);
			if (ldm.deleteList(list)) {
				
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
