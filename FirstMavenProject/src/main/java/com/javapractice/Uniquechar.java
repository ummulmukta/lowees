package com.javapractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Uniquechar {

	public static void main(String[] args) {
		String[] s= {"Hello", "world","Hello"};
		
		Set<String>set=new HashSet<>();
		for(String a:s) {
			set.add(a);
			
		}
		System.out.println(set);
}
}