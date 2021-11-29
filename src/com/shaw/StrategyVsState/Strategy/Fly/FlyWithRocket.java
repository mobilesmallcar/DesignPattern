package com.shaw.StrategyVsState.Strategy.Fly;

public class FlyWithRocket implements FlyBehavior{
    public void fly(){
        System.out.println("带上火箭筒,飞...");
    }
}
