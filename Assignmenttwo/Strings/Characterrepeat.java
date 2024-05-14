package Strings;
  // 8.Write a Java program to count number of time a character repeated in a string.​
public class Characterrepeat {
	
	
	    public static void main(String[] args) {
	      
	    	        String str = "I am raji";

	    	        
	    	        char targetChar = 'a';

	    	        
	    	        int count = 0;
	    	        for (int i = 0; i < str.length(); i++) {
	    	            if (str.charAt(i) == targetChar) {
	    	                count++;
	    	            }
	    	        }

	    	       
	    	        System.out.println("String: " + str);
	    	        System.out.println("Character '" + targetChar + "' occurs " + count + " times.");
	    	    }
	    	}


