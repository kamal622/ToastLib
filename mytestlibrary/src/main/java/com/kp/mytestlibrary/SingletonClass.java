package com.kp.mytestlibrary;

public class SingletonClass {

    private static SingletonClass mInstance;
    public String data;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (mInstance == null)
            mInstance = new SingletonClass();
        return mInstance;
    }


}