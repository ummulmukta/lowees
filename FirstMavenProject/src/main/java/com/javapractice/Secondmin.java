package com.javapractice;

public class Secondmin {

	public static void main(String[] args) {
	int[]x= {1,3,5,6};
	int min=1000;
	int secondmin=1000;
	for(int i=0;i<x.length;i++) {
		if(x[i]<min) {
		secondmin=min;
		min=x[i];
	}
	else if(x[i]<secondmin) {
		secondmin=x[i];
	}

	}
System.out.println(secondmin);
}}
