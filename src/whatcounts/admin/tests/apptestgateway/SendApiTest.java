package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.*;

public class SendApiTest {

	public static boolean sendMessage(String cookie, WhatCountsAPI api, int templateId, int listId, int format, String from, String to, 
			String firstName, String cc, String replyTo, String mailFrom, String subject, String htmlBody, String plainTextBody, String vmta, MapEntry[] predata) {

		try{
			System.out.println("--- Send Message API");
			int results = api.sendMessage(cookie, templateId, listId, format, from, to, firstName, cc, replyTo, mailFrom, subject, htmlBody, plainTextBody, vmta, predata);
			System.out.println(Integer.toString(results));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean sendMessageWithXMLFlags(String cookie, WhatCountsAPI api, String xmlFlags, String subject, String htmlBody, String plainTextBody, 
			MapEntry[] predata) {
		
		try{
			System.out.println("--- Send Message wiht XML flags API");
			int results = api.sendMessage(cookie, xmlFlags, subject, htmlBody, plainTextBody, predata);
			System.out.println(Integer.toString(results));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean sendMessageWATT1(String cookie, WhatCountsAPI api, String from, String replyTo, String mailFrom, String to, String firstName, String subject,  
			int format, int listId, int templateId,  String vmta,  MapEntry[] predata, String attFilename, String attBody) {

		try{
			System.out.println("--- Send Message with Attachement1 API");
			int results = api.sendMessageWithAttachment(cookie, from, replyTo, mailFrom, to, firstName, subject,  format, listId, templateId,  vmta,  predata,
														attFilename, attBody );
			System.out.println(Integer.toString(results));
			return true;

		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean sendMessageWATT2(String cookie, WhatCountsAPI api, String from, String replyTo,  String to, String firstName, String subject, 
			String plainTextBody, String htmlBody, int format, int listId,  String vmta,  String attFilename, String attBody) {

		try{
			System.out.println("--- Send Message with Attachement2 API");
			int results = api.sendMessageWithAttachment(cookie, from, replyTo,  to, firstName, subject, plainTextBody, htmlBody, format, listId,  vmta,  
														attFilename, attBody  );
			System.out.println(Integer.toString(results));
			return true;

		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
