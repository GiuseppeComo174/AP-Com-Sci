/*
 *	Author:  Giuseppe Como
 *  Date: 11/7/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Algorithm {

	public Algorithm() {
		
		
	}
	
	public void arrays(){
		int x = 0;
		int e = 0;
		double sum = 0;
		int a = (int)(Math.random() * 150) + 51;
		int [] array = new int[a];
		int i = Integer.MIN_VALUE;
		int h = Integer.MAX_VALUE;
		for(int b = 0; b < array.length; b++){
			int c = (int)(Math.random() * 100) + 1;
			array[b] = c;
			if(array[b] < h){
				h = array[b];
			}
			if(array[b] > i){
				i = array[b];
			}
		}
		while(x < array.length){
			sum = sum + array[e];
			e++;
			x++;
			
		}
		System.out.println("There are " + a + " elements.");
		System.out.println("The minimum is: " + h);
		System.out.println("The maximum is: " + i);
		double q = sum/a;
		System.out.println("The average of these elements is: " + q);
	}

}

