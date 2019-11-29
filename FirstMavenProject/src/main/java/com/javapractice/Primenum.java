package com.javapractice;

public class Primenum {

	public static void main(String[] args) {
	int p=9;
	boolean flag=false;
	for(int i=2;i<=p/2;i++) {
		if(p%i==0) {
			flag=true;
			break;
			
		}
	}
	if(!flag) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}

	}

}
