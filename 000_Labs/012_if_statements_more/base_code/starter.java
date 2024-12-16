/*
 *	Author:  Giuseppe Como
 *  Date: 9/17/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter another number:");
		int y = sc.nextInt();
		sc.nextLine();
		if(x != y){
			System.out.println("Your two values are not equal to eachother. And the Beetles is the greatest musical band ever!");
		}
		if(x == y){
			System.out.println("Your two values are equal to eachother. And winter is the best season!");
		}
	}
}
