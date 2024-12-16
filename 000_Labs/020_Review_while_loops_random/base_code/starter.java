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
	System.out.println("Welcome to the number guessing game!");
	System.out.println("You will try to guess a number between 1-1000!");
	System.out.println("Please input a number");
	int y = (int)(Math.random() * 1000) + 1;
	int x = sc.nextInt();
	sc.nextLine();
	while(x != y){
		if(x == y){
			break;
		}
		if(x > y){
			System.out.println("Oh no! Your number was too high! Try again and input a number:");
		}
		if(x < y){
			System.out.println("Oh no! Your number was too low! Try again and input a number:");
		}
		x = sc.nextInt();
		sc.nextLine();
	}
	System.out.println("Congratulations! You guessed the number correctly!");


		
	}
}
