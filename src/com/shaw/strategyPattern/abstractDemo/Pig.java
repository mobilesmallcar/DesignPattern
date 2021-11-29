package com.shaw.strategyPattern.abstractDemo;

public class Pig extends Action{
    @Override
    public void eat() {
        System.out.println("你在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("你在睡觉");
    }

    @Override
    public void work() {
        System.out.println("你竟然工作了");
    }
}
