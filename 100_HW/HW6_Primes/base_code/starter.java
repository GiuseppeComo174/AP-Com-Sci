/*
 *	Author: Giuseppe Como
 *  Date: 10/10/2024
*/

import java.util.Scanner;


class starter {
	public static boolean checkPrime(int a){
	int y = 2;
	while(y < a && a > 1){
		if(a % y == 0){
			return false;
		}
		else if(a % y != 0){
			
		}
		y = y + 1;
	}
	return true;
}
	public static void printPrimes(int a){
	int b = 2;
	while(b <= a){
		if(checkPrime(b) == true){
			System.out.println(b);
		}
		b++;
	}
}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer and this program will print out all prime numbers below it!");
		int x = sc.nextInt();
		sc.nextLine();
		printPrimes(x);
	}
}
