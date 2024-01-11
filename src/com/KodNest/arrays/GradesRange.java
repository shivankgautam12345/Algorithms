package com.KodNest.arrays;

public class GradesRange {
   public static int Ranging(int arr1[]) {
	   int count = 0;
	   for(int i = 0;i<=arr1.length-1;i++) {
		   if(arr1[i]>75) {
			   count++;
		   }
	   }return count;
   }
}
