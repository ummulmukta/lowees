package com.javapractice;

import java.util.Arrays;

public class ReverseWordLoop {

	public static void main(String[] args) {
		String s="this is practice";
		String[]word=s.split("\\s");
		String reverse="";
		for(int i=word.length-1;i>=0;i--) {
			String words = word[i];
            
			reverse+=words.charAt(i)+" ";
			}
		
System.out.println(reverse);
	}

}
