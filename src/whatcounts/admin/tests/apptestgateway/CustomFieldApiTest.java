package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class CustomFieldApiTest {

	public static boolean customFieldCreate(String cookie, WhatCountsAPI api, String fieldName, String fieldDescription, int fieldType) {

		try{
			System.out.println("--- Custom Field Create API");
			int results = api.customFieldCreate(cookie, fieldName, fieldDescription, fieldType);
			System.out.println( "Success... " + results );
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean customFieldDelete(String cookie, WhatCountsAPI api, String fieldName) {

		try{
			System.out.println("--- Custom Field Delete API");
			int results = api.customFieldDelete(cookie, fieldName);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
