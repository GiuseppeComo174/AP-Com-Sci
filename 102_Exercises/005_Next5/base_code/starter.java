/*
 *	Author: Giuseppe Como
 *  Date: 9/11/2024
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		int bob = sc.nextInt();
		sc.nextLine();
		System.out.println("The next integers are: " + (bob + 1) + ", "  + (bob + 2) + ", " +  (bob + 3) + ", " + (bob + 4) + ", " + (bob + 5));
		System.out.println("The multiples of that integer are: " + (bob * 2) + ", " + (bob * 3) + ", " + (bob * 4) + ", " + (bob * 5) + ", " + (bob * 6));
		double ray = bob;
		System.out.println("The integer divided by 100 is: " + (ray/100));
		System.out.println("The integer divided by 10 is: " + (ray/10));


	}
}
