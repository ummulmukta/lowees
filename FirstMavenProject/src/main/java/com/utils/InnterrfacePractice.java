package com.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InnterrfacePractice implements Useerinterfacce, DigitalProduct {

	@Override
	public int getCoins() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DigitalProduct> getWishList() {
		Map<Integer,String>map=new HashMap<>();
		map.put(1,"first");
		map.put(2,"two");
		map.put(3,"three");
		//map.get(2);
		System.out.println(map.get(2));
		return null;
	}
	public static void main(String[] args) {
		InnterrfacePractice a=new InnterrfacePractice();
		a.getWishList();
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCoinPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
