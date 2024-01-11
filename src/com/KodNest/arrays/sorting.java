package com.KodNest.arrays;

public class sorting {
       public static void bubblesort(int arr1[]) {
    	   
       }
public static void Insertionsort(int arr1[]) {
	for(int i = 1;i<=arr1.length-1;i++) {
    	int j = i-1;
    	int element  = arr1[i];
    	while(j>=0 && arr1[j]>element) {
    		arr1[j+1]=arr1[j];
    		j--;
    	}
    	arr1[j+1]=element;
    }

       }
public static void Selectionsort(int arr1[]) {
	for(int i = 0;i<=arr1.length-2;i++) {
    	int min  = i;
    	for(int j = i+1;j<=arr1.length-1;j++) {
    		if(arr1[min] > arr1[j]) {
    			int temp =arr1[min];
    			arr1[min] = arr1[j];
    			arr1[j] = temp;
    		}
    	}
    }
}

       
}
