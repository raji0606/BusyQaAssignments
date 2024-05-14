package Strings;

public class Reverseastring {
	
	    public static void main(String[] args) {
	    
	        String str = "Raji";

	       // reverse
	        String reverse = "";

	        for (int i = str.length()- 1; i >= 0; i--) {
	            reverse += str.charAt(i);
	        }

	        // Displaying the result
	        System.out.println("Original string: " + str);
	        System.out.println("Reversed string: " + reverse);
	    }
	}



