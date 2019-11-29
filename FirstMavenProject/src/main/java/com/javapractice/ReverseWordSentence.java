package com.javapractice;

public class ReverseWordSentence {

	public static void main(String[] args) {
		String s="Hello world";
		String[]r=s.split("\\s");
		String reverse="";
		for(String ss:r) {
			StringBuilder sb=new StringBuilder(ss);
			reverse+=sb.reverse().toString()+" ";
		
		}
		System.out.println(reverse);
	}

}
