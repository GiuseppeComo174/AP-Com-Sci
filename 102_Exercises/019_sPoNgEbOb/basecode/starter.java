/*
	Author: Giuseppe Como
	Date: 12/5/2024
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		int c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word/phrase: ");
		String x = sc.nextLine();
		System.out.println("Here is your phrase as a sPoNgE CaSe: ");
		while(true){
			if(b > x.length()){
				break;
			}
			String y = x.substring(a, b);
			if(c % 2 != 0){
				y = y.toLowerCase();
				System.out.print(y);
			}
			else if(c % 2 == 0){
				y = y.toUpperCase();
				System.out.print(y);
			}
			a++;
			b++;
			c++;
		}
	}
}
