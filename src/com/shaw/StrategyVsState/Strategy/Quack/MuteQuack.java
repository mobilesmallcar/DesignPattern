package com.shaw.StrategyVsState.Strategy.Quack;

public class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("我不会叫....");
    }
}
