/*
 *	Author: Giuseppe Como
 *  Date: 12/3/2024
 *  Collaborators: None
*/
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a phrase to translate into Pig Latin!");
        String a = sc.nextLine();
        int b = 0;
        int c = 1;
        String d = "";
        int e = 0;
        while(true){
            if(a.indexOf(" ") == -1){
                break;
            }
            int uno = a.indexOf(" ");
            String word = a.substring(e, uno);
            String y = word.substring(b,c);
            if(y.equals("a") || y.equals("e") || y.equals("i") || y.equals("o") || y.equals("u")){
            	d = d + a.substring(e, uno) + "-way" + " ";
            }
            if(!y.equals("a") || !y.equals("e") || !y.equals("i") || !y.equals("o") || !y.equals("u")){
            	String q = y.substring(b,c);
            	y = word.substring(b + 1, c + 1);
            	if(y.equals("a") || y.equals("e") || y.equals("i") || y.equals("o") || y.equals("u")){
            		d = d + a.substring(e + 1, uno) +  "-" + q + "ay" + " ";
            	}
            }
            if(!y.equals("a") || !y.equals("e") || !y.equals("i") || !y.equals("o") || !y.equals("u")){
            	String s = word.substring(b,c);
            	y = word.substring(b + 1, c + 1);
            	if(!y.equals("a") || !y.equals("e") || !y.equals("i") || !y.equals("o") || !y.equals("u")){
            		d = d + a.substring(e + 2, uno) + "-" + s + y + "ay" + " ";
            	}
            }
            a = a.substring(uno + 1);
		}
		System.out.print(d);
	}
}
