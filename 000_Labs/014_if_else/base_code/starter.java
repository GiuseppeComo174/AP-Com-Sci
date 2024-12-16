/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int x = (int)(Math.random() * 1000) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the number guessing game! Please enter a random number between 1-1000:");
		int y = sc.nextInt();
		sc.nextLine();
		if(x == y){
			System.out.println("Congratulations! You guessed the number correctly!");
		}
		else{
			System.out.println("Oh no! You didn't guess the number correctly. Try again!");
		}
	}
}
