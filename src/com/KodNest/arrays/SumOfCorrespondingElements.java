package com.KodNest.arrays;

import java.util.Scanner;

public class SumOfCorrespondingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int arr1[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of an 1st Array:");
        for(int i = 0;i<=arr1.length-1;i++) {
        	arr1[i] = sc.nextInt();
        } 
        System.out.println("Enter the Size of an Array:");
        int arr2[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of an 2nd Array:");
        for(int i = 0;i<=arr2.length-1;i++) {
        	arr2[i] = sc.nextInt();
        } 
        
        
       int[] arr= SumCorresponding.sumThirdArray(arr1,arr2);
        System.out.println("Display the Elements of an Array:");
        for(int i = 0;i<=arr.length-1;i++) {

            System.out.print(arr[i] + " ");
            }
            System.out.println();

	}

	}


