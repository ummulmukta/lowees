package com.javapractice;

public class OddNEven {

	public static void main(String[] args) {
		int[]x= {3,6,7,8,9};
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0) {
				System.out.println(x[i]+"  This is even number");
			}
			else {
				System.out.println(x[i]+"  This is odd number");
			}
		}

	}

}
