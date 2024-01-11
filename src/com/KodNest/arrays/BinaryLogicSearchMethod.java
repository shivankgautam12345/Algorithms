package com.KodNest.arrays;

public class BinaryLogicSearchMethod {
  public static void BinarySearchMethod(int arr[],int key) {
	  int low = 0;
	  int high = arr.length-1;
	  int mid = (low+high)/2;
	  while(low<=high) {
		  if(key==arr[mid]) {
			  System.out.println("key is found at index"+mid);
		  }else if(key>arr[mid]) {
			  low = mid+1;
			  mid = (low+high)/2;
			  
		  }else{ 
			  high = mid-1;
			  mid = (low+high)/2;			  
		  }
	  }System.out.println("key is not present");
  }
}
