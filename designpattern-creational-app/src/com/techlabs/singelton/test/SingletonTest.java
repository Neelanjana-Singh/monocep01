package com.techlabs.singelton.test;

import com.techlabs.singelton.model.Login;

public class SingletonTest {

	public static void main(String[] args) {
		//Login login=Login.getLogin();
		Login login1=Login.getLogin();
		Login login2=Login.getLogin();
		
		System.out.println(login1.hashCode());
		System.out.println(login2.hashCode());
		
		//System.out.println(login.getMessage());
		System.out.println(login1.getMessage());
		System.out.println(login2.getMessage());

	}

}
