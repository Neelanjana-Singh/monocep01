package com.techlabs.builderPattern.test;

import com.techlabs.builderPattern.model.Phone;
import com.techlabs.builderPattern.model.PhoneBuilder;

public class Shop {

	public static void main(String[] args) {
		Phone phone=new PhoneBuilder().setOs("Android").setRam(2).setBattery(4000).getPhone();
		
		System.out.println(phone);

	}

}
