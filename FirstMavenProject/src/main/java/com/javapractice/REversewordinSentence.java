package com.javapractice;

public class REversewordinSentence {

	public static void main(String[] args) {
		
		String s = "how to do in java";
		
		 
		String[] words = s.split(" ");       
		StringBuilder reverseString ="";// new StringBuilder(); 
		for (String word : words)
		{
		   String reverseWord = new StringBuilder(word).reverse().toString();      
		    reverseString.append(reverseWord + " ");                                
		}
	
		System.out.println( reverseString);      
	}

}
