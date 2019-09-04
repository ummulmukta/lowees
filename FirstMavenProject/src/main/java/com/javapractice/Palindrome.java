package com.javapractice;

public class Palindrome {

	public static void main(String[] args) {
		String string="ummu";
		String reverse="";
				for(int i=string.length()-1;i>0;i--) {
			reverse=reverse+string.charAt(i);
		}
if(reverse.equals(string)) {
	System.out.println("true");
}
else {
	System.out.println("false");
}
	}

}
