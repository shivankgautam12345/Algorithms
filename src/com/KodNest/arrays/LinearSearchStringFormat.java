package com.KodNest.arrays;
import java.util.*;
public class LinearSearchStringFormat {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Creating an array by giving same size
		System.out.println("Enter the size of an array");
        String  arr[] = new String[sc.nextInt()];
        System.out.println("Enter"+arr.length+"numbers to be stored");
        System.out.println("Enter the key is to be found in our array");
        String key = sc.next();
        System.out.println("Enter the elements of an array:");
        for(int i = 0;i<=arr.length-1;i++) {
        	arr[i] = sc.next();		
        }
        //calling a method LinearSearch from different class
        LinearSearchMethod.LinearSearch(arr,key);
          
	}

}
