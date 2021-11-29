package com.shaw.decorator._02Eat;

public class ChickenHamburger extends Hamburger{
    public ChickenHamburger(){
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
