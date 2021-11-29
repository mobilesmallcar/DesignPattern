package com.shaw.two.Single;

public class SingleObject {
    public static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello world...");
    }
}
