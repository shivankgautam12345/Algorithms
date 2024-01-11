package com.KodNest.arrays;

import java.util.Scanner;

public class CountingGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int arr1[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of an 1st Array:");
        for(int i = 0;i<=arr1.length-1;i++) {
        	arr1[i] = sc.nextInt();
        } 
        int arr2 = GradesRange.Ranging(arr1);
   System.out.println(arr2);	}

}
