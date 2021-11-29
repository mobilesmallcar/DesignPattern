package com.shaw.decorator._02Eat;

public abstract class Hamburger {
    protected String name;
    public String getName(){
        return this.name;
    }
    public abstract double getPrice();
}
