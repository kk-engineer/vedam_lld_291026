package com.robosathi.agent.design_patterns.singleton;

public class DBConnection {

    private static DBConnection instance;

    // Private constructor prevents direct instantiation
    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
