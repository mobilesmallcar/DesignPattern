package com.shaw.decorator._01Wear;

//使用接口装饰器的话，就可以让子类，必须继承构造方法
//使用抽象类的话，就可以有初始化方法，和初始化属性,子类可以不继承
public abstract class Decorator implements Human{
    private Human human;

    public Decorator(Human human){
        this.human = human;
    }
    public void wearClothes(){
        human.wearClothes();
    }
    public void walkToWhere(){
        human.walkToWhere();
    }
}
