package com.common;

public  class Finallyblock {

	public static void main(String[] args) {
		int a;
		String name="Mukta";
		int l;
		
		try {
			l=name.length();
		}catch (Exception e){
			e.printStackTrace();
			//System.out.println("Catch Exception");	
		}
		Finallyblock f=new Finallyblock();
		f.finalize();
		
		finally {
			System.out.println("example of finally");
		}
		

	}

}
