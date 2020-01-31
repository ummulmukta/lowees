package com.common;

import java.util.Arrays;

public class LargestWord {

	public static void main(String[] args) {
		String s="this is a sentence";
		String[]word=s.split("\\s");
		System.out.println(Arrays.toString(word));
		int max=0;
		String c="";
		for(int i=0;i<word.length;i++) {
			if(word[i].length()>max) {
				max=word[i].length();
				c=word[i];
			}
		}
System.out.println(c+" "+max);
	}

}
