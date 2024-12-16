/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int i;
		String statement;
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		String a = shrek.getName();
		if(shrek.isUgly()){
			statement = new String(a + " IS UGLY!");
			System.out.println(statement);
		}
		donkey.interact(shrek);
		for(i = 0; i < 5; i++){
			shrek.interact(donkey);
		}
		System.out.println("That printed out " + i + " times");

	}
}
