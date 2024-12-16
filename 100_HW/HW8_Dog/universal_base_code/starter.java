/*
 *	Author: Giuseppe Como
 *  Date: 10/26/2024
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Dog bob = new Dog();
		System.out.println("Dog name?");
		String b = sc.nextLine();
		bob.setName(b);
		String c = bob.getName();
		System.out.println("What age should " + c + " be?");
		int r = sc.nextInt();
		sc.nextLine();
		bob.setAge(r);
		int x = bob.getAge();
		Dog stellina = new Dog(b, "Golden Retriver");
		String s = stellina.getBreed();
		System.out.println(c + " is a " + s + " that is " + x + " years old!");
		Dog cocomelon = new Dog("Stellina", 2);
		String j = cocomelon.getName();
		int k = cocomelon.getAge();
		Dog normal = new Dog("Stellina", "chihuahua");
		String l = normal.getBreed();
		System.out.println(j + " is a " + l + " that is " + k + " years old!");
		boolean q = bob.isSleeping();
		if(q == true){
			System.out.print(c + " is awake! ");
			bob.bark();
		}
		else if(q == false){
			System.out.println(c + " is asleep.");
		}
		boolean h = cocomelon.isSleeping();
		if(q == true && h == false){
			System.out.print(j + " wakes up from hearing " + c + "! ");
			cocomelon.bark();
		}
		else if(q == true && h == true){
			System.out.print(j + " hears " + c + ". ");
			cocomelon.bark();
		}
		else if(q == false && h == true){
			System.out.println(j + " is awake!");
		}
		else if(q == false && h == false){
			System.out.println(j + " is sleeping too!");
		}

		



	}
}
