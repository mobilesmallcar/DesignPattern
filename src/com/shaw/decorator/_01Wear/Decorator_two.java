package com.shaw.decorator._01Wear;

public class Decorator_two extends Decorator{
    public void wearBathTowel(){
        System.out.println("穿浴巾");
    }
    public void walkToCloakRoom(){
        System.out.println("去衣帽间");
    }
    public Decorator_two(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        wearBathTowel();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        walkToCloakRoom();
    }
}
