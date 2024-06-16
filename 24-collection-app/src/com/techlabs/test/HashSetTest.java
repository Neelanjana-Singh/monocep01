package com.techlabs.test;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();//here we make it generic
		set.add("abc");
		set.add("xyz");
		set.add("lmn");
		set.add("pqr");
		set.add("abc");//duplicate element not added in list
		System.out.println(set);
		System.out.println(set.size());

	}

}
