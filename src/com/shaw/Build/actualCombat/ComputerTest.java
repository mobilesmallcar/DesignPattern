package com.shaw.Build.actualCombat;

public class ComputerTest {
    public static void main(String[] args){
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuilder builder = new MacComputer("苹果cpu","苹果内存");
        computerDirector.makeComputer(builder);
        System.out.println(builder.getComputer().toString());
    }
}
