package com.KodNest.arrays;

public class LinearSearchMethod {

	public static String LinearSearch(String []arr,String key) {
		      for(int i = 0;i<=arr.length-1;i++) {
		    	  if(arr[i] == key) {
		    		  return "key"+key+"is present at index"+i;
		    		  
		    	  }
		      }return "key"+key+"is not present";
	}

}