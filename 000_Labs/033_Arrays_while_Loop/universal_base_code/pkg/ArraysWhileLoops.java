/*
 *	Author: Giuseppe Como
 *  Date: 11/5/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class ArraysWhileLoops {

	public ArraysWhileLoops() {
		
		
	}
	
	public void arrays(){
		int []b = new int[1000];
		int c = 0;
		while(c < 1000){
			int a = (int)(Math.random() * 100) + 1;
			b[c] = a;
			System.out.print(b[c] + " ");
			c++;
		}
	}

}

