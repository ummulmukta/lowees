package com.javapractice;

public class CountWordInSentence {
	
	  public static int countWords(String input) {
	  
	  
	 /* if(input==null||input.isEmpty()) { return 0; }
	  
	  //
	  String[]words=input.split("\\s"); */
	  String[]words=input.split(""); 
	  return words.length;}
	 



public static void main(String[] args) {
	
	int i=CountWordInSentence.countWords("Thereclass");
System.out.println(i);
}



}
