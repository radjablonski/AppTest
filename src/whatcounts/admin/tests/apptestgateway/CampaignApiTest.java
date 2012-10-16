package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class CampaignApiTest {

	public static boolean getCampaignClickthroughsOverview(String cookie, WhatCountsAPI api, int campaignId, String format, int header) {

		try{
			System.out.println("--- Campaign Clickthrough Overview API");
			String results = api.getCampaignClickthroughsOverview(cookie, campaignId, format, header);
			System.out.println(results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getBrowserInfoByCampaign(String cookie, WhatCountsAPI api, int campaignId, boolean bySubscriber, String osNameMatch, String browserMatch, 
			String clientTypeMatch, String format, boolean headerB) {

		try{
			System.out.println("--- Browser Info by Campaign API");		
			String results = api.getBrowserInfoByCampaign(cookie, campaignId, bySubscriber, osNameMatch, browserMatch, clientTypeMatch, format, headerB);
			System.out.println(results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getCampaignsInDateRange(String cookie, WhatCountsAPI api, String fromDate, String toDate, int showHidden, String format, int header) {

		try{
			System.out.println("--- Get Campaigns in Data Range API");
			String results = api.getCampaignsInDateRange(cookie, fromDate, toDate, showHidden, format, header);
			System.out.println(results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean getDailyCampaignStats(String cookie, WhatCountsAPI api, int campaignId, String fromDate, String toDate, String format, int header, String version) {

		try{
			System.out.println("--- Get Daily Campaign Status API");
			String results = api.getDailyCampaignStats(cookie, campaignId, fromDate, toDate, format, header, version);
			System.out.println(results);
			return true;

		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
}
