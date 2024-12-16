/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String text = sc.nextLine();
        System.out.println("Hello " + text);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter another number: ");
        int bob = sc.nextInt();
        sc.nextLine();
        System.out.println("The sum of the two integers is: " + (number + bob));
        System.out.println("What is your favorite food");
        String food = sc.nextLine();
        
	}
}