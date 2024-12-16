/*
 *	Author: Giuseppe Como
 *  Date: 10/22/2024
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(10);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(15);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.00);
		pam.raiseSalary(8);
		pam.employeeToString();
		Employee rick = new Employee(3174, "Rick", "Roll", 3217.76);
		rick.raiseSalary(12);
		rick.employeeToString();
		double a = dwight.getAnnualSalary();
		System.out.println("Here is Dwight's annual salary: $" + a);
		double b = jim.getAnnualSalary();
		System.out.println("Here is Jim's annual salary: $" + b);
		double c = pam.getAnnualSalary();
		System.out.println("Here is Pam's annual salary: $" + c);
		double d = rick.getAnnualSalary();
		System.out.println("Here is Rick's annual salary: $" + d);
	}
}
