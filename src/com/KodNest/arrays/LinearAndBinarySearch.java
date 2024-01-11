package com.KodNest.arrays;
import java.util.*;
public class LinearAndBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int  arr1[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of an 1st Array:");
        for(int i = 0;i<=arr1.length-1;i++) {
        	arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the Key Which We have to Found");
        int x = sc.nextInt();
        int n = sc.nextInt();
       switch(n) {
       case 1:
    	  LinearSearch(arr1,x);
    	  break;
       case 2:
    	   BinarySearch(arr1,x);
    	   break;

       }
       
        	

     
	}public static void LinearSearch(int arr1[],int x){
		for(int i = 0;i<=arr1.length-1;i++) {
			if(arr1[i]==x) {
				System.out.println("Key is Found");
			}else {
				System.out.println("Key is not found");
			}
		}
	}public static void BinarySearch(int arr1[],int x){
		int low = 0;
		int high = arr1.length-1;
		int mid = (low+high)/2;
	
		while(low<=high) {
			if(x==arr1[mid]) {
				System.out.println("key"+x+"is found at Index"+mid);
				return;
			}
			else if(x>arr1[mid]) {
				low = mid+1;
				mid = (low+high)/2;
			}else {
				high = mid-1;
				mid = (low+high)/2;
			}
			}System.out.println("key is not found:");
		}

}
