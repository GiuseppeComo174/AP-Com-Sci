/*
 *	Author:  Giuseppe Como
 *  Date: 10/22/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter bob = new myCharacter();
		bob.myToString();
		System.out.println("What role would you like to be? Choose between a wizard, warrior, or rogue.");
		String a = sc.nextLine();
		myCharacter rob = new myCharacter(a);
		if(a.equals("Wizard")){
			rob.myToString();
		}
		else if(a.equals("Warrior")){
			rob.myToString();
		}
		else if(a.equals("Rogue")){
			rob.myToString();
		}
		else{
			System.out.println("No role chosen... rerun program..");
			bob.myToString();
		}
		

		
	}
}
