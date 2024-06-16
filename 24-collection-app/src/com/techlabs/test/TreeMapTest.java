package com.techlabs.test;


import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "lmn");
		map.put(2, "xyz");
		map.put(3, "uvw");
		map.put(3, "pqr");
        map.put(4, "abc");
		System.out.println(map);

	}

}
