/*
 *	Author: Giuseppe Como
 *  Date: 11/5/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class ArraysForLoops {

	public ArraysForLoops() {
		
		
	}
	
	public void arrays(){
		int []a = new int[1000];
		for(int c = 0; c < 1000; c++){
			int b = (int)(Math.random() * 100) + 1;
			a[c] = b;
			System.out.print(a[c] + " ");
		}
	}

}

