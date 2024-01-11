package com.KodNest.arrays;
import java.util.*;
public class ArraySwappingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc  = new Scanner(System.in);
         int arr[] = new int[sc.nextInt()];
         System.out.println("elements of an array");
          for(int i =0;i<=arr.length-1;i++) {
        	  arr[i] = sc.nextInt();
          }
          System.out.println("give two indexes which is to be swapped");
          int index1 = sc.nextInt();
          int index2 = sc.nextInt();
          for(int i =0;i<=arr.length-1;i++) {
        	  int temp = arr[index1];
        	  arr[index1] = arr[index2];
        	  arr[index2] = temp;
          }
          System.out.println("Display the elements of an array");
          for(int i =0;i<=arr.length-1;i++) {
        	System.out.print(arr[i]+" ");
          }
	}

}
