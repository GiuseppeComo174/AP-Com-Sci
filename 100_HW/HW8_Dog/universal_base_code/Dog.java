/*
 *	Author: Giuseppe Como
 *  Date: 10/21/2024
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class Dog {
	String name;
	int age;
	String breed;
	public Dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String c){
		name = a;
		age = 1;
		breed = c;
	}
	public Dog(String a, int b){
		name = a;
		age = b;
		breed = "dog dog";
	}
	public void setName(String a){
		name = a;
		return;
	}
	public String getName(){
		setName(name);
		return name;
	}
	public void setAge(int b){
		age = b;
		return;
	}
	public int getAge(){
		setAge(age);
		return age;
	}
	public void setBreed(String c){
		breed = c;
		return;
	}
	public String getBreed(){
		setBreed(breed);
		return breed;
	}
	public boolean isSleeping(){
		int x = (int)(Math.random() * 2);
		if(x == 0){
			return true;
		}
		return false;
	}
	public void bark(){
		System.out.println(getName() + " barks!");
		return;
	}
}
