package whatcounts.admin.tests.apptestgateway;

import java.io.*;
import java.net.*;

import whatcounts.api.client.soap.*;

import java.rmi.RemoteException;
import java.util.Hashtable;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AppTest {

	public static String categoryCall		= "";
	public static String testCall			= "";
	public static String realm				= "";
	public static String realmId			= "";
	public static String name 				= ""; 
	public static String type 				= "";
	public static String newName 			= ""; 
	public static String listId 			= ""; 
	public static int countRow				= 0;
	
	//Liar Variables
	public static String licenseKey			= "";
	public static String serviceUrl			= "";
	public static String apiCall 			= "";
	public static String listName			= "";
	public static String creatorEmail		= "";
	public static String notifyEmail		= "";
	public static String templateId			= "";
	public static String segmentationId		= "";
	public static String forcedFormat		= "";
	public static String testMode			= "";
	public static String xmlFlags			= "";
	public static String folderId			= "";
	
	//User variables
	public static String email 				= "";
	public static String address			= "";
	public static String emailFormat 		= "";
	public static String firstName 			= "";
	public static String optout 			= "";
	public static String universal 			= "";
	public static String exact 				= "";
	public static String returnFormat 		= "";
	public static String subscriberIdTag	= "";
	public static String listIds			= "";
	public static String allowDuplicates	= "";
	public static String showCreatedDate	= "";
	public static String encryptedId		= "";
	public static String returnXml			= "";
	
	//Templates variables
	public static String srcName			= "";
	public static String dstName			= "";
	public static String templateName		= "";
	public static String returnTemplateId	= "";
	public static String element			= "";
	public static String content			= "";
	public static String format				= "";
	public static String subject			= "";
	public static String htmlContent		= "";
	public static String plainTextContent	= "";
	public static String mobile				= "";
	public static String charSet			= "";
	public static String utf8				= "";
	public static String contentEncoding	= "";
	
	//Subscribers variables
	public static String limit 				= "";
	public static String eventType 			= "";
	public static String header 			= "";
	public static String subscriberId		= "";
	public static String offset				= "";
	public static String header_i			= "";
	public static String campaignId			= "";
	public static String url				= "";
	public static String exactUrlMatch		= "";
	public static String unique				= "";
	
	//Send variables
	public static String from 				= "";
	public static String to 				= "";
	public static String cc  				= "";
	public static String replyTo  			= "";
	public static String mailFrom  			= "";
	public static String htmlBody  			= "";
	public static String plainTextBody  	= "";
	public static String vmta  				= "";
	public static String predata			= "";
	public static String attFilename		= "";
	public static String attBody			= "";
	
	//Campaign variables
	public static String bySubscriber		= "";
	public static String osNameMatch		= "";
	public static String browserMatch		= "";
	public static String clientTypeMatch	= "";
	public static String headerB			= "";
	public static String fromDate			= "";
	public static String toDate				= "";
	public static String showHidden			= "";
	public static String version			= "";
	
	//Social variable
	public static String provider			= "";
	public static String post				= "";
	public static String providerId			= "";
	public static String providerName		= "";
	public static String userName			= "";
	
	//Segmentation variable
	public static String segmentationName	= "";
	public static String ruleType			= "";
	
	//Tracked variable
	public static String startDatetime		= "";
	public static String endDatetime		= "";
	
	//AB variable
	public static String abDefinitionId		= "";
	
	//Custom variable
	public static String fieldName			= "";
	public static String fieldDescription	= "";
	public static String fieldType			= "";
	
	//Extra variable
	public static String fileName			= "";
	public static String overwrite			= "";
	public static String data 				= "";  
	public static String segmentationRuleId = "";
	public static String rules 				= "";
	public static String description		= "";
	
	
	

    public static void main(String[] args) throws Exception {
    	processCall();
    }
    
    public static String testData(int jsonDataNumber) {
    	
    	String json = "";
    	
    	/*
    	 * Json for list lists currently in db
    	 */
    	String json1 =  
    	  	"{"
    	   	+"	      	'categoryCall' : 'List',"
    	   	+"	      	'testCall' : 'ListLists',"
    		+"			'testData' : {"
    		+ "				'realm' : 'cobb'," 
    	   	+"	        	'realmId' : '2357'"
    		+" 			}"
    	   	+"	}";
       	
    	
    	/*
    	 * Json to copy a existing list
    	 */
		//int type = 0; //0=Normal/1=Super/2=Seed
		String json2 =  
			"{"
    	   	+"	      	'categoryCall' : 'List',"
    	   	+"	      	'testCall' : 'ListCopy',"
			+"			'testData' : {"
			+ "				'realm' : 'cobb'," 
			+ "				'realmId' : '2357'," 
			+ "				'name' : 'radman007'," 
			+ "				'type' : '0'," 
			+ "				'newName' : 'Rad_test_list_name2'," 
			+"	        	'listId' : '9234'"
			+" 			}"
			+"	}";
    	
    	/*
    	 * Json to create a new list
    	 */
		//int type = 0; //0=Normal/1=Super/2=Seed
		String json3 =  
			"{"
    	   	+"	      	'categoryCall' : 'List',"
    	   	+"	      	'testCall' : 'ListCreate',"
    	   	+"			'testData' : {"
    	   	+ "				'realm' : 'cobb'," 
			+ "				'realmId' : '2357'," 
			+ "				'name' : 'Rad_test_list_name'," 
			+ "				'type' : '0'" 
			+" 			}"
			+"	}";
    	

    	/*
    	 * Json to delete a list
    	 */
		//int type = 0; //0=Normal/1=Super/2=Seed
		String json4 =  
			"{"
    	   	+"	      	'categoryCall' : 'List',"
    	   	+"	      	'testCall' : 'ListDelete',"
    	   	+"			'testData' : {"
    		+ "				'realmId' : '2357'," 
    		+ "				'listId' : '9247'" 
			+" 			}"
			+"	}";
		
		//***********************************API TEST CALLS ***************************************//
		String licenseKeyLocal 	= "<version>1</version><key>50E44DD6C9C73A2822FF880F5B45DDC</key><data>4D10964B58FC77AF1448314D51B0062BC842B93696B66A3092EC545A1085C26D61C0B07C0CE6AD1E44946D6A59C67F3E5EBEEBE307EDE92EDDF2F9A293145473E306E8BEF3AF0CE3129ECD4B7E16335B066020DB019FFFD3</data>";
		String licenseKeyQA 	= "";
		String licenseKeyProd 	= "<version>1</version><key>5DAD50F993813A4FB6B5F054567D501</key><data>B5D73583E285ACE09886F1BB30CB0B052D98ED88A0C0E0CBA2D14338BDEE6CFC2CD5D91E16AE792A6B10347534F1EFE368B44399AA1EC773552F853146BD47AD58856D6D85D86A04EC790AB252FCD5B9FF33FAC1AD37D1EF</data>";
		
		String serviceURLLocal 	= "http://localhost:8080/webservices/WhatCountsAPI";
		String serviceURLQA		= "";
		String serviceURLProd 	= "http://api.whatcounts.com/webservices/WhatCountsAPI"; 
		
		//List Json Test
		String json5 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ListAPI', 'testCall':'listGetDataByName', 'testData' : {'listName' : 'aaa_rad_seg_test'}}";
		String json6 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ListAPI', 'testCall':'listRun', 'testData' :  {'creatorEmail' : 'RAD', 'notifyEmail' : 'rjablonski@whatcounts.com', 'listId' : '9244', 'templateId' : '322', 'segmentationId' : '0', 'forcedFormat' : '1', 'testMode' : 'false'}}";
		String json7 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ListAPI', 'testCall':'ListRunWithXMLFlags', 'testData' :  {'xmlFlags' : '<TEST>test</TEST>'}}";
		String json8 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ListAPI', 'testCall':'listRunWithCount', 'testData' :  {'creatorEmail' : 'RAD', 'notifyEmail' : 'rjablonski@whatcounts.com', 'listId' : '9244', 'templateId' : '322', 'segmentationId' : '0', 'forcedFormat' : '1', 'testMode' : 'false'}}";
		String json9 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ListAPI', 'testCall':'enumListsInFolder', 'testData' :  {'folderId' : '322', 'type' : '1'}}";
		String json10 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ListAPI', 'testCall':'enumLists', 'testData' :  {'type' : '1'}}";

		//User Json Test
		String json11 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userSearch', 'testData' : {'email' : 'rjablonski2@whatcounts.com', 'exact' : ' true', 'returnFormat' : 'false'}}";
		String json12 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userSearch', 'testData' : {'email' : 'whatcounts.com', 'exact' : ' false', 'returnFormat' : 'false'}}";
		String json13 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userSubscribe', 'testData' : {'email' : 'rjablonski@whatcounts.com',	'listId' : '207', 'emailFormat' : '1'}}";
		String json14 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userUnSubscribe', 'testData' : {'email' : 'rjablonski2whatcounts.com', 'listId' : '207'}}";
		String json15 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userUnSubscribeWithFirstName', 'testData' : {'email' : 'rjablonski@whatcounts.com',	'firstName' : 'rad', 'listId' : '207', 'emailFormat' : '1', 'optout':'false', 'universal' : 'false'}}";
		String json16 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userOptOuts', 'testData' : {'email' : 'rjablonski2@whatcounts.com', 'exact' : ' true', 'returnFormat' : 'false'}}";
		String json17 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userOptOutsWithFirstName', 'testData' : {'email' : 'rjablonski2@whatcounts.com', 'exact' : ' true', 'returnFormat' : 'false', 'firstName': 'Rad'}}";
		String json18 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userSearchByTag', 'testData' : {'subscriberIdTag' :'test' , 'returnFormat' : 'false'}}";
		String json19 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userSubscribeToLists', 'testData' : {'email' : 'rjablonski@whatcounts.com',	'firstName' : 'rad', 'listId' : '207', 'emailFormat' : '1', 'allowDuplicates':'false'}}";
		String json20 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'userSubscriptions', 'testData' : {'email' : 'rjablonski@whatcounts.com',	'firstName' : 'rad', 'exact' : 'true', 'returnFormat' : 'false', 'showCreatedDate':'true'}}";
		String json21 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'UserAPI', 'testCall':'listGetDataByNaisUserValidme', 'testData' : {'email' : 'rjablonski@whatcounts.com',	'encryptedId' : 'false'}}";
		
		//Template Json Test
		String json22 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templateCopy', 'testData' : {'srcName' : 'allstate', 'dstName' : 'allstateRad'}}";
		String json23 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templateCreate', 'testData' : {'templateName' : 'allstateRad22', 'returnTemplateId' : '1'}}";
		String json24 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templateDelete', 'testData' : {'templateId' : '9833', 'templateName' : 'allstateRad22'}}";
		String json25 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templateEdit', 'testData' : {'templateName' : 'allstateRad22', 'element' : '4', 'content' : '<h1>TEST</h1>'}}";
		String json26 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templateGetData', 'testData' : {'templateName' : 'allstate', 'element' : '0'}}";
		String json27 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templateGetDataAll', 'testData' : {'templateId' : '322'}}";
		String json28 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templateGetDataAllByName', 'testData' : {'templateName' : 'allstate'}}";
		String json29 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templatePreview', 'testData' : {'templateName' : 'allstate', 'format' : '2'}}";
		String json30 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TemplateAPI', 'testCall':'templateUpdate', 'testData' : {'templateId' : '9834', 'templateName' : 'allstateRADJAB', 'subject' : 'TESTRAD', 'htmlContent' : '<h1>TEST</h1>', 'plainTextContent' : 'TEST', 'mobile' : 'TEST', 'charset' : 'UTF-8', 'utf8' : 'false', 'contentEncoding' : '1'}}";
		
		
		//Subscriber Json Test
		String json31 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SubscriberAPI', 'testCall':'getSubscriberEvents', 'testData' : {'email' : 'rjablonski@whatcounts.com', 'firstName':'Rad', 'limit':'1', 'eventType':'1', 'format':'HTML', 'header':'false'}}";
		String json32 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SubscriberAPI', 'testCall':'getSubscriberEventsByID', 'testData' : {'subscriberId' : '5',  'limit':'1', 'eventType':'0', 'format':'HTML', 'header':'false'}}";
		String json33 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SubscriberAPI', 'testCall':'getSubscriberID', 'testData' : {'email' : 'rjablonski@whatcounts.com', 'firstName':'Rad'}}";
		String json34 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SubscriberAPI', 'testCall':'getSubscribersInList', 'testData' : {'listId' : '5',  'offset':'1', 'format':'HTML', 'header':'2'}}";
		String json35 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SubscriberAPI', 'testCall':'getSubscribersWhoClickedOnURL', 'testData' : {'campaignId' : '5',  'url':'http://www.google.com', 'exactUrlMatch':'1', 'unique':'1', 'format':'HTML', 'header':'2'}}";
		
		//Send Json Test
		String json36 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SendAPI', 'testCall':'sendMessage', 'testData' : {'templateId' : '322', 'listId' : '9244', 'format' : '2', 'from' : 'rjablonski@whatcounts.com', 'to' : 'rjablonski@whatcounts.com', 'firstName' : 'rad', 'cc' : 'rjablonski@whatcounts.com', 'replyTo' : 'rjablonski@whatcounts.com', 'mailFrom' : 'rjablonski@whatcounts.com', 'subject' : 'api test msg', 'htmlBody' : '<h2>TEST</h2>', 'plainTextBody' : 'test', 'vmta' : 'localhost:8080', 'predata' : 'null'}}";
		String json37 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SendAPI', 'testCall':'sendMessageWithXMLFlags', 'testData' : {'xmlFlags' : '2', 'subject' : 'api test msg', 'htmlBody' : '<h2>TEST</h2>', 'plainTextBody' : 'test', 'predata' : 'null'}}";
		String json38 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SendAPI', 'testCall':'sendMessageWATT1', 'testData' : {'templateId' : '322', 'listId' : '9244', 'format' : '2', 'from' : 'rjablonski@whatcounts.com', 'to' : 'rjablonski@whatcounts.com', 'firstName' : 'rad', 'cc' : 'rjablonski@whatcounts.com', 'replyTo' : 'rjablonski@whatcounts.com', 'mailFrom' : 'rjablonski@whatcounts.com', 'subject' : 'api test msg', 'htmlBody' : '<h2>TEST</h2>', 'plainTextBody' : 'test', 'vmta' : 'localhost:8080', 'predata' : 'null', 'attFilename':'test.html', 'attBody':'<h1>test1</h1>'}}";
		String json39 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SendAPI', 'testCall':'sendMessageWATT2', 'testData' : {'templateId' : '322', 'listId' : '9244', 'format' : '2', 'from' : 'rjablonski@whatcounts.com', 'to' : 'rjablonski@whatcounts.com', 'firstName' : 'rad', 'cc' : 'rjablonski@whatcounts.com', 'replyTo' : 'rjablonski@whatcounts.com', 'mailFrom' : 'rjablonski@whatcounts.com', 'subject' : 'api test msg', 'htmlBody' : '<h2>TEST</h2>', 'plainTextBody' : 'test', 'vmta' : 'localhost:8080', 'predata' : 'null', 'attFilename':'test.html', 'attBody':'<h1>test1</h1>'}}";
		
		//Campaign Json Test
		String json40 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'CampaignAPI', 'testCall':'getCampaignClickthroughsOverview', 'testData' : {'campaignId' : '2', 'format' : 'HTML', 'header' : '1'}}";
		String json41 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'CampaignAPI', 'testCall':'getBrowserInfoByCampaign', 'testData' : {'campaignId' : '2', 'bySubscriber' : 'false', 'osNameMatch' : 'test', 'browserMatch':'test',  'clientTypeMatch':'test', 'format':'test', 'header':'false'}}";
		String json42 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'CampaignAPI', 'testCall':'getCampaignsInDateRange', 'testData' : {'fromDate' : '01/01/2012', 'toDate' : '01/31/2012', 'showHidden':'1', 'format' : 'HTML', 'header':'1'}}";
		String json43 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'CampaignAPI', 'testCall':'getDailyCampaignStats', 'testData' : {'campaignId':'5', 'fromDate' : '01/01/2012', 'toDate' : '01/31/2012', 'format' : 'HTML', 'header':'1', 'version':'1.2.3'}}";
		
		//Social Json Test
		String json44 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SocialAPI', 'testCall':'socialPostSetForTemplate', 'testData' : {'templateId' : '322', 'provider' : 'Comcast', 'post' : 'www.google.com'}}";
		String json45 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SocialAPI', 'testCall':'socialPostsForTemplateGetById', 'testData' : {'templateId' : '322', 'format' : 'HTML', 'header' : 'false'}}";
		String json46 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SocialAPI', 'testCall':'socialPostsForTemplateGetByName', 'testData' : {'templateName' : 'allstate', 'format' : 'HTML', 'header' : 'false'}}";
		String json47 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SocialAPI', 'testCall':'socialProviderDeleteById', 'testData' : {'providerId' : '12'}}";
		String json48 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SocialAPI', 'testCall':'socialProviderDeleteById', 'testData' : {'providerName' : 'comcast', 'userName':'rad'}}";
		String json49 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SocialAPI', 'testCall':'socialProviderGetById', 'testData' : {'providerId' : '5', 'format' : 'HTML', 'header' : 'false'}}";
		String json50 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SocialAPI', 'testCall':'socialProviderGetByUsername', 'testData' : {'providerName' : 'comcast', 'userName':'rad', 'format' : 'HTML', 'header' : 'false'}}";
		String json51 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SocialAPI', 'testCall':'socialProvidersGetList', 'testData' : {'format' : 'HTML', 'header' : 'false'}}";
		
		//Segmentation Json Test
		String json52 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SegmentationAPI', 'testCall':'segmentationRule', 'testData' : {'segmentationName' : 'Big Life Send', 'listId' : '3806'}}";
		String json53 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'SegmentationAPI', 'testCall':'enumSegmentationRules', 'testData' : {'ruleType' : 'STANDARD', 'folderId' : '3806', 'type' : '1'}}";
		
		//Tracked Json Test
		String json54 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TrackedlAPI', 'testCall':'getTrackedEvents', 'testData' : {'eventType' : '1', 'startDatetime' : '08/08/2012', 'endDatetime' : '08/09/2012', 'offset' : '2', 'format' : 'HTML', 'header' : '1'}}";
		String json55 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'TrackedlAPI', 'testCall':'getTrackedEventsByCampaign', 'testData' : {'campaignId':'321',  'eventType' : '1', 'startDatetime' : '08/08/02012', 'endDatetime' : '08/09/2012', 'offset' : '2', 'format' : 'HTML', 'header' : '1'}}";
		
		//Ab Json Test
		String json56 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'AbAPI', 'testCall':'getAbDefinitions', 'testData' : {'format' : 'HTML'}}";
		String json57 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'AbAPI', 'testCall':'getAbStats', 'testData' : {'abDefinitionId':'322', 'format' : 'HTML', 'header':'false'}}";
		String json58 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'AbAPI', 'testCall':'abDefinitionGetById', 'testData' : {'abDefinitionId':'322', 'format' : 'HTML'}}";
		String json59 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'AbAPI', 'testCall':'abMailWinner', 'testData' : {'encryptedId':'322'}}";
		
		//CustomField Json Test
		String json60 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'CustomFieldAPI', 'testCall':'customFieldCreate', 'testData' : {'fieldName' : 'radname', 'fieldDescription':'test', 'fieldType':'1'}}";
		String json61 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'CustomFieldAPI', 'testCall':'customFieldDelete', 'testData' : {'fieldName' : 'radname'}}";
		
		//Extra Json Test
		String json62 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ExtraAPI', 'testCall':'uploadSuppressionList', 'testData' : {'fileName' : 'radname.csv', 'name':'test', 'description':'test', 'overwrite':'true','data':'text here'}}";
		String json63 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ExtraAPI', 'testCall':'segmentationUpdateAdvancedRule', 'testData' : {'realmId' : '2', 'listId':'322', 'segmentationRuleId':'12', 'segmentationName':'test','description':'test', 'rules':'1'}}";
		String json64 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ExtraAPI', 'testCall':'getUnsubscribeReport', 'testData' : {'campaignId' : '2', 'listId':'322', 'unique':'12', 'format':'HTML','header':'2'}}";
		String json65 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ExtraAPI', 'testCall':'getBounceStats', 'testData' : {'campaignId' : '2', 'fromDate':'08/08/2012', 'toDate':'08/09/2012', 'format':'HTML','header':'2'}}";
		String json66 ="{'licenseKey' : '"+licenseKeyLocal+"', 'serviceUrl' : '"+serviceURLLocal+"', 'categoryCall':'ExtraAPI', 'testCall':'enumArticles', 'testData' : {'type' : '2'}}";
		
		
		
		//***********************************END API TEST CALLS ***************************************//
    	
    	switch(jsonDataNumber) {
    	case 1: json = json1;
    		break;
    	case 2: json = json2;
    		break;
    	case 3: json = json3;
    		break;
    	case 4: json = json4;
    		break;
    	case 5: json = json5;
			break;
    	case 6: json = json6;
			break;
    	case 7: json = json7;
			break;
    	case 8: json = json8;
			break;
    	case 9: json = json9;
			break;
    	case 10: json = json10;
			break;
    	case 11: json = json11;
			break;
    	case 12: json = json12;
			break;
    	case 13: json = json13;
			break;
    	case 14: json = json14;
			break;
    	case 15: json = json15;
			break;
    	case 16: json = json16;
			break;
    	case 17: json = json17;
			break;
    	case 18: json = json18;
			break;
    	case 19: json = json19;
			break;
    	case 20: json = json20;
			break;
    	case 21: json = json21;
			break;
    	case 22: json = json22;
			break;
    	case 23: json = json23;
			break;
    	case 24: json = json24;
			break;
    	case 25: json = json25;
			break;
    	case 26: json = json26;
			break;
    	case 27: json = json27;
			break;
    	case 28: json = json28;
			break;
    	case 29: json = json29;
			break;
    	case 30: json = json30;
			break;
    	case 31: json = json31;
			break;
    	case 32: json = json32;
			break;
    	case 33: json = json33;
			break;
    	case 34: json = json34;
			break;
    	case 35: json = json35;
			break;
    	case 36: json = json36;
			break;
    	case 37: json = json37;
			break;
    	case 38: json = json38;
			break;
    	case 39: json = json39;
			break;
    	case 40: json = json40;
			break;
    	case 41: json = json41;
			break;
    	case 42: json = json42;
			break;
    	case 43: json = json43;
			break;
    	case 44: json = json44;
			break;
    	case 45: json = json45;
			break;
    	case 46: json = json46;
			break;
    	case 47: json = json47;
			break;
    	case 48: json = json48;
			break;
    	case 49: json = json49;
			break;
    	case 50: json = json50;
			break;
    	case 51: json = json51;
			break;
    	case 52: json = json52;
			break;
    	case 53: json = json53;
			break;
    	case 54: json = json54;
			break;
    	case 55: json = json55;
			break;
    	case 56: json = json56;
			break;
    	case 57: json = json57;
			break;
    	case 58: json = json58;
			break;
    	case 59: json = json59;
			break;
    	case 60: json = json60;
			break;
    	case 61: json = json61;
			break;
    	case 62: json = json62;
			break;
    	case 63: json = json63;
			break;
    	case 64: json = json64;
			break;
    	case 65: json = json65;
			break;
    	case 66: json = json66;
			break;
    	default: json = "";
    		break;
    	}
    	
		return json;
    }
    
    //public static String[] processJSonParser(int jsonLine) {
    public static void processJSonParser(int jsonDataNumber) {	

    	//String[] jsonParams 	= new String[20];
    	String json				= "";
    	
    	try {
    		json = testData(jsonDataNumber);
			JsonElement jelement = new JsonParser().parse(json);
			JsonObject  jobject = jelement.getAsJsonObject();
			
			categoryCall = removeExtraQuote(jobject.get("categoryCall").toString());
			testCall = removeExtraQuote(jobject.get("testCall").toString());
			
			if(categoryCall.contains("API")) {
				licenseKey = removeExtraQuote(jobject.get("licenseKey").toString());
				serviceUrl = removeExtraQuote(jobject.get("serviceUrl").toString());
			}
			
			if (categoryCall.equals("\"List\"")) {
				if (testCall.equals("\"ListLists\"")) {
	
					jobject 	= jobject.getAsJsonObject("testData");
					realm 		= removeExtraQuote(jobject.get("realm").toString());
					realmId 	= removeExtraQuote(jobject.get("realmId").toString());
					
				}
				if (testCall.equals("\"ListCopy\"")) {
			    	
					jobject 	= jobject.getAsJsonObject("testData");
					realm 		= removeExtraQuote(jobject.get("realm").toString());
					realmId 	= removeExtraQuote(jobject.get("realmId").toString());
					name 		= removeExtraQuote(jobject.get("name").toString());
					type 		= removeExtraQuote(jobject.get("type").toString());
					newName 	= removeExtraQuote(jobject.get("newName").toString());
					listId 		= removeExtraQuote(jobject.get("listId").toString());
					
				}
				if (testCall.equals("\"ListCreate\"")) {
			    	
					jobject 	= jobject.getAsJsonObject("testData");
					realm 		= removeExtraQuote(jobject.get("realm").toString());
					realmId 	= removeExtraQuote(jobject.get("realmId").toString());
					name 		= removeExtraQuote(jobject.get("name").toString());
					type 		= removeExtraQuote(jobject.get("type").toString());
					
				}
				if (testCall.equals("\"ListDelete\"")) {
			    	
					jobject 	= jobject.getAsJsonObject("testData");
					realmId 	= removeExtraQuote(jobject.get("realmId").toString());
					listId 		= removeExtraQuote(jobject.get("listId").toString());
				}

				
//				jsonParams[0] 	= categoryCall.replace("\"", "");
//				jsonParams[1] 	= testCall.replace("\"", "");
//				jsonParams[2] 	= realm.replace("\"", "");
//				jsonParams[3] 	= realmId.replace("\"", "");
//				jsonParams[4] 	= name.replace("\"", "");
//				jsonParams[5] 	= type.replace("\"", "");
//				jsonParams[6] 	= newName.replace("\"", "");
//				jsonParams[7] 	= listId.replace("\"", "");
			}
			
			//*********************************************API PARSER*****************************//
			if (categoryCall.equals("\"ListAPI\"")) {
				
				if (testCall.equals("\"listGetDataByName\"")) {
					listName = removeExtraQuote(jobject.get("listName").toString());
				}
				
				if (testCall.equals("\"listRun\"")) {
					creatorEmail 	= removeExtraQuote(jobject.get("creatorEmail").toString());
					notifyEmail 	= removeExtraQuote(jobject.get("notifyEmail").toString());
					listId 			= removeExtraQuote(jobject.get("listId").toString());
					templateId 		= removeExtraQuote(jobject.get("templateId").toString());
					segmentationId 	= removeExtraQuote(jobject.get("segmentationId").toString());
					forcedFormat 	= removeExtraQuote(jobject.get("forcedFormat").toString());
					testMode 		= removeExtraQuote(jobject.get("testMode").toString());
				}
				
				if (testCall.equals("\"ListRunWithXMLFlags\"")) {
					xmlFlags 		= removeExtraQuote(jobject.get("xmlFlags").toString());
				}
				
				if (testCall.equals("\"enumListsInFolder\"")) {
					folderId 		= removeExtraQuote(jobject.get("folderId").toString());
					type 			= removeExtraQuote(jobject.get("type").toString());
				}
				
				if (testCall.equals("\"enumLists\"")) {
					type 			= removeExtraQuote(jobject.get("type").toString());
				}
			}
			if (categoryCall.equals("\"UserAPI\"")) {
				
				if (testCall.equals("\"userSearch\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					exact = removeExtraQuote(jobject.get("exact").toString());
					returnFormat = removeExtraQuote(jobject.get("returnFormat").toString());
				}
				if (testCall.equals("\"isUserValid\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					encryptedId = removeExtraQuote(jobject.get("encryptedId").toString());
				}
				if (testCall.equals("\"userSubscribe\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
					emailFormat = removeExtraQuote(jobject.get("emailFormat").toString());
				}
				if (testCall.equals("\"userUnSubscribe\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
				}
				if (testCall.equals("\"userUnSubscribeWithFirstName\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					firstName = removeExtraQuote(jobject.get("firstName").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
					emailFormat = removeExtraQuote(jobject.get("emailFormat").toString());
					optout = removeExtraQuote(jobject.get("optout").toString());
					universal = removeExtraQuote(jobject.get("universal").toString());
				}
				if (testCall.equals("\"userClearAllData\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
				}
				if (testCall.equals("\"userSearchByTag\"")) {
					subscriberIdTag = removeExtraQuote(jobject.get("subscriberIdTag").toString());
					returnFormat = removeExtraQuote(jobject.get("returnFormat").toString());
				}
				if (testCall.equals("\"userSubscribeToLists\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					firstName = removeExtraQuote(jobject.get("firstName").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
					emailFormat = removeExtraQuote(jobject.get("emailFormat").toString());
					allowDuplicates = removeExtraQuote(jobject.get("allowDuplicates").toString());
				}
				if (testCall.equals("\"userSubscriptions\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					firstName = removeExtraQuote(jobject.get("firstName").toString());
					exact = removeExtraQuote(jobject.get("exact").toString());
					showCreatedDate = removeExtraQuote(jobject.get("showCreatedDate").toString());
					returnFormat = removeExtraQuote(jobject.get("returnFormat").toString());
				}
			}
			if (categoryCall.equals("\"TemplateAPI\"")) {
				
				if (testCall.equals("\"templateCopy\"")) {
					srcName = removeExtraQuote(jobject.get("srcName").toString());
					dstName = removeExtraQuote(jobject.get("dstName").toString());
				}
				if (testCall.equals("\"templateCreate\"")) {
					templateName = removeExtraQuote(jobject.get("templateName").toString());
					returnTemplateId = removeExtraQuote(jobject.get("returnTemplateId").toString());
				}
				if (testCall.equals("\"templateDelete\"")) {
					templateName = removeExtraQuote(jobject.get("templateName").toString());
					templateId = removeExtraQuote(jobject.get("templateId").toString());
				}
				if (testCall.equals("\"templateEdit\"")) {
					templateName = removeExtraQuote(jobject.get("templateName").toString());
					element = removeExtraQuote(jobject.get("element").toString());
					content = removeExtraQuote(jobject.get("content").toString());
				}
				if (testCall.equals("\"templateGetData\"")) {
					templateName = removeExtraQuote(jobject.get("templateName").toString());
					element = removeExtraQuote(jobject.get("element").toString());
				}
				if (testCall.equals("\"templateGetDataAll\"")) {
					templateId = removeExtraQuote(jobject.get("templateId").toString());
				}
				if (testCall.equals("\"templateGetDataAllByName\"")) {
					templateName = removeExtraQuote(jobject.get("templateName").toString());
				}
				if (testCall.equals("\"templatePreview\"")) {
					templateName = removeExtraQuote(jobject.get("templateName").toString());
					format = removeExtraQuote(jobject.get("format").toString());
				}
				if (testCall.equals("\"templateUpdate\"")) {
					templateId = removeExtraQuote(jobject.get("templateId").toString());
					templateName = removeExtraQuote(jobject.get("templateName").toString());
					subject = removeExtraQuote(jobject.get("subject").toString());
					htmlContent = removeExtraQuote(jobject.get("htmlContent").toString());
					plainTextContent = removeExtraQuote(jobject.get("plainTextContent").toString());
					mobile = removeExtraQuote(jobject.get("mobile").toString());
					charSet = removeExtraQuote(jobject.get("charset").toString());
					utf8 = removeExtraQuote(jobject.get("utf8").toString());
					contentEncoding = removeExtraQuote(jobject.get("contentEncoding").toString());
				}		
			}
			if (categoryCall.equals("\"SubscriberAPI\"")) {
				
				if (testCall.equals("\"getSubscriberEvents\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					firstName = removeExtraQuote(jobject.get("firstName").toString());
					limit = removeExtraQuote(jobject.get("limit").toString());
					eventType = removeExtraQuote(jobject.get("eventType").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"getSubscriberEventsByID\"")) {
					subscriberId = removeExtraQuote(jobject.get("subscriberId").toString());
				}
				if (testCall.equals("\"getSubscriberID\"")) {
					email = removeExtraQuote(jobject.get("email").toString());
					firstName = removeExtraQuote(jobject.get("firstName").toString());
				}
				if (testCall.equals("\"getSubscribersInList\"")) {
					listId = removeExtraQuote(jobject.get("listId").toString());
					offset = removeExtraQuote(jobject.get("offset").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header_i = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"getSubscribersWhoClickedOnURL\"")) {
					campaignId = removeExtraQuote(jobject.get("campaignId").toString());
					url = removeExtraQuote(jobject.get("url").toString());
					exactUrlMatch = removeExtraQuote(jobject.get("exactUrlMatch").toString());
					unique = removeExtraQuote(jobject.get("unique").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header_i = removeExtraQuote(jobject.get("header").toString());
				}
			}
			if (categoryCall.equals("\"SendAPI\"")) {
				
				if (testCall.equals("\"sendMessage\"")) {
					templateId = removeExtraQuote(jobject.get("templateId").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					from = removeExtraQuote(jobject.get("from").toString());
					to = removeExtraQuote(jobject.get("to").toString());
					firstName = removeExtraQuote(jobject.get("firstName").toString());
					cc = removeExtraQuote(jobject.get("cc").toString());
					replyTo = removeExtraQuote(jobject.get("replyTo").toString());
					mailFrom = removeExtraQuote(jobject.get("mailFrom").toString());
					subject = removeExtraQuote(jobject.get("subject").toString());
					htmlBody = removeExtraQuote(jobject.get("htmlBody").toString());
					plainTextBody = removeExtraQuote(jobject.get("plainTextBody").toString());
					vmta = removeExtraQuote(jobject.get("vmta").toString());
					predata = removeExtraQuote(jobject.get("predata").toString());
				}
				if (testCall.equals("\"sendMessageWithXMLFlags\"")) {
					xmlFlags = removeExtraQuote(jobject.get("xmlFlags").toString());
					predata = removeExtraQuote(jobject.get("predata").toString());
					subject = removeExtraQuote(jobject.get("subject").toString());
					htmlBody = removeExtraQuote(jobject.get("htmlBody").toString());
					plainTextBody = removeExtraQuote(jobject.get("plainTextBody").toString());
				}
				if ((testCall.equals("\"sendMessageWATT1\"")) || (apiCall.equals("\"sendMessageWATT2\""))) {
					templateId = removeExtraQuote(jobject.get("templateId").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					from = removeExtraQuote(jobject.get("from").toString());
					to = removeExtraQuote(jobject.get("to").toString());
					firstName = removeExtraQuote(jobject.get("firstName").toString());
					cc = removeExtraQuote(jobject.get("cc").toString());
					replyTo = removeExtraQuote(jobject.get("replyTo").toString());
					mailFrom = removeExtraQuote(jobject.get("mailFrom").toString());
					subject = removeExtraQuote(jobject.get("subject").toString());
					htmlBody = removeExtraQuote(jobject.get("htmlBody").toString());
					plainTextBody = removeExtraQuote(jobject.get("plainTextBody").toString());
					vmta = removeExtraQuote(jobject.get("vmta").toString());
					predata = removeExtraQuote(jobject.get("predata").toString());
					attFilename = removeExtraQuote(jobject.get("attFilename").toString());
					attBody = removeExtraQuote(jobject.get("attBody").toString());
				}
			}
			if (categoryCall.equals("\"CampaignAPI\"")) {
				
				if (testCall.equals("\"getCampaignClickthroughsOverview\"")) {
					campaignId = removeExtraQuote(jobject.get("campaignId").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"getBrowserInfoByCampaign\"")) {
					campaignId = removeExtraQuote(jobject.get("campaignId").toString());
					bySubscriber = removeExtraQuote(jobject.get("bySubscriber").toString());
					osNameMatch = removeExtraQuote(jobject.get("osNameMatch").toString());
					browserMatch = removeExtraQuote(jobject.get("browserMatch").toString());
					clientTypeMatch = removeExtraQuote(jobject.get("clientTypeMatch").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					headerB = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"getCampaignsInDateRange\"")) {
					fromDate = removeExtraQuote(jobject.get("fromDate").toString());
					toDate = removeExtraQuote(jobject.get("toDate").toString());
					showHidden = removeExtraQuote(jobject.get("showHidden").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"getDailyCampaignStats\"")) {
					campaignId = removeExtraQuote(jobject.get("campaignId").toString());
					fromDate = removeExtraQuote(jobject.get("fromDate").toString());
					toDate = removeExtraQuote(jobject.get("toDate").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
					version = removeExtraQuote(jobject.get("version").toString());
				}
			}
			if (categoryCall.equals("\"SocialAPI\"")) {
				
				if (testCall.equals("\"socialPostSetForTemplate\"")) {
					templateId = removeExtraQuote(jobject.get("templateId").toString());
					provider = removeExtraQuote(jobject.get("provider").toString());
					post = removeExtraQuote(jobject.get("post").toString());
				}
				if (testCall.equals("\"socialPostsForTemplateGetById\"")) {
					templateId = removeExtraQuote(jobject.get("templateId").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}	
				if (testCall.equals("\"socialPostsForTemplateGetById\"")) {
					templateName = removeExtraQuote(jobject.get("templateName").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"socialProviderDeleteById\"")) {
					providerId = removeExtraQuote(jobject.get("providerId").toString());
				}
				if (testCall.equals("\"socialProviderDeleteByUsername\"")) {
					providerName = removeExtraQuote(jobject.get("providerName").toString());
					userName = removeExtraQuote(jobject.get("userName").toString());
				}
				if (testCall.equals("\"socialProviderGetById\"")) {
					providerId = removeExtraQuote(jobject.get("providerId").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"socialProviderGetByUsername\"")) {
					providerName = removeExtraQuote(jobject.get("providerName").toString());
					userName = removeExtraQuote(jobject.get("userName").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (apiCall.equals("\"socialProvidersGetList\"")) {
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
			}
			if (categoryCall.equals("\"SegmentationAPI\"")) {

				if (testCall.equals("\"SegmentationRule\"")) {
					segmentationName = removeExtraQuote(jobject.get("segmentationName").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
				}
				if (testCall.equals("\"enumSegmentationRules\"")) {
					ruleType = removeExtraQuote(jobject.get("ruleType").toString());
					folderId = removeExtraQuote(jobject.get("folderId").toString());
					type = removeExtraQuote(jobject.get("type").toString());
				}
			}
			if (categoryCall.equals("\"TrackedAPI\"")) {
				
				if (testCall.equals("\"getTrackedEvents\"")) {
					eventType = removeExtraQuote(jobject.get("eventType").toString());
					startDatetime = removeExtraQuote(jobject.get("startDatetime").toString());
					endDatetime = removeExtraQuote(jobject.get("endDatetime").toString());
					offset = removeExtraQuote(jobject.get("offset").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				
				if (testCall.equals("\"getTrackedEventsByCampaign\"")) {
					campaignId = removeExtraQuote(jobject.get("campaignId").toString());
					eventType = removeExtraQuote(jobject.get("eventType").toString());
					startDatetime = removeExtraQuote(jobject.get("startDatetime").toString());
					endDatetime = removeExtraQuote(jobject.get("endDatetime").toString());
					offset = removeExtraQuote(jobject.get("offset").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
			}
			if (categoryCall.equals("\"AbAPI\"")) {
				
				if (testCall.equals("\"getAbDefinitions\"")) {
					format = removeExtraQuote(jobject.get("format").toString());
				}
				if (testCall.equals("\"getAbStats\"")) {
					abDefinitionId = removeExtraQuote(jobject.get("abDefinitionId").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"abDefinitionGetById\"")) {
					abDefinitionId = removeExtraQuote(jobject.get("abDefinitionId").toString());
					format = removeExtraQuote(jobject.get("format").toString());
				}
				if (testCall.equals("\"abMailWinner\"")) {
					encryptedId = removeExtraQuote(jobject.get("encryptedId").toString());
				}
			}
			if (categoryCall.equals("\"CustomFieldAPI\"")) {
				
				if (testCall.equals("\"customFieldCreate\"")) {
					fieldName = removeExtraQuote(jobject.get("fieldName").toString());
					fieldDescription = removeExtraQuote(jobject.get("fieldDescription").toString());
					fieldType = removeExtraQuote(jobject.get("fieldType").toString());
				}
				if (testCall.equals("\"customFieldDelete\"")) {
					fieldName = removeExtraQuote(jobject.get("fieldName").toString());
				}
			}
			if (categoryCall.equals("\"ExtraAPI\"")) {
				
				if (testCall.equals("\"uploadSuppressionList\"")) {
					fileName = removeExtraQuote(jobject.get("fileName").toString());
					name = removeExtraQuote(jobject.get("name").toString());
					description = removeExtraQuote(jobject.get("description").toString());
					overwrite = removeExtraQuote(jobject.get("overwrite").toString());
					data = removeExtraQuote(jobject.get("data").toString());
				}
				if (testCall.equals("\"segmentationUpdateAdvancedRule\"")) {
					realmId = removeExtraQuote(jobject.get("realmId").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
					segmentationRuleId = removeExtraQuote(jobject.get("segmentationRuleId").toString());
					segmentationName = removeExtraQuote(jobject.get("segmentationName").toString());
					description = removeExtraQuote(jobject.get("description").toString());
					rules = removeExtraQuote(jobject.get("rules").toString());
				}
				if (testCall.equals("\"getUnsubscribeReport\"")) {
					campaignId = removeExtraQuote(jobject.get("campaignId").toString());
					listId = removeExtraQuote(jobject.get("listId").toString());
					unique = removeExtraQuote(jobject.get("unique").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"getBounceStats\"")) {
					campaignId = removeExtraQuote(jobject.get("campaignId").toString());
					fromDate = removeExtraQuote(jobject.get("fromDate").toString());
					toDate = removeExtraQuote(jobject.get("toDate").toString());
					format = removeExtraQuote(jobject.get("format").toString());
					header = removeExtraQuote(jobject.get("header").toString());
				}
				if (testCall.equals("\"enumArticles\"")) {
					type = removeExtraQuote(jobject.get("type").toString());
				}
			}

				
			//*********************************************END API PARSER*************************//
			
    	}catch (Exception e) {
    		e.getMessage();
    	}                              

    	//return jsonParams;
	}
    
    
	public static Hashtable processCall() {		
		
		Hashtable ht = new Hashtable();
   		for (int i = 1; i<66; i++) {
			//String jsonParams[]	= processJSonParser(i);
			processJSonParser(i);
//			categoryCall		= jsonParams[0];
//			
//			if (categoryCall.contains("List")) {
//				testCall 			= jsonParams[1];
//				realm 				= jsonParams[2];
//				realmId				= jsonParams[3];
//				name				= jsonParams[4];
//				type				= jsonParams[5];
//				newName				= jsonParams[6];
//				listId				= jsonParams[7];
//				
//			} else if(categoryCall.contains("ListAPI")) {
//				licenseKey 			= jsonParams[0];
//				serviceUrl 			= jsonParams[1];
//				apiCall 			= jsonParams[2];
//				listName			= jsonParams[3];
//				creatorEmail		= jsonParams[4];
//				notifyEmail			= jsonParams[5];
//				listId				= jsonParams[6];
//				templateId			= jsonParams[7];
//				segmentationId		= jsonParams[8];
//				forcedFormat		= jsonParams[9];
//				testMode			= jsonParams[10];
//				xmlFlags			= jsonParams[11];
//				type				= jsonParams[13];
//
//			}
					    
			if (categoryCall.equals("List")) {
				if (testCall.equals("ListLists")) {
					ListTest lt = new ListTest();
					try {
						boolean msg = lt.lists(convertToInt(realmId));
						ht.put("LISTLISTS"+countRow , decision(msg));
						countRow++;
					} catch (Exception e) {
						ht.put("LISTLISTS"+countRow, "FAILURE");
						countRow++;
						e.getMessage();
					}
				}
				if (testCall.equals("ListCreate")) {
					ListTest lt = new ListTest();
					try {
						boolean msg = lt.create(convertToInt(realmId), name, convertToInt(type));
						ht.put("LISTCREATE"+countRow , decision(msg));
						countRow++;
					} catch (Exception e) {
						ht.put("LISTCREATE"+countRow, "FAILURE");
						countRow++;
						e.getMessage();
					}
				}
				
				if (testCall.equals("ListCopy")) {
					ListTest lt = new ListTest();
					try {
						boolean msg = lt.copy(convertToInt(realmId), newName, convertToInt(listId));
						ht.put("LISTCOPY"+countRow , decision(msg));
						countRow++;
					} catch (Exception e) {
						ht.put("LISTCOPY"+countRow, "FAILURE");
						countRow++;
						e.getMessage();
					}
				}
							
				if (testCall.equals("ListDelete")) {
					ListTest lt = new ListTest();
					try {
						boolean msg = lt.delete(convertToInt(realmId), newName, name);
						ht.put("LISTDELETE"+countRow , decision(msg));
						countRow++;
					} catch (Exception e) {
						ht.put("LISTDELETE"+countRow, "FAILURE");
						countRow++;
						e.getMessage();
					}
				}
				
			} else if (categoryCall.equals("TemplateTest")) {
				TemplateTest tt = new TemplateTest();
				try {
					tt.Template();
				} catch (Exception e) {
					e.getMessage();
				}
			} else if (categoryCall.equals("SubscriberTest")) {
				SubscriberTest st = new SubscriberTest();
				try {
					st.Subscriber();
				} catch (Exception e){
					e.getMessage();
				}
			//*********************************************API CALLS*****************************//
			} else if(categoryCall.contains("API")) {
				WhatCountsAPI api = null;
				String cookie = "";
				try {
					
					URL endpoint = new java.net.URL(serviceUrl);
					api = (WhatCountsAPI) new WhatCountsAPIServiceLocator().getWhatCountsAPI(endpoint);
					
					cookie = api.beginSession (licenseKey);

				}catch (javax.xml.rpc.ServiceException e){
					e.printStackTrace();
					ht.put("API"+countRow , decision(false));
					countRow++;
					
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					ht.put("API"+countRow , decision(false));
					countRow++;
					
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					ht.put("API"+countRow , decision(false));
					countRow++;
					
				}
					
				if (cookie != null) {
					if (categoryCall.equals("ListAPI")) {
						
						/*
						 * Make API call here
						 */
						ListApiTest lapit = new ListApiTest();
						if (apiCall.equals("ListGetDataByName")) {
							try{
								boolean msg = lapit.listGetDataByName(cookie, api, listName);
								ht.put("listGetDataByName"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("listGetDataByName"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("ListRun")) {
							try {
								boolean msg = lapit.listRun(cookie, api, creatorEmail, notifyEmail, convertToInt(listId), convertToInt(templateId), convertToInt(segmentationId), convertToInt(forcedFormat), convertToBoolean(testMode));
								ht.put("listRun"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("listRun"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("ListRunWithXMLFlags")) {
							try {
								boolean msg = lapit.listRunWithXMLFlags(cookie, api, xmlFlags);
								ht.put("listRunWithXMLFlags"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("listRunWithXMLFlags"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("enumListsInFolder")) {
							try {
								boolean msg = lapit.enumListsInFolder(cookie, api, convertToInt(folderId), convertToInt(type));
								ht.put("enumListsInFolder"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("enumListsInFolder"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("enumLists")) {
							try {
								boolean msg = lapit.enumLists(cookie, api, convertToInt(type));
								ht.put("enumLists"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("enumLists"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					} //END LISTAPI
					if (categoryCall.equals("UserAPI")) {
						/*
						 * Make API call here
						 */
						UserApiTest uapit = new UserApiTest();
						if (testCall.equals("userSearch")) {
							try {
								boolean msg = uapit.userSearch(cookie, api, email, convertToBoolean(exact), convertToBoolean(returnFormat));
								ht.put("userSearch"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSearch"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userSubscribe")) {
							try {
								boolean msg = uapit.userSubscribe(cookie, api, email, convertToInt(listId), Integer.getInteger(emailFormat));
								ht.put("userSubscribe"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscribe"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userGetData")) {
							try {
								boolean msg = uapit.userGetData(cookie, api, email, firstName, "Phone", convertToBoolean(returnFormat));
								ht.put("userGetData"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userGetData"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userGetAllData")) {
							try {
								boolean msg = uapit.userGetAllData(cookie, api, email, convertToBoolean(returnXml));
								ht.put("userGetAllData"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userGetAllData"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userUnSubscribe")) {
							try {
								boolean msg = uapit.userUnSubscribe(cookie, api, email, Integer.getInteger(listId));
								ht.put("userUnSubscribe"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userUnSubscribe"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userUnSubscribeWithFirstName")) {
							try {
								boolean msg = uapit.userUnSubscribeWithFirstName(cookie, api, email, firstName, Integer.getInteger(listId), convertToBoolean(optout), convertToBoolean(universal));		
								ht.put("userUnSubscribeWithFirstName"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userUnSubscribeWithFirstName"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
//						}else if (testCall.equals("userSetDataInt")) {
//							try {
//								boolean msg = upait.userSetDataInt(cookie, api, email, phone);
//								ht.put("userSetDataInt"+countRow , decision(msg));
//								countRow++;
//							}catch (Exception e){
//								ht.put("userSetDataInt"+countRow, "FAILURE");
//								countRow++;
//								e.getMessage();
//							}
//						}else if (testCall.equals("userSetDataString")) {
//							try {
//								boolean msg = upait.userSetDataString(cookie, api, email, city);
//								ht.put("userSetDataString"+countRow , decision(msg));
//								countRow++;
//							}catch (Exception e){
//								ht.put("userSetDataString"+countRow, "FAILURE");
//								countRow++;
//								e.getMessage();
//							}
//						}else if (testCall.equals("userSetData")) {
//							try {
//								boolean msg = upait.userSetData(cookie, api, email);
//								ht.put("userSetData"+countRow , decision(msg));
//								countRow++;
//							}catch (Exception e){
//								ht.put("userSetData"+countRow, "FAILURE");
//								countRow++;
//								e.getMessage();
//							}
						}else if (testCall.equals("userClearData")) {
							try {
								boolean msg = uapit.userClearData(cookie, api, email, address);
								ht.put("userClearData"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userClearData"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userClearAllData")) {
							try {
								boolean msg = uapit.userClearAllData(cookie, api, email);
								ht.put("userClearAllData"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userClearAllData"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userOptOuts")) {
							try {
								boolean msg = uapit.userOptOuts(cookie, api, email, convertToBoolean(exact), convertToBoolean(returnFormat));
								ht.put("userOptOuts"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userOptOuts"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userOptOutsWithFirstName")) {
							try {
								boolean msg = uapit.userOptOutsWithFirstName(cookie, api, email, firstName, convertToBoolean(exact), convertToBoolean(returnFormat));
								ht.put("userOptOutsWithFirstName"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userOptOutsWithFirstName"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userSearchByTag")) {
							try {
								boolean msg = uapit.userSearchByTag(cookie, api, email, subscriberIdTag, convertToBoolean(returnFormat));
								ht.put("userSearchByTag"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSearchByTag"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userSubscribeToLists")) {
							try {
								boolean msg = uapit.userSubscribeToLists(cookie, api, email, firstName, listIds, Integer.getInteger(emailFormat), convertToBoolean(allowDuplicates));
								ht.put("userSubscribeToLists"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscribeToLists"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("userSubscriptions")) {
							try {
								boolean msg = uapit.userSubscriptions(cookie, api, email, firstName, convertToBoolean(exact), convertToBoolean(showCreatedDate), convertToBoolean(returnFormat));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("isUserValid")) {
							try {
								boolean msg = uapit.isUserValid(cookie, api, email, encryptedId);
								ht.put("isUserValid"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("isUserValid"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					} //END USERAPI
					if (categoryCall.equals("SubscriberAPI")) {
						/*
						 * Make API call here
						 */
						SubscriberApiTest sapit = new SubscriberApiTest();
						if (testCall.equals("getSubscriberEvents")) {
							try {
								boolean msg = sapit.getSubscriberEvents(cookie, api, email, firstName, convertToInt(limit), convertToInt(eventType), format, convertToBoolean(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getSubscriberEventsByID")) {
							try {
								boolean msg = sapit.getSubscriberEventsByID(cookie, api, convertToInt(subscriberId), convertToInt(limit), convertToInt(eventType), format, convertToBoolean(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getSubscriberID")) {
							try {
								boolean msg = sapit.getSubscriberID(cookie, api, email, firstName);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getSubscribersInList")) {
							try {
								boolean msg = sapit.getSubscribersInList(cookie, api,  convertToInt(listId), convertToInt(offset), format, convertToInt(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getSubscribersWhoClickedOnURL")) {
							try {
								boolean msg = sapit.getSubscribersWhoClickedOnURL(cookie, api, convertToInt(campaignId), url, convertToInt(exactUrlMatch), convertToInt(unique), format, convertToInt(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}//END SUBSCRIBER
					if (categoryCall.equals("TemplateAPI")) {
						/*
						 * Make API call here
						 */
						TemplateApiTest tapit = new TemplateApiTest();
						if (testCall.equals("templateCopy")) {
							try {
								boolean msg = tapit.templateCopy(cookie, api, srcName, dstName);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("templateCreate")) {
							try {
								boolean msg = tapit.templateCreate(cookie, api, templateName, convertToInt(returnTemplateId));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("templateDelete")) {
							try {
								boolean msg = tapit.templateDelete(cookie, api,  convertToInt(templateId), templateName);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("templateEdit")) {
							try {
								boolean msg = tapit.templateEdit(cookie, api, templateName, convertToInt(element), content);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("templateGetData")) {
							try {
								boolean msg = tapit.templateGetData(cookie, api, templateName, convertToInt(element));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("templateGetDataAll")) {
							try {
								boolean msg = tapit.templateGetDataAll(cookie, api, convertToInt(templateId));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("templateGetDataAllByName")) {
							try {
								boolean msg = tapit.templateGetDataAllByName(cookie, api, templateName);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("templatePreview")) {
							try {
								boolean msg = tapit.templatePreview(cookie, api, templateName, convertToInt(format));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("templateUpdate")) {
							try {
								boolean msg = tapit.templateUpdate(cookie, api, convertToInt(templateId), templateName, subject, 
										htmlContent, plainTextContent, mobile, charSet, convertToBoolean(utf8), convertToInt(contentEncoding));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END TEMPLATE
					if (categoryCall.equals("SendAPI")) {
						/*
						 * Make API call here
						 */
						SendApiTest sapit = new SendApiTest();
						if (testCall.equals("sendMessage")) {
							try {
								MapEntry[] predata = null;
								boolean msg = sapit.sendMessage(cookie, api, convertToInt(templateId), convertToInt(listId), convertToInt(format), 
										from, to, firstName, cc, replyTo, mailFrom, subject, htmlBody, plainTextBody, vmta, predata);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("sendMessageWithXMLFlags")) {
							try {
								MapEntry[] predata = null;
								boolean msg = sapit.sendMessageWithXMLFlags(cookie, api, xmlFlags, subject, htmlBody, plainTextBody, predata);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("sendMessageWATT1")) {
							try {
								MapEntry[] predata = null;
								boolean msg = sapit.sendMessageWATT1(cookie, api, from, replyTo, mailFrom, to, firstName, subject,  
										convertToInt(format), convertToInt(listId), convertToInt(templateId), vmta, predata, attFilename, attBody);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END SEND
					if (categoryCall.equals("CampaignAPI")) {
						/*
						 * Make API call here
						 */
						CampaignApiTest capit = new CampaignApiTest();
						if (testCall.equals("getCampaignClickthroughsOverview")) {
							try {
								boolean msg = capit.getCampaignClickthroughsOverview(cookie, api, convertToInt(campaignId), format, convertToInt(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getBrowserInfoByCampaign")) {
							try {
								boolean msg = capit.getBrowserInfoByCampaign(cookie, api, convertToInt(campaignId), convertToBoolean(bySubscriber), 
										osNameMatch, browserMatch, clientTypeMatch, format, convertToBoolean(headerB));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getCampaignsInDateRange")) {
							try {
								boolean msg = capit.getCampaignsInDateRange(cookie, api, fromDate, toDate, convertToInt(showHidden), format, convertToInt(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getDailyCampaignStats")) {
							try {
								boolean msg = capit.getDailyCampaignStats(cookie, api, convertToInt(campaignId), fromDate, toDate, format, 
										convertToInt(header), version);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END CAMPAIGN
					if (categoryCall.equals("SocialAPI")) {
						/*
						 * Make API call here
						 */
						SocialApiTest sapit = new SocialApiTest();
						if (testCall.equals("socialPostSetForTemplate")) {
							try {
								boolean msg = sapit.socialPostSetForTemplate(cookie, api, convertToInt(templateId), provider, post);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("socialPostsForTemplateGetById")) {
							try {
								boolean msg = sapit.socialPostsForTemplateGetById(cookie, api, convertToInt(templateId), format, convertToBoolean(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("socialPostsForTemplateGetByName")) {
							try {
								boolean msg = sapit.socialPostsForTemplateGetByName(cookie, api, templateName, format, convertToBoolean(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("socialProviderDeleteById")) {
							try {
								boolean msg = sapit.socialProviderDeleteById(cookie, api, convertToInt(providerId));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("socialProviderDeleteByUsername")) {
							try {
								boolean msg = sapit.socialProviderDeleteByUsername(cookie, api, providerName, userName);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("socialProviderGetById")) {
							try {
								boolean msg = sapit.socialProviderGetById(cookie, api, convertToInt(providerId), format, convertToBoolean(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("socialProviderGetByUsername")) {
							try {
								boolean msg = sapit.socialProviderGetByUsername(cookie, api, providerName, userName, format, convertToBoolean(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("socialProvidersGetList")) {
							try {
								boolean msg = sapit.socialProvidersGetList(cookie, api, format, convertToBoolean(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END SOCIAL
					if (categoryCall.equals("SegmantationAPI")) {
						/*
						 * Make API call here
						 */
						SegmentationApiTest sapit = new SegmentationApiTest();
						if (categoryCall.equals("SegmentationRule")) {
							try {
								boolean msg = sapit.segmentationRule(cookie, api, segmentationName, convertToInt(listId));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("enumSegmentationRules")) {
							try {
								boolean msg = sapit.enumSegmentationRules(cookie, api, ruleType, convertToInt(folderId), convertToInt(type));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END SEGMENTATION
					if (categoryCall.equals("TrackedAPI")) {
						/*
						 * Make API call here
						 */
						TrackedApiTest tapit = new TrackedApiTest();
						if (testCall.equals("getTrackedEvents")) {
							try {
								boolean msg = tapit.getTrackedEvents(cookie, api, convertToInt(eventType), startDatetime, endDatetime, convertToInt(offset), 
										format, convertToInt(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getTrackedEventsByCampaign")) {
							try {
								boolean msg = tapit.getTrackedEventsByCampaign(cookie, api,  convertToInt(campaignId), convertToInt(eventType), 
										startDatetime, endDatetime, convertToInt(offset), format, convertToInt(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END TRACKED
					if (categoryCall.equals("AbAPI")) {
						/*
						 * Make API call here
						 */
						AbApiTest abapit = new AbApiTest();
						if (testCall.equals("getAbDefinitions")) {
							try {
								boolean msg = abapit.getAbDefinitions(cookie, api, format);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getAbStats")) {
							try {
								boolean msg = abapit.getAbStats(cookie, api, convertToInt(abDefinitionId), format, convertToBoolean(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("abDefinitionGetById")) {
							try {
								boolean msg = abapit.abDefinitionGetById(cookie, api, convertToInt(abDefinitionId), format);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("abMailWinner")) {
							try {
								boolean msg = abapit.abMailWinner(cookie, api, encryptedId);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END AB
					if (categoryCall.equals("CustomFieldAPI")) {
						/*
						 * Make API call here
						 */
						CustomFieldApiTest capit = new CustomFieldApiTest();
						if (testCall.equals("customFieldCreate")) {
							try {
								boolean msg = capit.customFieldCreate(cookie, api, fieldName, fieldDescription, convertToInt(fieldType));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("customFieldDelete")) {
							try {
								boolean msg = capit.customFieldDelete(cookie, api, fieldName);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END CUSTOMFIELD
					if (categoryCall.equals("ExtraAPI")) {
						/*
						 * Make API call here
						 */
						ExtraApiTest eapit = new ExtraApiTest();
						if (testCall.equals("uploadSuppressionList")) {
							try {
								boolean msg = eapit.uploadSuppressionList(cookie, api, fileName, name, description, convertToBoolean( overwrite), data);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("segmentationUpdateAdvancedRule")) {
							try {
								boolean msg = eapit.segmentationUpdateAdvancedRule(cookie, api, convertToInt(realmId), convertToInt(listId), 
										convertToInt(segmentationRuleId), segmentationName, description, rules);
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getUnsubscribeReport")) {
							try {
								boolean msg = eapit.getUnsubscribeReport(cookie, api, convertToInt(campaignId), convertToInt(listId), convertToInt(unique), 
										format, convertToInt(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("getBounceStats")) {
							try {
								boolean msg = eapit.getBounceStats(cookie, api, convertToInt(campaignId), fromDate, toDate, format, convertToInt(header));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}else if (testCall.equals("enumArticles")) {
							try {
								boolean msg = eapit.enumArticles(cookie, api, convertToInt(type));
								ht.put("userSubscriptions"+countRow , decision(msg));
								countRow++;
							}catch (Exception e){
								ht.put("userSubscriptions"+countRow, "FAILURE");
								countRow++;
								e.getMessage();
							}
						}
					}// END EXTRA
				}
			}
   		}
		return ht;
	}

	
	public static String decision(boolean msg) {
		
		String flag = "";
		if (msg) {
			flag = "SUCCESSFUL";
		}else {
			flag = "FAILURE";
		}
		return flag;
	}
	
	
	public static int convertToInt(String str) {
		
		return Integer.parseInt(str);
	}
	
	public static boolean convertToBoolean(String str) {
		
		return Boolean.getBoolean(str);
	}
	
	public static String removeExtraQuote(String str) {
		String value = str.replace("\"", "");
		return value;
	}
}
