/*
 *	Author:  Giuseppe Como
 *  Date: 10/16/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Characters myCharacter = new Characters();
		System.out.println("Your role is: " + myCharacter.getRole());
		System.out.println("Your strength is: " + myCharacter.getStrength());
		System.out.println("Your dexterity is: " + myCharacter.getDexterity());
		System.out.println("Your intelligence is: " + myCharacter.getIntelligence());
		System.out.println("Your charisma is: " + myCharacter.getCharisma());
		System.out.println("What role would you like to inherit (choose between wizard, warrior, or rogue)?");
		String b = sc.nextLine();
		Characters myRole = new Characters(b);
		System.out.println("Your role is: " + myRole.getRole());
		System.out.println("Your strength is: " + myRole.getStrength());
		System.out.println("Your dexterity is: " + myRole.getDexterity());
		System.out.println("Your intelligence is: " + myRole.getIntelligence());
		System.out.println("Your charisma is: " + myRole.getCharisma());
		

		
	}
}
