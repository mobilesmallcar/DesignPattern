package com.shaw.strategyPattern.abstractDemo;

public class AbstractDemoTest {
    public static void main(String[] args){
        Action robot = new Robot();
        Action pig = new Pig();
        todoList(robot);
        todoList(pig);

    }
    public static void todoList(Action action){
        action.commond(Action.EAT);
        action.commond(Action.SLEEP);
        action.commond(Action.WORK);
    }
}
