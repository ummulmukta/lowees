package com.javapractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseeString {

	public static void main(String[] args) {
		String s="hello world";
		String[]d=s.split(" ");
		String re
		for(int i=d.length-1;i>=0;i--) {
			re=re+d.toString();
		}
		System.out.println(re);
		/*
		 * Set<String>set=new LinkedHashSet<>(); for(String ss:d) { set.add(ss);
		 * 
		 * }
		 * 
		 * System.out.println(set);
		 */
	}

}
