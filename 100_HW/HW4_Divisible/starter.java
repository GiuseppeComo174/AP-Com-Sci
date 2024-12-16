/*
 *	Author: Giuseppe Como
 *  Date: 9/24/2024
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter another integer:");
		int y = sc.nextInt();
		sc.nextLine();
		if(x%2 == 0){
			System.out.println("The first integer is even!");
			if(x%3 == 0){
				System.out.println("The first integer is divisible by 3!");
			}
			if(x%4 == 0){
				System.out.println("The first integer is divisible by 4!");
			}
			if(x%5 == 0){
				System.out.println("The first integer is divisible by 5!");
			}
			if(x%3 != 0 && x%4 != 0 && x%5 != 0){
				System.out.println("The first integer is not divisible by 3, 4, and 5!");
			}
		}
		else if(x%2 != 0){
			System.out.println("The first integer is NOT even!");
			if(x%3 == 0){
				System.out.println("The first integer is divisible by 3!");
			}
			if(x%4 == 0){
				System.out.println("The first integer is divisible by 4!");
			}
			if(x%5 == 0){
				System.out.println("The first integer is divisible by 5!");
			}
			if(x%3 != 0 && x%4 != 0 && x%5 != 0){
				System.out.println("The first integer is not divisible by 3, 4, and 5!");
			}
		}
		if(y%2 == 0){
			System.out.println("The second integer is even!");
			if(y%3 == 0){
				System.out.println("The second integer is divisible by 3!");
			}
			if(y%4 == 0){
				System.out.println("The second integer is divisible by 4!");
			}
			if(y%5 == 0){
				System.out.println("The second integer is divisible by 5!");
			}
			if(y%3 != 0 && y%4 != 0 && y%5 != 0){
				System.out.println("The second integer is not divisible by 3, 4, and 5!");
			}
		}
		else if(y%2 != 0){
			System.out.println("The second integer is NOT even!");
			if(y%3 == 0){
				System.out.println("The second integer is divisible by 3!");
			}
			if(y%4 == 0){
				System.out.println("The second integer is divisible by 4!");
			}
			if(y%5 == 0){
				System.out.println("The second integer is divisible by 5!");
			}
			if(y%3 != 0 && y%4 != 0 && y%5 != 0){
				System.out.println("The second integer is not divisible by 3, 4, and 5!");
			}
		}
	}
}
