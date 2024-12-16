import pkg.*;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many special squares would you like to see?");
		int a = sc.nextInt();
		sc.nextLine();
		CVMath.findSpecialSquare(a);
	}
}
