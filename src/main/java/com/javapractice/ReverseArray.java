package com.javapractice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[]x= {2,4,5,6,7,8};
		int temp;
		for(int i=0;i<x.length/2;i++) {
			temp=x[i];
			x[i]=x[x.length-i-1];
			x[x.length-i-1]=temp;
			
		}
System.out.println(Arrays.toString(x));
		
	}

}
