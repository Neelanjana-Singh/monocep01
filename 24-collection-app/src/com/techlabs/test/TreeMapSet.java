package com.techlabs.test;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSet {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "lmn");
		map.put(2, "xyz");
		map.put(3, "uvw");
		map.put(3, "pqr");
		
		Set<Map.Entry<Integer,String>> entries=map.entrySet();
		
		for(Map.Entry entry:entries)
		{
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}
		//System.out.println(map);

	}

}
