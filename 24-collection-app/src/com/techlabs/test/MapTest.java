package com.techlabs.test;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "lmn");
		map.put(2, "xyz");
		map.put(3, "uvw");
		map.put(3, "pqr");
		System.out.println(map);

	}

}