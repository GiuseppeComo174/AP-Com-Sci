/*
 *	Author:  Giuseppe Como
 *  Date: 10/22/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	Scanner sc = new Scanner(System.in);
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public myCharacter(){
		role = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}

	public myCharacter(String a) {
		role = a;
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	public void myToString(){
		System.out.println("Role: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		return;
		
		
	}

}

