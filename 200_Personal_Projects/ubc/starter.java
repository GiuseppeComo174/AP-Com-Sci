/*
 *	Author:  Giuseppe Como
 *  Date: 10/3/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int addSum(int a, int b){
		int sum = a + b;
		return sum;
	}
	
	public static int subtractDifference(int a, int b){
		int difference = a - b;
		return difference;
	}
	
	public static int multiplyProduct(int a, int b){
		int product = a * b;
		return product;
	}
	
	public static double divideQuotient(double a, double b){
		double quotient = a / b;
		return quotient;
	}
	
	public static int Remainder(int a, int b){
		int remainder = a % b;
		return remainder;
	}
	
	public static int pow(int a, int b){
		int power = a;
		int z = 1;
		while(z < b){
			power = a * power;
			z = z + 1;
		}
		return power;
	}
	
	public static double squareRoot(int a){
		double b = Math.sqrt(a);
		return b;
	}
	
	public static int maximumValue(int a, int b){
		if(a > b){
			return a;
		}
		return b;
	}
	
	public static int minimumValue(int a, int b){
		if(a < b){
			return a;
		}
		return b;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Hello user! Welcome to the digital calculator! There are 8 things you can do within this calculator:");
		System.out.println("1. You can add two integers.");
		System.out.println("2. You can subtract two integers.");
		System.out.println("3. You can multiply two integers.");
		System.out.println("4. You can divide two integers.");
		System.out.println("5. You can find the remainder between two integers.");
		System.out.println("6. You can take an integer and take it to a specific power (ex. x to the power of y).");
		System.out.println("7. You can take the square root within one integer.");
		System.out.println("8. You can find the maximum value between two integers.");
		System.out.println("9. You can find the minimum value between two integers.");
		System.out.println("Let's begin! Please indicate what you want the digital calculator to do by selecting 1-9 (aka the choices above)");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		while(true){
			if(a < 1 || a > 9){
				System.out.println("You inputted a number either too high or too low. Please enter a number between 1-9.");
				a = sc.nextInt();
				sc.nextLine();
			}	
			else if(a == 1){
				System.out.println("Please choose 1 integer:");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println("Please choose another integer:");
				int c = sc.nextInt();
				sc.nextLine();
				int d = addSum(b,c);
				System.out.println("Here is your sum: " + d);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
			else if(a == 2){
				System.out.println("Please choose 1 integer:");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println("Please choose another integer:");
				int c = sc.nextInt();
				sc.nextLine();
				int d = subtractDifference(b,c);
				System.out.println("Here is your difference: " + d);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
			else if(a == 3){
				System.out.println("Please choose 1 integer:");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println("Please choose another integer:");
				int c = sc.nextInt();
				sc.nextLine();
				int d = multiplyProduct(b,c);
				System.out.println("Here is your product: " + d);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
			else if(a == 4){
				System.out.println("Please choose 1 integer:");
				double b = sc.nextInt();
				sc.nextLine();
				System.out.println("Please choose another integer (cannot be 0):");
				double c = sc.nextInt();
				sc.nextLine();
				if(c == 0){
					System.out.println("You cannot divide a number by 0 in the denominator. Please choose another number.");
					c = sc.nextInt();
					sc.nextLine();
				}
				double d = divideQuotient(b,c);
				System.out.println("Here is your quotient: " + d);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
			else if(a == 5){
				System.out.println("Please choose 1 integer:");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println("Please choose another integer (cannot be 0):");
				int c = sc.nextInt();
				sc.nextLine();
				if(c == 0){
					System.out.println("You cannot divide a number by 0 in the denominator. Please choose another number.");
					c = sc.nextInt();
					sc.nextLine();
				}
				int d = Remainder(b,c);
				System.out.println("Here is your remainder: " + d);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
			else if(a == 6){
				System.out.println("Please choose 1 integer (this will be your base):");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println("Please choose another integer (this will be your power):");
				int c = sc.nextInt();
				sc.nextLine();
				int d = pow(b,c);
				System.out.println("Here is your result: " + d);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
			else if(a == 7){
				System.out.println("Please choose 1 integer:");
				int b = sc.nextInt();
				sc.nextLine();
				double c = squareRoot(b);
				System.out.println("Here is the square root of your integer: " + c);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
			else if(a == 8){
				System.out.println("Please choose 1 integer:");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println("Please choose another integer:");
				int c = sc.nextInt();
				sc.nextLine();
				int d = maximumValue(b,c);
				System.out.println("Here is your maximum value: " + d);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
			else if(a == 9){
				System.out.println("Please choose 1 integer:");
				int b = sc.nextInt();
				sc.nextLine();
				System.out.println("Please choose another integer:");
				int c = sc.nextInt();
				sc.nextLine();
				int d = minimumValue(b,c);
				System.out.println("Here is your minimum value: " + d);
				System.out.println("Would you like to try another operation or would you like to quit the program?");
				String e = sc.nextLine();
				if(e.equals("Yes") || e.equals("yes") || e.equals("Y") || e.equals("y")){
					System.out.println("Which operation would you like to try?");
					a = sc.nextInt();
					sc.nextLine();
				}
				else{
					break;
				}
			}
		}
	}
	}


		

