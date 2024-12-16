/*
 *	Author:  Giuseppe Como
 *  Date: 10/3/2024
*/

import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
			Scanner sc = new Scanner(System.in);
			System.out.println("Hello! This is the password checking system. The AI will check to make sure that you have a strong password based on 3 levels: ");
			System.out.println("Level 1: Does your password have 8 or more letters?");
			System.out.println("Level 2: Does your password have a number?");
			System.out.println("Level 3: Does your password have a unique symbol (this is characterized as ~, |, or [)");
			System.out.println("If your password is at Level 3, you have a strong password. Please enter a password: ");
			String a = sc.nextLine();
			if(a.length() >= 8){
				System.out.println("Level 1: Passed");
				if(a.contains("0") || a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8") || a.contains("9")){
					System.out.println("Level 2: Passed");
					if(a.contains("~") || a.contains("|") || a.contains("[")){
						System.out.println("Level 3: Passed");
						System.out.println("Your password is secure!");
					}
				}
			}
			else{
				System.out.println("Level 1: Failed");
				System.out.println("Your password is not secure.");
			}
			
		}
	}


		

