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
		System.out.println("Hello player! Please input your name.");
		String x = sc.nextLine();
		System.out.println("Now, please enter your character title.");
		String y = sc.nextLine();
		System.out.println("Alright " + x + ". Do you wish to be a Wizard, Warrior, or a Rogue?");
		String z = sc.nextLine();
		if(z.equals("Wizard") || z.equals("wizard")){
			System.out.println("Congratulations! You are a wizard!");
		}
		else if(z.equals("Warrior") || z.equals("warrior")){
			System.out.println("RAHHHH! You are a warrior!");
		}
		else if(z.equals("Rogue") || z.equals("rogue")){
			System.out.println("Watch out! You are a rogue!");
		}
		else{
			System.out.println("Oh! You chose a unique role of your own. I see.");
		}
		
			System.out.println("It is time to build your character stats! You have a maximum of 20 points which you can spend on the following 4 categories:");
			System.out.println("Strength: You will be able to carry larger items and you will be stronger.");
			System.out.println("Dexterity: You will be more agile and you will be faster.");
			System.out.println("Intelligence: You will be better at magical spells.");
			System.out.println("Charisma: You will have a more agreeable personality, allowing you to build support along your journey.");
			System.out.println("For each category, you will only be able to spend up to 10 points.");
			System.out.println("How many points do you wish to spend on your strength?");
			int bob = 20;
			int ray = sc.nextInt();
			sc.nextLine();
			if(ray > 10){
				System.out.println("You spent too many points on Strength. Please input a smaller number between 0-10!");
				ray = sc.nextInt();
				sc.nextLine();
			}
			int til = bob - ray;
			if(ray <= 10){
				System.out.println("You chose to spend " + ray + " points on your strength. You have " + til + " points left.");
				System.out.println("How many points do you wish to spend on your dexterity?");
				int yu = sc.nextInt();
				sc.nextLine();
				if(yu > 10){
					System.out.println("You spent too many points on Dexterity. Please input a smaller number between 0-10!");
					yu = sc.nextInt();
					sc.nextLine();
				}
				int fin = til - yu;
			    if(fin == 0){
					System.out.println("You ran out of points! Here is your overall character description:");
					System.out.println("Name: " + x);
					System.out.println("Character title: " + y);
					System.out.println("Role: " + z);
					System.out.println("Strength: " + ray);
					System.out.println("Dexterity: " + yu);
					System.out.println("Intelligence: 0");
					System.out.println("Charisma: 0");
				}
			    if(fin > 0){
					System.out.println("You chose to spend " + yu + " points on your dexterity. You have " + fin + " points left.");
					System.out.println("How many points do you wish to spend on your intelligence?");
					int rob = sc.nextInt();
					sc.nextLine();
					if(rob > 10 || rob > fin){
						System.out.println("You either spent too many points on Intelligence or you went over your budget.");
						System.out.println("Please input a number between 0-10 or a number within your budget, which is: " + fin);
						rob = sc.nextInt();
						sc.nextLine();
					}
					int venus = fin - rob;
				    if(venus == 0){
						System.out.println("You ran out of points! Here is your overall character description:");
						System.out.println("Name: " + x);
						System.out.println("Character title: " + y);
						System.out.println("Role: " + z);
						System.out.println("Strength: " + ray);
						System.out.println("Dexterity: " + yu);
						System.out.println("Intelligence: " + rob);
						System.out.println("Charisma: 0");
					}
					if(venus > 0){
						System.out.println("You chose to spend " + rob + " points on your intelligence. You have " + venus + " points left.");
						System.out.println("How many points do you wish to spend on your charisma?");
						int evans = sc.nextInt();
						sc.nextLine();
						if(evans > 10 || evans > venus){
							System.out.println("You either spent too many points on Charisma or you went over your budget.");
							System.out.println("Please input a number between 0-10 or a number within your budget, which is: " + venus);
							evans = sc.nextInt();
							sc.nextLine();
						}
						int pluto = venus - evans;
					    if(pluto == 0){
							System.out.println("You ran out of points! Here is your overall character description:");
							System.out.println("Name: " + x);
							System.out.println("Character title: " + y);
							System.out.println("Role: " + z);
							System.out.println("Strength: " + ray);
							System.out.println("Dexterity: " + yu);
							System.out.println("Intelligence: " + rob);
							System.out.println("Charisma: " + evans);
						}
					    if(pluto > 0){
							System.out.println("You still have " + pluto + " point(s) left.");
							System.out.println("Here is your overall character description:");
							System.out.println("Name: " + x);
							System.out.println("Character title: " + y);
							System.out.println("Role: " + z);
							System.out.println("Strength: " + ray);
							System.out.println("Dexterity: " + yu);
							System.out.println("Intelligence: " + rob);
							System.out.println("Charisma: " + evans);
						}
					}
				}
		}
		
}
}