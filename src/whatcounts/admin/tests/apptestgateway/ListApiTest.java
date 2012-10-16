package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;
import whatcounts.api.client.soap.WhatCountsAPIList;


public class ListApiTest {
	
	public static boolean listGetDataByName(String cookie, WhatCountsAPI api, String listName) {

		try{
			System.out.println("--- List Get Data by Name API");
			
			WhatCountsAPIList list = api.listGetDataByName(cookie, listName);
			
//			System.out.println( "Success... ");
//			System.out.println("list_id: " + list.getListId());
//			System.out.println("list_name: " + list.getName());
//			System.out.println("from_address: " + list.getFromAddress());
//			System.out.println("reply_to_address: " + list.getReplyToAddress());
//			System.out.println("errors_to_address: " + list.getErrorsToAddress());
//			System.out.println("description: " + list.getDescription());
//			System.out.println("template_id: " + list.getTemplateId());
//			System.out.println("multipart: " + (list.isMultipart() ? "true" : "false"));
//			System.out.println("use_aol: " + (list.isUseAol() ? "true" : "false"));
//			System.out.println("wrap_plain_text: " + (list.isWrapPlainText() ? "true" : "false"));
//			System.out.println("wrap_html: " + (list.isWrapHtml() ? "true" : "false"));
//			System.out.println("track_html_reads: " + (list.isTrackHtmlReads() ? "true" : "false"));
//			System.out.println("track_click_throughs: " + (list.isTrackClickThroughs() ? "true" : "false"));
//			System.out.println("opt_in: " + (list.isOptIn() ? "true" : "false"));
//			System.out.println("opt_out: " + (list.isOptOut() ? "true" : "false"));
//			System.out.println("send_signup_ack: " + (list.isSendSignupAck() ? "true" : "false"));
//			System.out.println("signup_template_id: " + list.getSignupTemplateId());
//			System.out.println("cancel_template_id: " + list.getCancelTemplateId());
//			System.out.println("send_cancel_ack: " + (list.isSendCancelAck() ? "true" : "false"));
//			System.out.println("external_signup_link: " + list.getExternalSignupLink());
//			System.out.println("external_cancel_link: " + list.getExternalCancelLink());
//			System.out.println("tracking_base_url: " + list.getTrackingBaseUrl());
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean listRun(String cookie, WhatCountsAPI api, String creatorEmail, String notifyEmail, int listId, int templateId, 
			int segmentationId, int forcedFormat, boolean testMode) {
		
		try{
			System.out.println("--- List Run API");
			int results = api.listRun(cookie, creatorEmail, notifyEmail, listId, templateId, segmentationId, forcedFormat, testMode);
			System.out.println(Integer.toString(results));
			return true;

		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean listRunWithXMLFlags(String cookie, WhatCountsAPI api, String xmlFlags) {

		try{
			System.out.println("--- List Run With XML Flag Create API");
			String results = api.listRun(cookie, xmlFlags);
			System.out.println(results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean listRunWithCount(String cookie, WhatCountsAPI api, String creatorEmail, String notifyEmail, int listId, 
			int templateId, int segmentationId, int forcedFormat, boolean testMode) {

		try{
			System.out.println("--- List Run With Count API");
			int results = api.listRunWithCount(cookie, creatorEmail, notifyEmail, listId, templateId, segmentationId, forcedFormat, testMode);
			System.out.println(Integer.toString(results));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean enumListsInFolder(String cookie, WhatCountsAPI api, int folderId, int type) {

		try{
			System.out.println("--- Enumerating Lists In Folder API");
			String results = api.enumListsInFolder(cookie, folderId, type);
			System.out.println(results);
			return true;

		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
	
	public static boolean enumLists(String cookie, WhatCountsAPI api, int type) {

		try{
			System.out.println("--- Enumerating Lists API");
			String results = api.enumLists(cookie,  type);
			System.out.println(results);
			return true;

		}catch (Exception e){
			e.getStackTrace();
			return false;
		}
	}
}
