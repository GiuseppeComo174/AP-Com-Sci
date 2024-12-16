/*
 *	Author:  Giuseppe Como
 *  Date: 11/12/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] x){
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
	}
	
	public static int getArrayAverage(int[] x){
		double sum = 0;
		int a = 0;
		int b = 0;
		while(a < x.length){
			sum = sum + x[b];
			a++;
			b++;
		}
		int q = (int)(sum/100);
		return q;
	}
	
	public static int getArrayMax(int[] x){
		int i = Integer.MIN_VALUE;
		for(int b = 0; b < x.length; b++){
			if(x[b] > i){
				i = x[b];
			}
		}
		return i;
	}
	
	public static int getArrayMin(int[] x){
		int v = Integer.MAX_VALUE;
		for(int b = 0; b < x.length; b++){
			if(x[b] < v){
				v = x[b];
			}
		}
		return v;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr = new int[100];
		for(int e = 0; e < arr.length; e++){
			int b = (int)(Math.random() * 100) + 1;
			arr[e] = b;
		}
		toStringArray(arr);
		int r = getArrayAverage(arr);
		System.out.println("The average of 100 random numbers is: " + r);
		int q = getArrayMax(arr);
		System.out.println("The maximum of 100 random numbers is: " + q);
		int y = getArrayMin(arr);
		System.out.println("The minimum of 100 random numbers is: " + y);

		
	}
}
