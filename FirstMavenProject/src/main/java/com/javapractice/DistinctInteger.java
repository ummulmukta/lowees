package com.javapractice;

import java.util.HashSet;
import java.util.Set;

public class DistinctInteger {

	public static void main(String[] args) {
		int[]i= {2,3,4,4,2,7};
		Set<Integer>inte=new HashSet<>();
		for(int j:i) {
			inte.add(j);
		}
		
System.out.println(inte);
	}

}
