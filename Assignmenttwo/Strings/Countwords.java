package Strings;
  // 9.Write a Java program to count number of words in a sentence.​
public class Countwords {
	
	    public static void main(String[] args) {
	      
	        String sentence = "This is a sample sentence.";

	        
	        int wordCount = sentence.split(" ").length;

	      
	        System.out.println("Sentence: " + sentence);
	        System.out.println("Number of words: " + wordCount);
	    }
	}



