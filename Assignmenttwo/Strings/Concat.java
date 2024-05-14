package Strings;

import java.util.Scanner;

public class Concat {
	
	public static void main(String[] args) {
		
	
			        Scanner scanner = new Scanner(System.in);

		     	System.out.print("Enter the original string: ");
		        String originalString = scanner.nextLine();

		        System.out.print("Enter the string to concatenate: ");
		        String stringToConcatenate = scanner.nextLine();

		        // Concatenating the strings
		        String concatenatedString = originalString + stringToConcatenate;

		       
		        System.out.println("Concatenated string: " + concatenatedString);

		       
		        scanner.close();
		    
		}


}
