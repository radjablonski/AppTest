package whatcounts.admin.tests.apptestgateway;

import whatcounts.api.client.soap.WhatCountsAPI;

public class SocialApiTest {

	public static boolean socialPostSetForTemplate(String cookie, WhatCountsAPI api, int templateId, String provider, String post) {

		try{
			System.out.println("--- Social Post Set for Template API");
			int results = api.socialPostSetForTemplate(cookie, templateId, provider, post);	
			System.out.println(Integer.toString(results));
			return true;
		
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean socialPostsForTemplateGetById(String cookie, WhatCountsAPI api, int templateId, String format, boolean header) {

		try{
			System.out.println("--- Social Post for Template Get by Id API");
			String results = api.socialPostsForTemplateGetById(cookie, templateId, format, header);
			System.out.println(results);
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean socialPostsForTemplateGetByName(String cookie, WhatCountsAPI api, String templateName, String format, boolean header) {

		try{
			System.out.println("--- Social Post for Template Get by Name API");
			String results = api.socialPostsForTemplateGetByName(cookie, templateName, format, header);
			System.out.println(results);
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static boolean socialProviderDeleteById(String cookie, WhatCountsAPI api, int providerId) {

		try{
			System.out.println("--- Social Provider Delete By Id API");
			int results = api.socialProviderDeleteById(cookie, providerId);
			System.out.println(Integer.toString(results));
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean socialProviderDeleteByUsername(String cookie, WhatCountsAPI api, String providerName, String userName) {

		try{
			System.out.println("--- Social Provider Delete By User Name API");
			int results = api.socialProviderDeleteByUsername(cookie, providerName, userName);
			System.out.println(Integer.toString(results));
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean socialProviderGetById(String cookie, WhatCountsAPI api, int providerId, String format, boolean header) {

		try{
			System.out.println("--- Social Provider Get By Id API");
			String results = api.socialProviderGetById(providerId, cookie, format, header);
			System.out.println(results);
			return true;
				
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static boolean socialProviderGetByUsername(String cookie, WhatCountsAPI api, String providerName, String userName, String format, boolean header) {

		try{
			System.out.println("--- Social Provider Get By User Name API");
			String results = api.socialProviderGetByUsername(providerName, userName, cookie, format, header);
			System.out.println(results);
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean socialProvidersGetList(String cookie, WhatCountsAPI api, String format, boolean header) {

		try{
			System.out.println("--- Social Provider Get List API");
			String results = api.socialProvidersGetList(cookie, format, header);
			System.out.println(results);
			return true;
			
		}catch (Exception e){
			e.getStackTrace();
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
}
