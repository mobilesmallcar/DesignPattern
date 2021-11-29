package com.shaw.two.Single.Pattern;

public class LazySynchronized {
    private static LazySynchronized instance;
    private LazySynchronized(){}
    public static synchronized LazySynchronized getInstance(){
        if(instance==null){
            instance = new LazySynchronized();
        }
        return instance;
    }
}
