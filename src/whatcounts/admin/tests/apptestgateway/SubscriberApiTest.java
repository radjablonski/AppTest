package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class SubscriberApiTest {
	
	public static boolean getSubscriberEvents(String cookie, WhatCountsAPI api, String email, String firstName, int limit, int eventType, String format, boolean header) {

		try{
			System.out.println("--- Get Subscriber Events API");
			String results = api.getSubscriberEvents(cookie, email, firstName, limit, eventType, format, header);
			System.out.println(results);
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getSubscriberEventsByID(String cookie, WhatCountsAPI api, int subscriberId, int limit, int eventType, String format, boolean header) {

		try{
			System.out.println("--- Get Subscriber Events By Id API");
			String results = api.getSubscriberEventsByID(cookie, subscriberId, limit, eventType, format, header);
			System.out.println(results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getSubscriberID(String cookie, WhatCountsAPI api, String email, String firstName) {

		try{
			System.out.println("--- Get Subscriber Id API");
			int results = api.getSubscriberID(cookie, email, firstName);
			System.out.println(Integer.toString(results));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getSubscribersInList(String cookie, WhatCountsAPI api, int listId, int offset, String format, int header) {

		try{
			System.out.println("--- Get Subscribers in List API");
			String results = api.getSubscribersInList(cookie, listId, offset, format, header);
			System.out.println(results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getSubscribersWhoClickedOnURL(String cookie, WhatCountsAPI api, int campaignId, String url, int exactUrlMatch, int unique, String format, int header) {

		try{
			System.out.println("--- Get Subscriber Who Clicked API");
			String results = api.getSubscribersWhoClickedOnURL(cookie, campaignId, url, exactUrlMatch, unique, format, header);
			System.out.println(results);
			return true;

		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
