/*
 *	Author: Giuseppe Como
 *  Date: 12/3/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int a = 0;
	int b = 1;
	String whatever = "";
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a sentence:");
	String x = sc.nextLine();
	while(true){
		if(b > x.length()){
			break;
		}
		String y = x.substring(a,b);
		whatever = y + whatever;
		a++;
		b++;
	}
	System.out.println(whatever);

		
	}
}
