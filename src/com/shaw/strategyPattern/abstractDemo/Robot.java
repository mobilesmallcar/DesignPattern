package com.shaw.strategyPattern.abstractDemo;

public class Robot extends Action{
    @Override
    public void eat() {
        System.out.println("机器人在充电");
    }

    @Override
    public void sleep() {
        System.out.println("机器人在休眠中..");
    }

    @Override
    public void work() {
        System.out.println("机器人在飞速工作");
    }
}
