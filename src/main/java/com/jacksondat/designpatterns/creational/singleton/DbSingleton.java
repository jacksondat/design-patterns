package com.jacksondat.designpatterns.creational.singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;

    private DbSingleton() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized(DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}
