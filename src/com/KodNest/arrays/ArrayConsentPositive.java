package com.KodNest.arrays;
import java.util.*;
public class ArrayConsentPositive {

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

        // Displaying the Elements of the array
        System.out.println("Displaying the user inputs for the array:");
        for (int x : arr) {
        	if(x>0) {
            System.out.print(x + " ");
        }
        	
    }

	}

}
