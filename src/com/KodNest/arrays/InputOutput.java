package com.KodNest.arrays;
import java.util.*;
public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Scanner sc = new Scanner(System.in);
         //Create an Array
          System.out.println("Giving size to the user Input:"); 
          int arr[] = new int[sc.nextInt()];
          
          //Create an Array input
          System.out.println("Enter the "+arr.length+" user input for an Array:");
          for(int i = 0;i<=arr.length-1;i++) {
        	 arr[i] = sc.nextInt();       	 
          }
          //Displaying an Elements of an array
          System.out.println("Displaying the Elements input for an user:");
          for(int i = 0;i<=arr.length-1;i++) {
        	 System.out.print(arr[i]+" ");
           }

	}

}
