package com.shaw.decorator._02Eat;

public class TestDecorator02 {
    public static void main(String[] args){
        Hamburger hamburger = new ChickenHamburger();
        System.out.println(hamburger.getName()+" 价钱:"+hamburger.getPrice());
        Lettuce lettuce = new Lettuce(hamburger);
        System.out.println(lettuce.getName()+" 价钱:"+lettuce.getPrice());
        Chili chili = new Chili(hamburger);
        System.out.println(chili.getName()+" 价钱:"+chili.getPrice());
        Chili chili2 = new Chili(lettuce);
        System.out.println(chili2.getName()+" 价钱:"+chili2.getPrice());
        Lettuce lettuce2 = new Lettuce(chili);
        System.out.println(lettuce2.getName()+" 价钱:"+lettuce2.getPrice());

    }
}
