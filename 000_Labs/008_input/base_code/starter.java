/*
 *	Author:  Giuseppe Como
 *  Date: 9/9/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your full name?"); 
		Scanner sc = new Scanner(System.in);
		String bob = sc.nextLine();
		System.out.println("My full name is " + bob);
		System.out.println("What is your age?");
		int wu = sc.nextInt();
		sc.nextLine();
		System.out.println("I am " + wu + " years old");
		System.out.println("What is your birthday month?");
		String ray = sc.nextLine();
		System.out.println("My birthday month is " + ray);
		System.out.println("What is your birthday day?");
		int olaf = sc.nextInt();
		sc.nextLine();
		System.out.println("My birthday day is on the " + olaf + "th");
		System.out.println("What is your birthday year?");
		int yoon = sc.nextInt();
		sc.nextLine();
		System.out.println("My birthday year is " + yoon);
		System.out.println("How much is a buck fifty?");
		double sun = sc.nextDouble();
		sc.nextLine();
		System.out.println("A buck fifty is $" + sun);
	}
}
