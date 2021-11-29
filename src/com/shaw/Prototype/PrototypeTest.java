package com.shaw.Prototype;

import java.io.Console;

public class PrototypeTest {
    public static void main(String[] args){
        ConcretePrototype concretePrototype = new ConcretePrototype();
        for(int i=0;i<4;i++){
            ConcretePrototype cloneCp = (ConcretePrototype)concretePrototype.copy();
            if(i==2){
                cloneCp.list.add("333");
            }
            cloneCp.show();

        }
//        Console console = new Console();
//        console.
        System.out.println("最原始的:");
        concretePrototype.show();

    }
}
