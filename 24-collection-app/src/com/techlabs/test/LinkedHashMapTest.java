package com.techlabs.test;


import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(1, "lmn");
		map.put(2, "xyz");
		map.put(3, "uvw");
		map.put(3, "pqr");
		System.out.println(map);

	}

}
