package com.shaw.StrategyVsState.Strategy;

import com.shaw.StrategyVsState.Strategy.Fly.FlyBehavior;
import com.shaw.StrategyVsState.Strategy.Quack.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public void swim(){
        System.out.println("All duck can swim!");
    }
    public abstract void display();

    //动态改变飞行行为
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    //动态改变鸭叫行为
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
}
