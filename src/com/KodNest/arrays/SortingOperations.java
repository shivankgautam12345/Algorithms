package com.KodNest.arrays;

import java.util.Scanner;

public class SortingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int  arr1[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of an 1st Array:");
        for(int i = 0;i<=arr1.length-1;i++) {
        	arr1[i] = sc.nextInt();
        }
        Sorting.bubbleSorting(arr1);
        Sorting.InsertionSorting(arr1);

        Sorting.SelectionSorting(arr1);

	}

}
