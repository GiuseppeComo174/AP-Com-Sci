/*
 *	Author: Giuseppe Como
 *  Date: 10/29/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		String a = randName();
		PooleDwarf one = new PooleDwarf(a, 4);
		String b = randName();
		PooleDwarf two = new PooleDwarf(b, 8);
		String c = randName();
		PooleDwarf three = new PooleDwarf(c, 5);
		String d = randName();
		PooleDwarf four = new PooleDwarf(d, 9);
		String e = randName();
		PooleDwarf five = new PooleDwarf(e, 4);
		String f = randName();
		PooleDwarf six = new PooleDwarf(f, 2);
		String g = randName();
		PooleDwarf seven = new PooleDwarf(g, 3);
		int match = 0;
		int whatever = 1;
		while(whatever <= 6){
			PooleDwarf dwarf;
			if(whatever == 1){
				dwarf = two;
				if(one.isSameName(dwarf)){
					match = match + 1;
				}
				whatever = whatever + 1;
			}
			else if(whatever == 2){
				dwarf = three;
				if(one.isSameName(dwarf)){
					match = match + 1;
				}
				whatever = whatever + 1;
			}
			else if(whatever == 3){
				dwarf = four;
				if(one.isSameName(dwarf)){
					match = match + 1;
				}
				whatever = whatever + 1;
			}
			else if(whatever == 4){
				dwarf = five;
				if(one.isSameName(dwarf)){
					match = match + 1;
				}
				whatever = whatever + 1;
			}
			else if(whatever == 5){
				dwarf = six;
				if(one.isSameName(dwarf)){
					match = match + 1;
				}
				whatever = whatever + 1;
			}
			else if(whatever == 6){
				dwarf = seven;
				if(one.isSameName(dwarf)){
					match = match + 1;
				}
				whatever = whatever + 1;
			}
		}
		if(match != 0){
			System.out.println(a + " is the name with " + match + " matches!");
		}
		else{
			System.out.println(a + " is the name with " + match + " matches!");
		}
	}
}