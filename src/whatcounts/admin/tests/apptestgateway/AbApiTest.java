package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class AbApiTest {

	public static boolean getAbDefinitions(String cookie, WhatCountsAPI api, String format) {

		try{
			System.out.println("--- Get AB Definitions API");
			String results = api.getAbDefinitions(cookie, format);	
			System.out.println( "Success... " + results );
			return true;

		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getAbStats(String cookie, WhatCountsAPI api, int abDefinitionId, String format, boolean header) {

		try{
			System.out.println("--- Get AB Stats API");
			String results = api.getAbStats(cookie, abDefinitionId, format, header);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean abDefinitionGetById(String cookie, WhatCountsAPI api, int abDefinitionId, String format) {

		try{
			System.out.println("--- AB Defomotopm Get By Id API");
			String results = api.abDefinitionGetById(cookie, abDefinitionId, format);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
		
	public static boolean abMailWinner(String cookie, WhatCountsAPI api, String encryptedId) {

		try{
			System.out.println("--- AB Mail Winner API");
			String results = api.abMailWinner(cookie, encryptedId);
			System.out.println( "Success... " + results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
