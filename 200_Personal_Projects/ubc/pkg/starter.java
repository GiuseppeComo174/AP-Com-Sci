/*
 *	Author:  Giuseppe Como
 *  Date: 10/3/2024
*/

import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int c = 100;
		System.out.println("Hello player! Welcome to the online game of 21! Here are the rules:");
		System.out.println("1. Your opponent (AI) will pick up 2 cards between numbers 1-13, and you will also pick up 2 cards.");
		System.out.println("2. You will begin with $100. You will wager a certain amount of money. If you win, your wager will be doubled. If you run out of money, you lose");
		System.out.println("3. If you and your opponent tie, you will have to redraw until one of you wins.");
		System.out.println("4. If by some instance that you go over 21, you will lose the money you wager. If both you and your opponent go over 21, you will both redraw.");
		System.out.println("5. The person that has 2 card closest to the number of 21 (without going over) wins! Have fun!");
		System.out.println("Would you like to play the game of 21? Input Yes, yes, Y, or y if you want to play, and type in anything else if no.");
		String a = sc.nextLine();
		if(a.equals("Yes") || a.equals("yes") || a.equals("Y") || a.equals("y")){
			System.out.println("Alright! Let's begin. How much money would you like to wager?");
			int b = sc.nextInt();
			sc.nextLine();
			while(true){
				if(b > c){
					System.out.println("You inputted a number that is beyond your wager. Please enter a smaller number.");
					b = sc.nextInt();
					sc.nextLine();
				}
				else if(b <= 0){
					System.out.println("You inputted a number that is not possible to input as your wager. Please enter a number bigger than 0.");
					b = sc.nextInt();
					sc.nextLine();
				}
				else if(b <= c){
					System.out.println("Here are your 2 cards:");
					int x = (int)(Math.random() * 13) + 1;
					int y = (int)(Math.random() * 13) + 1;
					int z = x + y;
					System.out.println(x + " and " + y);
					System.out.println("Total (you): " + z);
					System.out.println("And here is what your opponent drew:");
					int p = (int)(Math.random() * 13) + 1;
					int q = (int)(Math.random() * 13) + 1;
					int r = p + q;
					System.out.println(p + " and " + q);
					System.out.println("Total (AI): " + r);
					if(z > 21 && r > 21){
						System.out.println("Oh! You both went over 21. You will both have to redraw.");
					}
					else if(z > 21){
						c = c - b;
						if(c == 0){
							System.out.println("You ran out of money! Please come back anytime!");
							break;
						}
						System.out.println("Oh no! You went over 21! You lost your wager.");
						System.out.println("You have $" + c + ". Would you like to play again?");
						String d = sc.nextLine();
						if(d.equals("Yes") || d.equals("yes") || d.equals("Y") || d.equals("y")){
							System.out.println("You have $" + c + ". How much would you like to wager?");
							b = sc.nextInt();
							sc.nextLine();
						}
						else{
							System.out.println("You are leaving here with $" + c + ". Come back soon!");
							break;
						}
					}
					else if(r > 21){
						c = c - b;
						b = b * 2;
						c = b + c;
						System.out.println("Congratulations! Your opponent went over 21. Your wager has been doubled and added to your total amount of money.");
						System.out.println("You now have $" + c + ". Would you like to try again?");
						String w = sc.nextLine();
						if(w.equals("Yes") || w.equals("yes") || w.equals("Y") || w.equals("y")){
							System.out.println("You have $" + c + ". How much would you like to wager?");
							b = sc.nextInt();
							sc.nextLine();
						}
						else{
							System.out.println("You are leaving here with $" + c + ". Come back soon!");
							break;
						}
					}
					else if(z < r){
						c = c - b;
						if(c == 0){
							System.out.println("You ran out of money! Please come back anytime!");
							break;
						}
						System.out.println("Oh no! You lost the wager. You now have $" + c + ". Would you like to try again?");
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
					else if(z > r){
						c = c - b;
						b = b * 2;
						c = b + c;
						System.out.println("Congratulations! Your wager has been doubled and added to your total amount of money!");
						System.out.println("You now have $" + c + ". Would you like to try again?");
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
					else if(z == r){
						System.out.println("Oh! You both got a tie! You both will have to redraw!");
					}
				}
			}
		}
		else{
			System.out.println("Ok! Please come back soon!");
		}
		


		
	}
}
