/*
 *	Author: Giuseppe Como
 *  Date: 12/5/2024
*/

package pkg;
import java.util.*;

public class Spiderman {
	String name;
	int age;
	String villain; 
	
	public Spiderman() {
		name = "Miles Morales";
		age = 13;
		villain = "King Pin";
	}
	
	public Spiderman(String a){
		name = a;
		age = 0;
		villain = "None";
	}
	
	public Spiderman(String a, int b){
		name = a;
		age = b;
		villain = "None";
	}
	
	public Spiderman(String a, String c){
		name = a;
		age = 0;
		villain = c;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setVillain(String c){
		villain = c;
	}
	
	public void print(){
		System.out.println("-------------------------------------------------");
		System.out.println("The actor " + name + " is " + age + " years old.");
		System.out.println("They play Spiderman who's villain is " + villain);
		System.out.println("-------------------------------------------------");
		System.out.println("");
	}
}
