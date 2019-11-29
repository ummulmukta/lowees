package com.utility;

public class Exceltwo {
	public static void main(String[] args) {
		/*
		 * String c=
		 * ExcelReuse.dataRead("C:\\Users\\farha\\Documents\\Book1.xls","mukta",1);
		 * if(c.startsWith("a")) System.out.println(c);
		 */
		String a="ac asdfg tg";
		if(a.startsWith("ac")) {
			String  v=a.replaceFirst("ghjh","hh");
			System.out.println(v);
		}
}
}
