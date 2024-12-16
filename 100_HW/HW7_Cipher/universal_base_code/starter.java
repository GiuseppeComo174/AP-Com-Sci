/*
 *	Author: Giuseppe Como
 *  Date: 10/19/2024
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	
	public static String encode(String a){
		String e = Cipher.encode(a);
		return e;
	}
	
	public static String keyedEncode(String a, int b){
		String e = Cipher.keyedEncode(a, b);
		return e;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a message that you want to decipher:");
		String x = sc.nextLine();
		System.out.println("Would you like to enter a key for this encoded message?");
		String y = sc.nextLine();
		if(y.equals("Yes")){
			System.out.println("Please enter a key (aka an integer): ");
			int g = sc.nextInt();
			sc.nextLine();
			String z = keyedEncode(x,g);
			System.out.println("Here is your encoded message: "  + z);
		}
		else if(y.equals("No")){
			String z = encode(x);
			System.out.println("Here is your encoded message: " +  z);
		}
	}
}
