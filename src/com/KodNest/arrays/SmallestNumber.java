package com.KodNest.arrays;

import java.util.Scanner;

// Finding the Smallest Number
//Alice is playing a game where she's given a list of numbers and
//she needs to find the smallest number. Write a Java program to
//help Alice find the smallest number in an array.
//Hint: Initialize a variable to store the smallest number, then
//iterate through the array and update the variable if a smaller
//number is found.
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int  arr1[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of an 1st Array:");
        for(int i = 0;i<=arr1.length-1;i++) {
        	arr1[i] = sc.nextInt();
        }
        System.out.println(SmallestNumbe.MinimumNumber(arr1));
        
	}

}
