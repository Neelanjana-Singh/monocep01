package com.techlabs.singelton.test;

import com.techlabs.singelton.model.DatabaseManager;

public class DatabaseManagerTest {

	public static void main(String[] args) {
		   DatabaseManager dbManager = DatabaseManager.getInstance();
	        
	       System.out.println(dbManager.getConnectionStatus());
	        

	}

}
