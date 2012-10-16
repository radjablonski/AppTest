package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class UserApiTest {

	
	public static boolean userSearch(String cookie, WhatCountsAPI api, String email, boolean exact, boolean returnFormat) {

		try{
			System.out.println("--- Searching for email address rjablonski@whatcounts.com");
			String results = api.userSearch(cookie, email, exact, returnFormat);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	
	public static boolean isUserValid(String cookie, WhatCountsAPI api, String email, String encryptedId) {

		try{
			System.out.println("--- Is User Valid");
			boolean response = api.isUserValid(cookie, email, encryptedId);
			System.out.println((response ? "true" : "false"));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	
	public static boolean userSubscribe(String cookie, WhatCountsAPI api, String email, int listId, int emailFormat) {
		
		try{
			System.out.println("--- Subscribing a User");			
			int results = api.userSubscribe(cookie, email, listId, emailFormat);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	
	public static boolean userUnSubscribe(String cookie, WhatCountsAPI api, String email, int listId) {
		
		try{
			System.out.println("--- UnSubscribing a user");		
			int results = api.userUnSubscribe(cookie, email, listId);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	
	public static boolean userUnSubscribeWithFirstName(String cookie, WhatCountsAPI api, String email, String firstName, int listId, boolean optout, boolean universal) {
		
		try{
			System.out.println("--- UserUnSubscribe a user");
			int results = api.userUnSubscribe(cookie, email, firstName, listId, optout, universal);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
//	public static boolean userSetDataInt(String cookie, WhatCountsAPI api, String email, String phone) {
//		
//		try{
//			System.out.println("--- Setting user Data Int");
//			int results = api.userSetDataInt(cookie, email, phone);
//			return true;
//		
//		}catch (Exception e){
//			e.getStackTrace();
//			return false;
//		}
//	}
	

//	public static boolean userSetDataString(String cookie, WhatCountsAPI api, String email, String city) {
//		
//		try{
//			System.out.println("--- Setting user Data String");		
//			int results = api.userSetDataString(cookie, email, "city", city);
//			return true;
//			
//		}catch (Exception e){
//			e.getStackTrace();
//			return false;
//		}
//	}
	
	
//	public static boolean userSetData(String cookie, WhatCountsAPI api, String email) {
//		
//		MapEntry[] data = new MapEntry[2];
//		data[0] = new MapEntry();
//		data[0].setKey("address");
//		data[0].setValue("tst12");
//		data[1] = new MapEntry();
//		data[1].setKey("state");
//		data[1].setValue("GA");
//		data[2] = new MapEntry();
//		data[2].setKey("fave_holiday");
//		Calendar cal = new GregorianCalendar(2007, Calendar.MARCH, 17);
//		data[2].setValue(cal);
//		
//		try {
//			int results = api.userSetData(cookie, email, data);
//			return true;
//			
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return false;
//		}
//		
//	}
	
	
	public static boolean userClearData(String cookie, WhatCountsAPI api, String email, String address) {
	
		try{
			System.out.println("--- Clearing user Data");		
			int results = api.userClearData(cookie, email, address);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
		
	}

	public static boolean userClearAllData(String cookie, WhatCountsAPI api, String email) {
		
		try{
			System.out.println("--- Clearing All user Data");		
			int results = api.userClearAllData(cookie, email);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean userGetData(String cookie, WhatCountsAPI api, String email, String firstName, String phone, boolean returnFormat) {

		try{
			System.out.println("--- Getting user Data");		
			String results = api.userGetData(cookie, email, firstName, phone, returnFormat);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
		
	}

	public static boolean userGetAllData(String cookie, WhatCountsAPI api, String customerKey, boolean returnXml) {
		
		boolean return_xml = false; //false = cvs - true = xml
		try{
			System.out.println("--- Getting All user Data");		
			String results = api.userGetAllData(cookie, customerKey,  returnXml);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean userOptOuts(String cookie, WhatCountsAPI api, String email, boolean exact, boolean returnFormat) {
		
		try{
			System.out.println("--- Opting out user");		
			String results = api.userOptOuts(cookie, email, exact, returnFormat);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}

	public static boolean userOptOutsWithFirstName(String cookie, WhatCountsAPI api, String email, String firstName, boolean exact, boolean returnFormat) {
		
		try{
			System.out.println("--- Opting out user with First Name");		
			String results = api.userOptOuts(cookie, email, firstName, exact, returnFormat);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean userSearchByTag(String cookie, WhatCountsAPI api, String email, String subscriberIdTag, boolean returnFormat) {
		
		try{
			System.out.println("--- Search for user by Tag");		
			String results = api.userSearchByTag(cookie, subscriberIdTag, returnFormat);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean userSubscribeToLists(String cookie, WhatCountsAPI api, String email, String firstName, String listIds, int emailFormat, boolean allowDuplicates) {
		
		try{
			System.out.println("--- Subscribe user to lists");		
			String results = api.userSubscribeToLists(cookie, email, firstName, listIds, emailFormat, allowDuplicates);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean userSubscriptions(String cookie, WhatCountsAPI api, String email, String firstName, boolean exact, boolean showCreatedDate, boolean returnFormat) {
		
		try{
			System.out.println("--- User Subscriptions");		
			String results = api.userSubscriptions(cookie, email, firstName, exact, showCreatedDate, returnFormat);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
