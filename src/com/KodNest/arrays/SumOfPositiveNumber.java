package com.KodNest.arrays;
//Emma is working on a personal finance app. She wants to
//calculate the total income from positive transactions. Write a
//Java program that takes an array of transaction amounts and
//calculates the sum of positive amounts.

//Hint: Loop through the array, and if a transaction amount is
//positive, add it to a sum variable.
import java.util.Scanner;

public class SumOfPositiveNumber {

	public static void main(String[] args) {
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
		int sum = 0;
		for(int i = 0;i<=arr1.length-1;i++) {
			if(arr1[i]>0) {
				sum  = sum+arr1[i];
			}
		}return sum;
		}
	}



