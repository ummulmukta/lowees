package com.javapractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctValue {

	public static void main(String[] args) {
		Collection<String>c=Arrays.asList("dd","dd","uh");
		List<String>list=c.stream().distinct().collect(Collectors.toList());
		
System.out.println(list);
	}

}
