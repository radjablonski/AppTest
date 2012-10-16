package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class SegmentationApiTest {

	public static boolean segmentationRule(String cookie, WhatCountsAPI api, String segmentationName, int listId) {

		try{
			System.out.println("--- Segmentation Rule API");
			int results = api.testSegmentationRule(cookie, segmentationName, listId);			
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean enumSegmentationRules(String cookie, WhatCountsAPI api, String ruleType, int folderId, int type) {

		try{
			System.out.println("--- Enumerating Segmentation Rules API");
			String results = api.enumSegmentationRules(cookie, ruleType, folderId, type);
			System.out.println( "Success... " + results);
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
