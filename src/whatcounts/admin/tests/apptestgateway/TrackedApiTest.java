package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class TrackedApiTest {

	public static boolean getTrackedEvents(String cookie, WhatCountsAPI api, int eventType, String startDatetime, String endDatetime, int offset, 
			String format, int header) {

		try{
			System.out.println("--- Tracked Events API");
			String results = api.getTrackedEvents(cookie, eventType, startDatetime, endDatetime, offset, format, header);	
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getTrackedEventsByCampaign(String cookie, WhatCountsAPI api, int campaignId, int eventType, String startDatetime, String endDatetime, 
			int offset, String format, int header) {

		try{
			System.out.println("--- Tracked Events By Campaign API");
			String results = api.getTrackedEventsByCampaign(cookie, campaignId, eventType, startDatetime, endDatetime, offset, format, header);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
