/*
 *	Author:  
 *  Date: 
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
		System.out.println("Please enter one more number:");
		int z = sc.nextInt();
		sc.nextLine();
		if((x > y) && (y > z) || (x > z) && (z > y)){
			System.out.println("The greatest integer is: " + x);
		}
		if((y > z) && (z > x) || (y > x) && (x > z)){
			System.out.println("The greatest integer is: " + y);
		}
		if((z > x) && (x > y) || (z > y) && (y > x)){
			System.out.println("The greatest integer is: " + z);
		}
		if((x < y) && (y < z) || (x < z) && (z < y)){
			System.out.println("The smallest integer is: " + x);
		}
		if((y < z) && (z < x) || (y < x) && (x < z)){
			System.out.println("The smallest integer is: " + y);
		}
		if((z < x) && (x < y) || (z < y) && (y < x)){
			System.out.println("The smallest integer is: " + z);
		}
	}
}
