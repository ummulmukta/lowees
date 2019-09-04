package com.javapractice;

public class Maxnumber {

	public static void main(String[] args) {
int []x= {2,4,65,8,7,9};
int max=0;
for(int i=0;i<x.length;i++) {
	if(x[i]>max) {
		max=x[i];
	}
	
}
System.out.println(max);
	}

}
