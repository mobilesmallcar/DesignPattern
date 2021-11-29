package com.shaw.decorator._01Wear;

public class TestDecorator {
    public static void main(String[] args){
        Human person = new Person();
//        Decorator decorator = new Decorator_first(new Decorator_two(new Decorator_three(person)));
        Decorator decorator = new Decorator_three(new Decorator_two(new Decorator_first(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
