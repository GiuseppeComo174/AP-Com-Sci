/*
 *	Author: Giuseppe Como
 *  Date: 10/8/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Write a sentence");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		System.out.println("Write a sentence!");
		String y = sc.nextLine();
		System.out.println("This is using the methods!");
		toString(x);
		toStringCombined(x,y);
	}
	public static void toString(String word){
		System.out.println(word);
	}
	public static void toStringCombined(String word, String b){
		System.out.println(word + " " + b);
	}
}
