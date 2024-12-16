/*
 *	Author:  Giuseppe Como
 *  Date: 10/16/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Characters {
	Scanner sc = new Scanner(System.in);
	String a;
	int strength;
	int dexterity;
	int intelligence;
	int charisma; 
	
	public Characters(){
		a = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}

	public Characters(String aa) {
		if(aa.equals("Wizard")){
			System.out.println("You have chosen to be a wizard and inhertied magical powers!");
			a = "Wizard";
			strength = 0;
			dexterity = 0;
			intelligence = 5;
			charisma = 0;
		}
		else if(aa.equals("Warrior")){
			System.out.println("You have chosen to be a warrior and inherited outstanding physical strength!");
			a = "Warrior";
			strength = 5;
			dexterity = 0;
			intelligence = 0;
			charisma = 0;
		}
		else if(aa.equals("Rogue")){
			a = "Rogue";
			System.out.println("You have chosen to be a rogue! How cunning.");
			strength = 0;
			dexterity = 5;
			intelligence = 0;
			charisma = 0;
		}
		else{
			System.out.println("Rerunning program...");
			a = "No role";
			strength = 0;
			dexterity = 0;
			intelligence = 0;
			charisma = 0;
		}
	}
	
	public String getRole(){
		return a; 
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getDexterity(){
		return dexterity;
	}
	
	public int getIntelligence(){
		return intelligence;
	}
	
	public int getCharisma(){
		return charisma;
	}
		

}

