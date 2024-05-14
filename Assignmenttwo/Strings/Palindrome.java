package Strings;

public class Palindrome {  
	
	    public static void main(String[] args) {
	        
	        String inputString = "Raji";

	        //  input string is a palindrome
	        boolean isPalindrome = inputString.equals(new StringBuilder(inputString).reverse().toString());

	        
	        if (isPalindrome) {
	        	
	            System.out.println("The string \"" + inputString + "\" is a palindrome.");
	        } 
	        else {
	        	
	            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
	        }
	    }
	}


	
	

	
	 
