package com.shaw.decorator._02Eat;

public class Chili extends Condiment{

    Hamburger hamburger;
    public Chili(Hamburger hamburger){
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName()+"加辣椒";
    }

    @Override
    public double getPrice() {
        return hamburger.getPrice()+2;
    }
}
