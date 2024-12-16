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
		else if(y > x){
			System.out.println("Oh no! You went higher than the random number. Try again!");
		}
		else if(y < x){
			System.out.println("Oh no! You went lower than the random number. Try again!");
		}
	}
}
