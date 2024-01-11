package com.KodNest.arrays;

public class SmallestNumbe {
           public static int MinimumNumber(int arr1[]) {
        	    int min  = arr1[0];
        	   for(int i = 0;i<=arr1.length-1;i++) {
        	
        		  if(min>arr1[i]) {
        			 min = arr1[i];
        		  }
        		 
        	 }
        	   return min;  
           }
}
