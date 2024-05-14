package Strings;
  //4.Substring
public class Substring {
	
	    public static void main(String[] args) {
	        
	        String str = "I am Raji!";

	       
	        int startIndex = 5;
	        int endIndex = 9;

	      
	        String substring = str.substring(startIndex, endIndex);

	       
	        System.out.println("Original string: " + str);
	        System.out.println("Substring between positions " + startIndex + " and " + endIndex + ": " + substring);
	    }
	}



