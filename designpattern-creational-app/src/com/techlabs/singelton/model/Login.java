package com.techlabs.singelton.model;

public class Login {
	
	private static Login login;
	private Login()
	{
		
	}
	
	public static Login getLogin()
	{
		if(login==null)
			login=new Login(); //lazily call
		return login;
	}
	public String getMessage()
	{
		return "Login successfully";
	}

}

