package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class ExtraApiTest {

	public static boolean uploadSuppressionList(String cookie, WhatCountsAPI api, String fileName, String name, String description, boolean overwrite, String data) {

		try{
			System.out.println("--- Upload Suppression List API");
			int results = api.uploadSuppressionList(cookie, fileName, name, description, overwrite, data);
			System.out.println( "Success... " + Integer.toString(results));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean segmentationUpdateAdvancedRule(String cookie, WhatCountsAPI api, int realmId, int listId, int segmentationRuleId, String segmentationName, 
			String description, String rules) {

		try{
			System.out.println("--- Segmentation Update Advance Rule API");
			int results = api.segmentationUpdateAdvancedRule(cookie, realmId, listId, segmentationRuleId, segmentationName, description, rules);
			System.out.println( "Success... " + Integer.toString(results));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getUnsubscribeReport(String cookie, WhatCountsAPI api, int campaignId, int listId, int unique, String format, int header) {

		try{
			System.out.println("--- Get Unsubscribe Report API");
			String results = api.getUnsubscribeReport(cookie, campaignId, listId, unique, format, header);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static boolean getBounceStats(String cookie, WhatCountsAPI api, int campaignId, String fromDate, String toDate, String format, int header) {

		try{
			System.out.println("--- Get Bounce Stats API");
			String results = api.getBounceStats(cookie, campaignId, fromDate, toDate, format, header);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static boolean enumArticles(String cookie, WhatCountsAPI api, int type) {

		try{
			System.out.println("--- Enumerating Articles API");
			String results = api.enumArticles(cookie, type);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
