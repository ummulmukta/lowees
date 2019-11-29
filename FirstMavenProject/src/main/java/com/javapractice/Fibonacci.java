package com.javapractice;

public class Fibonacci {

	public static void main(String[] args) {
		int[]x= {3,8,9,45};
		int min=100000;
		for(int i=0;i<x.length;i++) {
			if(x[i]<min)
			min=x[i];
			
		}
		System.out.println(min);

	}

}
