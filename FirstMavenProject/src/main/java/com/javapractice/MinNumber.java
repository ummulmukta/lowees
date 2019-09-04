package com.javapractice;

public class MinNumber {

	public static void main(String[] args) {
		int[]x= {2,4,5,6,7};
		int min=100000;
		for(int i=0;i<x.length;i++) {
			if(x[i]<min) {
				min=x[i];
		}
		}
System.out.println(min);
	}

}
