/*
 *	Author:  Giuseppe Como
 *  Date: 9/26/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Hello! What is your name?");
	String name = sc.nextLine();
	System.out.println("How many times would you like your name to be printed out to the screen?");
	int bob = sc.nextInt();
	sc.nextLine();
	while(true){
		if(bob <= 0){
			break;
		}
		System.out.println(name);
		bob = bob - 1;
		
	}


		
	}
}
