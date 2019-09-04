package com.common;

public class PracticeString {
	public static void main(String[] args) {
		String s = new String("Raveena");
		System.out.println(s.concat(s));
		
		String b = new String("Aidasani");
		System.out.println(b.compareTo(s));
		System.out.println(b.substring(0));
		System.out.println(b.length());
	
	String M = new String("MOM");
	String r = new StringBuffer(s).reverse().toString();
	System.out.println(M);
	System.out.println(r);
}
}
