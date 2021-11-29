package com.shaw.StrategyVsState.Strategy.Fly;

public class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("我不能飞");
    }
}
