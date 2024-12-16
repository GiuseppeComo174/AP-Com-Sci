/*
 *	Author:  Giuseppe Como
 *  Date: 11/19/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int e = 0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String a = sc.nextLine();
		for(int i = 0; i < a.length(); i++){
			System.out.println(i + " " + a.substring(e,b));
			e++;
			b++;
		}


		
	}
}
