package com.javapractice;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		String s="hello world";
		 String[] words = s.split("\\s");
         
	        String reverseString = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord+=word.charAt(j);
	            }
	             
	            reverseString+=reverseWord + " ";
	       }
	         
	        System.out.println(reverseString);
	         

	}

}
