package com.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Testtesr {
	public static void main(String[] args) {
		String s="hello world";
		String[]d=s.split("\\s");
		ArrayList<String>list=new ArrayList<>();
		for(String x:d) {
			list.add(x);
		}
		System.out.println(list);
	}
}


