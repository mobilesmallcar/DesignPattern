package com.shaw.decorator._01Wear;

public class Person implements Human{
    @Override
    public void wearClothes() {
        System.out.println("一丝不挂");
    }

    @Override
    public void walkToWhere() {
        System.out.println("有个约会");
    }
}
