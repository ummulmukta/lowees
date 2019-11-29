package com.javapractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Prc {

	public static void main(String[] args) {
		String s="Hello world";
		String[]ss=s.split("");
		ArrayList<String>set=new ArrayList<>();
		for(String a:ss) {
			set.add(a);
		} 
		System.out.println(set);
	}

}
