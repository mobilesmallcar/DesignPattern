package com.shaw.StrategyVsState.Strategy;

import com.shaw.StrategyVsState.Strategy.Fly.FlyNoWay;

public class DuckTest {
    public static void main(String[] args){
        Duck mallarDuck = new MallarDuck();
//        mallarDuck.setFlyBehavior(new FlyNoWay());
        Directory directory = new Directory();
        directory.directory(mallarDuck);
    }
}
