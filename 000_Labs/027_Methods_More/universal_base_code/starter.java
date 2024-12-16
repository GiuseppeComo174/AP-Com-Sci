/*
 *	Author:  
 *  Date: 
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
		System.out.println("What role would you like your character to have?");
		String a = sc.nextLine();
		myCharacter riley = new myCharacter(a);
		if(a.equals("Warrior")){
			System.out.println("Here is your character description: ");
			riley.myToString();
		}
		else if(a.equals("Wizard")){
			System.out.println("Here is your character description: ");
			riley.myToString();
		}
		else if(a.equals("Rogue")){
			System.out.println("Here is your character description: ");
			riley.myToString();
		}
		else{
			System.out.println("No role chosen... rerun program...");
			bob.myToString();
		}
	}
}
