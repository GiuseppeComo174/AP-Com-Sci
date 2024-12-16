import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int b = 0;
		int c = 0;
		int d = 0;
		for(int m = 0; m < passwords.length; m++){
		    String a = passwords[m];
		    boolean g = false;;
		    boolean h = false;
	    	if(a.length() >= 8){
		        b++;
		        g = true;
	    	}
		    if(a.contains("!") || a.contains("@") || a.contains("#") || a.contains("^") || a.contains("%") || a.contains("&") || a.contains("$") || a.contains("*")){
		        c++;
		        h = true;
	    	}
		    if(g && h){
		        d++;
	    	}
		}
        System.out.println("There are " + b + " passwords with Strength level 1.");
        System.out.println("There are " + c + " passwords with Strength Level 2.");
        System.out.println("There are " + d + " passwords with Strength Level 3.");
       }
		
	}

