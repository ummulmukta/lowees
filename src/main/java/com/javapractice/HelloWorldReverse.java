package com.javapractice;

import java.util.Arrays;

public class HelloWorldReverse {

	public static void main(String[] args) {
		String s="Hello world";
		String[]ss=s.split("\\s");
	System.out.println(Arrays.toString(ss));
		for(int i=ss.length-1;i>=0;i--) {
			String re="";
			for(int j=ss[i].length()-1;j>=0;j--) {
				re+=ss[i].charAt(j);
			
		}
		System.out.println(re);		

	}

}}
