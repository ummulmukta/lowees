package com.javapractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctCharacter {

	public static void main(String[] args) {
		String s="hello world hello";
		//String[]d=s.split("\\s");
		String[]d=s.split("");
		//ArrayList<String>set=new ArrayList<>();
		
		Set<String>set=new LinkedHashSet<>();
for(String ss:d) {
	set.add(ss);
}
System.out.println(set);
	}

}
