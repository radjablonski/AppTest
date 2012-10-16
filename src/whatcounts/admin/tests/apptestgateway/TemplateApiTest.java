package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.*;

public class TemplateApiTest {

	public static boolean templateCopy(String cookie, WhatCountsAPI api, String srcName, String dstName) {

		try{
			System.out.println("--- Template Copy API");
			int results = api.templateCopy(cookie, srcName, dstName);
			System.out.println(Integer.toString(results));
			return true;

		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean templateCreate(String cookie, WhatCountsAPI api, String templateName, int returnTemplateId) {

		try{
			System.out.println("--- Template Create API");
			int results = api.templateCreate(cookie, templateName, returnTemplateId);
			System.out.println(Integer.toString(results));
			return true;

		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean templateDelete(String cookie, WhatCountsAPI api, int templateId, String templateName) {
		
		try{
			System.out.println("--- Template Delete API");
			int results = api.templateDelete(cookie, templateId, templateName);
			System.out.println(Integer.toString(results));
			return true;

		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static boolean templateEdit(String cookie, WhatCountsAPI api, String templateName, int element, String content) {

		int TEMPLATE_PART_SUBJECT = 0;
		int TEMPLATE_PART_DESCRIPTION = 1;
		int TEMPLATE_PART_NOTES = 2;
		int TEMPLATE_PART_PLAINTEXT = 3;
		int TEMPLATE_PART_HTML = 4;
		int TEMPLATE_PART_AOL = 5;
		int TEMPLATE_PART_WAP = 6;
				
		try{
			System.out.println("--- Template Edit API");
			int results = api.templateEdit(cookie, templateName, element, content);
			System.out.println(Integer.toString(results));
			return true;

		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean templateGetData(String cookie, WhatCountsAPI api, String templateName, int element) {

		try{
			System.out.println("--- Template Get Data API");
			String results = api.templateGetData(cookie, templateName, element);
			System.out.println(results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean templateGetDataAll(String cookie, WhatCountsAPI api, int templateId) {

		try{
			System.out.println("--- Template Get Data All by Template ID API");
			WhatCountsAPITemplate template = api.templateGetDataAll(cookie, templateId);
			System.out.println(template.getSubject());
			return true;

		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean templateGetDataAllByName(String cookie, WhatCountsAPI api, String templateName) {

		try{
			System.out.println("--- Template Get Data All by Template Name API");
			
			WhatCountsAPITemplate template = api.templateGetDataAllByName(cookie, templateName);
			System.out.println(Integer.toString(template.getTemplateId()));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean templatePreview(String cookie, WhatCountsAPI api, String templateName, int format) {

		try{
			System.out.println("--- Template Preview API");
			String results = api.templatePreview(cookie, templateName, format);
			System.out.println(results);
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean templateUpdate(String cookie, WhatCountsAPI api, int templateId, String templateName, String subject, 
			String htmlContent, String plainTextContent, String mobile, String charSet, boolean utf8, int contentEncoding) {

		try{
			System.out.println("--- Template Update API");
			WhatCountsAPITemplate template = new WhatCountsAPITemplate();
			if (template != null) {
				template.setTemplateId(templateId);
				template.setName(templateName);
				template.setSubject(subject);
				template.setHtml(htmlContent);
				template.setPlainText(plainTextContent);
				template.setMobile(mobile);
				template.setCharset(charSet);
				template.setUtf8(utf8);
				template.setContentEncoding(contentEncoding);
				
				int results = api.templateUpdate(cookie, template);
				System.out.println(Integer.toString(results));
				return true;
			}
			else {
				System.out.println("ERROR: template id " + templateId + " not found. This error a result of calling templateGetDataAll() to get the existing template information before calling templateUpdate(). Please make sure the template id you are using actually exists.");
				return false;
			}
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
		
}
