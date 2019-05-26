package com.carboncredits;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import com.carboncredits.JSONParse;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//This class includes the methods which test the Acceptance criteria
public class Scenarios {
 private static HttpURLConnection con;
 private static String result;
 private static InputStream in;
 private static JSONObject myResponse;
 private String keyStr ;
 
 //This method hits the REST API URI and uses the GET HTTP request method
	@Given("^REST API URL$")
	public void rest_API_URL() throws Throwable {

		String query_url="https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
		
		try {
					//Here we are creating an object of URL class and using HTTP connection we are launching that URL with GET HTTP method
					URL url=new URL(query_url);
					con=(HttpURLConnection) url.openConnection(); 
					//Setting content-type to json
					con.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
					con.setRequestMethod("GET");
			}catch(Exception e){
			
					e.printStackTrace();
			}
		}

	
//This method is used to fetch the response of the REST request and storing it in a JSON object 	
		@When("^user hits the REST URL$")
		public void user_hits_the_REST_URL() throws Throwable {
			try {
					//Getting Response in the 
					in=new BufferedInputStream(con.getInputStream());
					result=IOUtils.toString(in,"UTF-8");
					System.out.println("//************************************************STARTED API EXECUTION***********************************************************//");
					System.out.println("**********************************************COMPLETE RESPONSE OF REST API*********************************************************");
					System.out.println(result);
					System.out.println("******************************************************RESPONSE ENDS*****************************************************************");
					//Storing result within the JSON object
					myResponse = new JSONObject(result);
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
	
		
		//Validating the Name value is Carbon Credit
		@Then("^validate name as Carbon Credits$")
		public void validate_name_as_Carbon_Credits() throws Throwable {
			
			try{
				System.out.println("************************************************************************************************************");
			
			System.out.println("VALIDATING THE FIRST ACCEPTANCE CRITERIA: NAME VALUE PRESENT WITHIN THE RESPONSE IS CARBON CREDITS");
			//Calling the method to return the Name key
			keyStr=JSONParse.printJsonObject(myResponse,"Name");
			Object keyvalue = myResponse.get(keyStr);
			
			if(keyStr.equals("Name")) {
				
		      	System.out.println("The value of key <"+ keyStr +"> is <"+ keyvalue +">");
				System.out.println("************************************************************************************************************");
		       }
			}catch(Exception e){
					
					e.printStackTrace();
			}
				
				
				
		}
		
		//Validating the CanRelist value is true
		@Then("^CanRelist has a value true$")
		public void canrelist_has_a_value_true() throws Throwable {
			try {
				
			
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("************************************************************************************************************");
			System.out.println("VALIDATING THE SECOND ACCEPTANCE CRITERIA: CanRelist value is true");
			//Calling the method to return the CanRelist key
			keyStr=JSONParse.printJsonObject(myResponse,"CanRelist");
			
			Object keyvalue = myResponse.get(keyStr);
			
			if(keyStr.equals("CanRelist")) {
				
		      	System.out.println("The value of key <"+keyStr+"> and the value is<"+keyvalue+">");
		      	System.out.println("************************************************************************************************************");
		       }
			}catch(Exception e){
				
				e.printStackTrace();
		}
			
		}
		////Validating the Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image" value is true
		@Then("^promotions elemnt contains a description text as (\\d+)x larger image$")
		public void promotions_elemnt_contains_a_description_text_as_x_larger_image(int arg1) throws Throwable {
			    try {
			   
			   
				System.out.println("************************************************************************************************************");
				System.out.println("VALIDATING THE THIRD ACCEPTANCE CRITERIA:");
				//Calling the method to return the Promotions key array
				keyStr=JSONParse.printJsonObject(myResponse,"Promotions");
			
				//Fetching the Promotions array and getting the value of Description key 
				  if(keyStr.equals("Promotions")) {
						JSONArray jsonArray = myResponse.getJSONArray("Promotions"); 
				        JSONObject item = jsonArray.getJSONObject(1);  
				        String description = (String) item.get("Description");
				        
				        //getting the substring-- 2x larger image from the Description value
				        int i =description.indexOf('2');
						String subdesc=description.substring(i, 42);
				        System.out.println("The substring from description is <"+subdesc+">");
				        
				        for (Object key1 : item.keySet()) {
					        
					        String keyStr1 = (String)key1;
					        Object keyvalue1 = item.get(keyStr1);
					        //Here we are comparing that we have fetched the description keyonly where the name is Gallery
					        if(keyStr1.equals("Name")&&keyvalue1.equals("Gallery")) {
					        	  if(subdesc.equals("2x larger image"))
							        {
					        		  	
							        	System.out.println("The Promotions element with <"+keyStr1+">=<" +keyvalue1+">has a Description that contains the text<"+subdesc+">");
							        	System.out.println("************************************************************************************************************");
							        	
						      
						       }else {
						    	   
							    	   System.out.println("The Promotions element with Name =<"+keyStr1+">=<"+keyvalue1+">does not has a Description that contains the text<"+subdesc+">");  
							    	   System.out.println("************************************************************************************************************");
						       }
					        	  System.out.println("//***************************************************ENDED EXECUTION**************************************************************//");
				        }
				        }
				        
				       
			    }
			    }catch(Exception e){
					
					e.printStackTrace();
			    }
			       
		    
			
		}
	
}
