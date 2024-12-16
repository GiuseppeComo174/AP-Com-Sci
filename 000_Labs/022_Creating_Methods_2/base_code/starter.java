/*
 *	Author: Giuseppe Como
 *  Date: 10/8/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer (this will be your base)!");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter another integer (this will be your exponent)!");
		int b = sc.nextInt();
		sc.nextLine();
		int c = pow(a,b);
		System.out.println(c);
		
	}
	public static int pow(int x, int y){
		int d = x;
		int z = 1;
		while(z < y){
			z = z + 1;
			d = x * d;
		}
		return d;
	}
}
