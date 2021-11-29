package com.shaw.decorator._01Wear;

public class Decorator_three extends Decorator{
    public void wearCoat(){
        System.out.println("穿外套");
    }
    public void walkToAppoint(){
        System.out.println("去约会..");
    }
    public Decorator_three(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        wearCoat();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        walkToAppoint();
    }
}
