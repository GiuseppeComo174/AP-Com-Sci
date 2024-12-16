/*
 *	Author:  Giuseppe Como
 *  Date: 9/9/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println(Math.max(-53,-4));
		System.out.println(Math.sqrt(27));
		System.out.println(Math.pow(12,14));
		System.out.println(Math.max(4, 3.464));
		//Java extra
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number:");
		double x = sc.nextDouble();
		sc.nextLine();
		System.out.println("Please enter another number:");
		double y = sc.nextDouble();
		sc.nextLine();
		System.out.print("The max of these two values is: ");
		System.out.println(Math.max(x,y));
		System.out.print("The square root of your second number is: ");
		System.out.println(Math.sqrt(y));
		System.out.print("The value of the power is: ");
		System.out.println(Math.pow(x,y));
	}
}
