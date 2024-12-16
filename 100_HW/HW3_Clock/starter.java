/*
 *	Author: Giuseppe Como
 *  Date: 9/19/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! This is the digital alarm clock. Please enter the day (0-6):");
		int x = sc.nextInt();
		sc.nextLine();
		if(x == 0){
			System.out.println("Wake up! It's Sunday at 10:00 AM. Relax and enjoy the day!");
		}
	    else if(x == 1){
			System.out.println("Wake up! It's Monday at 7:00 AM.");
		}
		else if(x == 2){
			System.out.println("Wake up! It's Tuesday at 7:00 AM.");
		}
		else if(x == 3){
			System.out.println("Rise and shine! It's Wednesday at 7:00 AM.");
		}
		else if(x == 4){
			System.out.println("Rise and shine! It's Thursday at 7:00 AM.");
		}
		else if(x == 5){
			System.out.println("Wake up! It's Friday at 7:00 AM.");
		}
		else if(x == 6){
			System.out.println("Arise, sleeper. It is Saturday at 10:00 AM.");
		}
		else{
			System.out.println("Sorry! You have inputted something invalid. Try again!");
		}
		}
	}

