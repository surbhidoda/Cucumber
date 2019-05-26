package com.carboncredits;
import org.json.JSONObject;

public class JSONParse{
	
	 public static String keyStr;
	
	 //This method is used to return the key only when the key is Name or CanRelist or Promotion
	 //This method uses two parameters Rest response object and a parameter for key
	public static String printJsonObject(JSONObject jsonObj,String param)  {
		
		
	    for (Object key : jsonObj.keySet()) {
	    	keyStr = (String)key;
	         
	    	if(keyStr.equals(param)&& param.equals("Name")){
	    		
	    			break;
	    			
	    			}
	        if(keyStr.equals(param)&& param.equals("CanRelist")){
	        		
	        	break;
	        		
	    	  		}
	        if(keyStr.equals(param)&& param.equals("Promotions")){
	        		
	        	break;
	        	
	        }
	     
	    }
	  
	    return keyStr;      
	    
	}

}
