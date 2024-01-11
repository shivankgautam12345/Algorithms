package com.KodNest.arrays;

import java.util.Scanner;

public class SwappingTempArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Create an Array
        System.out.println("Giving size to the user Input:");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];

        // Create an Array input
        System.out.println("Enter " + arr.length + " user inputs for the Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
        	int temp  = arr[index1];
        	arr[index1] = arr[index2];
        	arr[index2] = temp;

      
        }
        // Displaying the Elements of the array
        System.out.println("Displaying the user inputs for the array:");
        
        for (int x : arr) {
        	            System.out.print(x + " ");
        }
        	
    }


}
