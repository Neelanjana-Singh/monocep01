package com.techlabs.singelton.model;

public class DatabaseManager {
    
    
    private static DatabaseManager databaseManager;
     private DatabaseManager() {
       
    }
    
    
    public static DatabaseManager getInstance() {
        if (databaseManager == null) {
            databaseManager = new DatabaseManager();
        }
        return databaseManager;
    }
    
    
    public String getConnectionStatus() {
        return "Database connection established successfully";
    }
}
