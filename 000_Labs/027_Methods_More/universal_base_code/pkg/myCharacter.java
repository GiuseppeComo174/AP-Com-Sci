/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;

	public myCharacter() {
		role = "No role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public myCharacter(String a){
		role = a;
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public String setRole(String b){
		role = b;
		if(b == "Wizard"){
			b = "Wizard";
		}
		else if(b == "Warrior"){
			b = "Warrior";
		}
		else if(b == "Rogue"){
			b = "Rogue";
		}
		else if(!b.equals("Wizard") || !b.equals("Warrior") || !b.equals("Rogue")){
			b = "No role";
			return b;
		}
		return b;
	}
	
	public int setStrength(int c){
	    c = 0;
		return c;
	}
	
	public int setDexterity(int d){
	    d = 0;
		return d;
	}
	
	
	public int setIntelligence(int e){
	    e = 0;
		return e;
	}
	
	public int setCharisma(int f){
	    f = 0;
		return f;
	}
	
	public boolean setAll(String b, int c, int d, int e, int f){
		return true;
	}
	
	public void myToString(){
		System.out.println("Role: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		if(!role.equals("Warrior") || !role.equals("Wizard") || !role.equals("Rogue")){
			role = "No role";
		}
		return;
	}

}

