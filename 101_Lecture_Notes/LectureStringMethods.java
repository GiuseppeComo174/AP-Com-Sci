/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/import java.util.Scanner;

class LectureStringMethods{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String a = sc.nextLine();
        
        while(true){
            if(a.indexOf(" ") == -1){
                System.out.println(a);
                break;
            }
            int uno = a.indexOf(" ");
            String word = a.substring(0, uno);
            a = a.substring(uno + 1);
            System.out.print(word + " ");
        }
	}
}