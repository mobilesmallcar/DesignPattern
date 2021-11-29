package com.shaw.StrategyVsState.Strategy;

import com.shaw.StrategyVsState.Strategy.Fly.FlyWithWings;
import com.shaw.StrategyVsState.Strategy.Quack.Quack;

public class MallarDuck extends Duck{
    public MallarDuck(){
        //可飞
        flyBehavior = new FlyWithWings();
        //呱呱叫
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("看着像绿头鸭");
    }
}
