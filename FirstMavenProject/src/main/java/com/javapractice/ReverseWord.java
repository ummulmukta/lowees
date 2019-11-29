package com.javapractice;

public class ReverseWord {

	public static void main(String[] args) {
String s="Hello World";
		 String words[]=s.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        reverseWord+=sb.reverse().toString()+" ";  
		        
		    }  
		  System.out.println(reverseWord);    
	}

}
