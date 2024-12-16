/*
 *	Author: Giuseppe Como
 *  Date: 9/16/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter your first integer:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter your second integer (must be bigger than first integer): ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.println("Your range is: " + x + " to " + y);
		System.out.print("Here are 5 numbers generated in that range: ");
		int z = (int)(Math.random() * (y-x) + x);
		System.out.print(z);
		int w = (int)(Math.random() * (y-x) + x);
		System.out.print(", " + w);
		int q = (int)(Math.random() * (y-x) + x);
		System.out.print(", " + q);
	    int s = (int)(Math.random() * (y-x) + x);
		System.out.print(", " + s);
		int u = (int)(Math.random() * (y-x) + x);
		System.out.print(", " + u);
	}
}
