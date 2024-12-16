/*
 *	Author: Giuseppe Como
 *  Date: 11/7/2024
 * 	Collaborator(s): 
*/

import java.util.*;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int a;
		int e = 0;
		int x = 0;
		int [] array = new int[21];
		int b = (int)(Math.random() * 10) + 1;
		System.out.println("-----------------------------------------------------");
		System.out.println("The random number to look for is: " + b);
		System.out.println("Here are the 20 numbers: ");
		while(x < array.length){
			a = (int)(Math.random() * 10) + 1;
			System.out.print(a + " ");
			array[e] = a;
			if(array[e] == b){
				System.out.print("(Duplicate found at index: " + e + ")");
			}
			System.out.println("");
			e++;
			x++;
		}
		System.out.println("-----------------------------------------------------");
		for(int c = 0; c < array.length - 1; c++){
			if(array[c] == array[c+1]){
				System.out.println("Two numbers (in a row) were found at indexes " + c + " and " + (c+1) + ". The number is: " + array[c]);
			}
		}
	}
}