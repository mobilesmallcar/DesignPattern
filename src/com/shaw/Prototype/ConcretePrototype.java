package com.shaw.Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcretePrototype extends Prototype{

    public ConcretePrototype(){
        list.add("1");
        list.add("2");
    }
    public void show(){
        System.out.println("原型模式实现类");
        System.out.println(list);
    }
}
