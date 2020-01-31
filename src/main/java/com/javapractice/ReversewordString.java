package com.javapractice;

public class ReversewordString {

	public static void main(String[] args) {
		String s="Hello World";
		String re="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			re+=s.charAt(i);
		}
		
		System.out.println(re);

	}
}