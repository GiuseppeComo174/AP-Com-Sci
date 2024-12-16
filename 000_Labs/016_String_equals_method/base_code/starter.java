/*
 *	Author:  Giuseppe Como
 *  Date: 9/23/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello player! Do you wish to be a Wizard, Warrior, or a Rogue?");
		String x = sc.nextLine();
		if(x.equals("Wizard") || x.equals("wizard")){
			System.out.println("Congratulations! You are a wizard!");
		}
		else if(x.equals("Warrior") || x.equals("warrior")){
			System.out.println("RAHHHH! You are a warrior!");
		}
		else if(x.equals("Rogue") || x.equals("rogue")){
			System.out.println("Watch out! You are a rogue!");
		}
		else{
			System.out.println("Sorry! You have inputted something invalid. Please input Wizard, Warrior, or Rogue.");
		}
		
	}
}
