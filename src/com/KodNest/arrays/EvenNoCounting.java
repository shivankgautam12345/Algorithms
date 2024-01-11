package com.KodNest.arrays;

import java.util.Scanner;

public class EvenNoCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the Size of an Array:");
		        int  arr1[] = new int[sc.nextInt()];
		        System.out.println("Enter the elements of an 1st Array:");
		        for(int i = 0;i<=arr1.length-1;i++) {
		        	arr1[i] = sc.nextInt();
		        }
		       System.out.println(EvenNumbers(arr1));
	}
	public static int EvenNumbers(int arr1[] ) {
		int count = 0;
		for(int i = 0;i<=arr1.length-1;i++) {
			if(arr1[i]%2==0) {
				count++;
			}
		}
		
		return count;
	}

}
