/*
 *	Author: Giuseppe Como
 *  Date: 11/5/2024
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int []x = new int[1000];
		 int []y = new int[1002];
		 int c = 3;
		 int d = 1000;
		 for(int a = 0; a < 1000; a++){
		 	System.out.print(c + " ");
		 	x[a] = c;
		 	c = c + 3;
		 }
		 System.out.println(" ");
		 for(int b = 1001; b > 0; b--){
		 	System.out.print(d + " ");
		 	y[b] = d;
		 	d = d - 1;
		 }
	}
}
