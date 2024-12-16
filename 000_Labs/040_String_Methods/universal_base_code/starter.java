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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name and a last name with a space in the middle.");
		String a = sc.nextLine();
		int b = a.indexOf(" ");
		int c = a.length();
		System.out.println("The last name is: " + a.substring(b + 1,c));
	}
}
