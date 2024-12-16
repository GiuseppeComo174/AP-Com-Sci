/*
	Author: Giuseppe Como
	Date: 10/28/2024
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		tobey.setName("Tobey Maguire");
		String a = tobey.getName();
		tobey.setAge(48);
		int b = tobey.getAge();
		tobey.setVillian("Green Goblin");
		String c = tobey.getVillian();
		System.out.println("-----------------------------------------------------");
		System.out.println("Actor: " + a);
		System.out.println("Age: " + b);
		System.out.println("Villain: " + c);
		System.out.println("-----------------------------------------------------");
		Spiderman andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		andrew.setName("Andrew Garfield");
		String d = andrew.getName();
		andrew.setAge(40);
		int e = andrew.getAge();
		andrew.setVillian("Electro");
		String f = andrew.getVillian();
		System.out.println("Actor: " + d);
		System.out.println("Age: " + e);
		System.out.println("Villain: " + f);
		System.out.println("-----------------------------------------------------");
		Spiderman tom = new Spiderman("Tom Holland" , 27, "The Vulture");
		tom.setName("Tom Holland");
		String g = tom.getName();
		andrew.setAge(27);
		int h = tom.getAge();
		andrew.setVillian("The Vulture");
		String i = tom.getVillian();
		System.out.println("Actor: " + g);
		System.out.println("Age: " + h);
		System.out.println("Villain: " + i);
		System.out.println("-----------------------------------------------------");
		Spiderman bob = new Spiderman("Bob Yecry", 31, "Malivore");
		bob.setName("Bob Yecry");
		String j = bob.getName();
		bob.setAge(31);
		int k = bob.getAge();
		bob.setVillian("Malivore");
		String l = bob.getVillian();
		System.out.println("Actor: " + j);
		System.out.println("Age: " + k);
		System.out.println("Villain: " + l);
		bob.fight();
		System.out.println(" ");
		bob.printArt();
		
		
		
		
	}
}
