package com.shaw.two.Single.Pattern;

public class StaticClass {
    private static class InnerStaticClass{
        private static final StaticClass instance = new StaticClass();
    }
    private StaticClass(){}
    public StaticClass getInstance(){
        return InnerStaticClass.instance;
    }
}
