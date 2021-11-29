package com.shaw.Factory._03Create;

public class FactoryTest {
    public static void main(String[] args){
        Factory factoryA = new FactoryA();
        factoryA.manufacture().show();
        Factory factoryB = new FactoryB();
        factoryB.manufacture().show();
    }
}
