/*
 *	Author: Giuseppe Como
 *  Date: 10/1/2024
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int c = 100;
		System.out.println("Welcome to the slot machine game! Here are the rules:"); 
		System.out.println("1. You will start off with $100.");
		System.out.println("2. You will then input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will then roll 3 random numbers between 1-10.");
		System.out.println(" - If the 3 numbers equal each other, then your money will be tripled!");
		System.out.println(" - If 2 numbers out of the 3 equal each other, then your money will be doubled!");
		System.out.println(" - If the 3 numbers do not equal each other, then you lose your money.");
		System.out.println("4. The game will end once you either run out of money or choose to stop the program. Let's begin!");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("Would you like to play the slot machine game? If yes, type Yes, yes, Y, or y. If no, type No, no, N, n, or anything else.");
		String a = sc.nextLine();
		if(a.equals("Yes") || a.equals("yes") || a.equals("Y") || a.equals("y")){
			System.out.println("Please enter the amount of money you would like to wager:");
			int b = sc.nextInt();
			sc.nextLine();
			while(true){
				if(b > c){
					System.out.println("You have inputted a value greater than your total amount of money. Please input a smaller number:");
					b = sc.nextInt();
					sc.nextLine();
				}
				else if(b <= 0){
					System.out.println("You have inputted a value that is not possible to wager in this game. Please enter a bigger number greater than 0:");
					b = sc.nextInt();
					sc.nextLine();
				}
				else if(b <= c){
					System.out.println("Great! Let's play.");
					c = c - b;
					int x = (int)(Math.random() * 10) + 1;
					int y = (int)(Math.random() * 10) + 1;
					int z = (int)(Math.random() * 10) + 1;
					System.out.println("Here is what you rolled:");
					System.out.println("--------------------------");
					System.out.println("| " + x + " | " + y + " | " + z + " | ");
					System.out.println("--------------------------");
					if(x == y && y == z && x == z){
						System.out.println("You won! Your wager has been tripled.");
						b = b * 3;
						c = b + c;
						System.out.println("You now have $" + c + ". Would you like to play again?");
						String e = sc.nextLine();
						if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
							System.out.println("You have $" + c + ". How much would you like to wager?");
							b = sc.nextInt();
							sc.nextLine();
						}
						else{
							System.out.println("You are leaving here with $" + c + ". Come back soon!");
							break;
						}
					}
					else if(x == y || y == z || x == z){
						System.out.println("You won! Your wager has been doubled.");
						b = b * 2;
						c = b + c;
						System.out.println("You now have $" + c + ". Would you like to play again?");
						String f = sc.nextLine();
						if(f.equals("Yes") || f.equals("yes") || f.equals("Y") || f.equals("y")){
							System.out.println("You have $" + c + ". How much would you like to wager?");
							b = sc.nextInt();
							sc.nextLine();
						}
						else{
							System.out.println("You are leaving here with $" + c + ". Come back soon!");
							break;
						    }
					}
					else if(x != y && y != z && x != z){
						if(c == 0){
							System.out.println("Sorry, but you ran out of money! Come back soon!");
							break; 
						}
						System.out.println("You didn't win anything this time. Hopefully you will have better luck!");
						System.out.println("You now have $" + c + ". Would you like to play again?");
						String g = sc.nextLine();
						if(g.equals("Yes") || g.equals("yes") || g.equals("Y") || g.equals("y")){
							System.out.println("You have $" + c + ". How much would you like to wager?");
							b = sc.nextInt();
							sc.nextLine();
							}
						else{
							System.out.println("You are leaving here with $" + c + ". Come back soon!");
							break;
							}
						}
					}
				}
			}
			else{
				System.out.println("So sorry to see you go! Come back soon!");
			}
		}
	}

