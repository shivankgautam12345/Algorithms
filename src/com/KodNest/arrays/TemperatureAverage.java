package com.KodNest.arrays;

public class TemperatureAverage {
    public static float Sum(float arr1[]) {
    	float sum = 0;
    	for(int i = 0;i<=arr1.length-1;i++) {
    		sum = sum+arr1[i];
    	}
    	float average = sum/arr1.length;
    	return average;
    }
}
