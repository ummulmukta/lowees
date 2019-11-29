package com.javapractice;

import java.util.HashSet;
import java.util.Set;

public class TryCode {

	public static int df(String input) {
		
		if(input==null||input.isEmpty()) {
			return 0;
		}
		String[] s=input.split("");
		return s.length;
		}
	public static void main(String[] args) {
		int i=TryCode.df("thiss");
		System.out.println(i);
	}

}
