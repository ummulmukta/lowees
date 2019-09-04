package com.javapractice;

public class FizzBuzz {

	public static void main(String[] args) {
		int[]x= {2,7,8,9,5,6,4,12,15};
		
for(int i=0;i<x.length;i++) {
	if((x[i]%3==0)&&(x[i]%5==0)) {
		System.out.println("fizzbuzz    "+x[i]);
	}
	else if(x[i]%3==0) {
		System.out.println("Fizz  "+x[i]);
	}
	else if(x[i]%5==0) {
		System.out.println("Buzz  "+x[i]);
	}
	else {
		System.out.println(x[i]);
	}
}
	}

}
