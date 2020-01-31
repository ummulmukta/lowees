package com.javapractice;

public class ReverseString {

	public static void main(String[] args) {
	String s=" this is practice";
String[]word=s.split("\\s");
String reverse="";

for(String ss:word) {
	StringBuilder sb=new StringBuilder(ss);
	reverse+=sb.reverse().toString()+" ";
}
System.out.println(reverse);

	}

}
