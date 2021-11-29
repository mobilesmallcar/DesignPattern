package com.shaw.decorator._01Wear;

public class Decorator_first extends Decorator{
    public void wearInner(){
        System.out.println("穿内衣");
    }

    public void walkToHome(){
        System.out.println("去澡堂");
    }
    public Decorator_first(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        wearInner();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        walkToHome();
    }
}
