package com.KodNest.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				//Creating an array by giving same size
				System.out.println("Enter the size of an array");
		        int  arr[] = new int[sc.nextInt()];
		        System.out.println("Enter"+arr.length+"numbers to be stored");
		        System.out.println("Enter the key is to be found in our array");
		        int key = sc.nextInt();
		        System.out.println("Enter the elements of an array:");
		        for(int i = 0;i<=arr.length-1;i++) {
		        	arr[i] = sc.nextInt();		
		        }
		        //calling a method LinearSearch from different class
		        BinaryLogicSearchMethod.BinarySearchMethod(arr,key);
		          
			}

		
	}


