/*
 *	Author: Giuseppe Como
 *  Date: 10/10/2024
*/

import java.util.Scanner;
import java.util.Random;

class Characters{
	String x = new String("Rogue");
	int a = 5;
	int b = 8;
	int c = 7;
	int d = 0;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Characters myCharacter = new Characters();
	System.out.println("Here is your character description!");
	System.out.println("Role: " + myCharacter.x);
	System.out.println("Strength: " + myCharacter.a);
	System.out.println("Dexterity: " + myCharacter.b);
	System.out.println("Intelligence: " + myCharacter.c);
	System.out.println("Charisma: " + myCharacter.d);


		
	}
}
