package com.shaw.StrategyVsState.State;

public class StateTest {
    public static void main(String[] args){
//        NoPatternGumballMachine gumballMachine = new NoPatternGumballMachine(2);
//        gumballMachine.insertQuarter();
//        gumballMachine.insertQuarter();
//        gumballMachine.insertQuarter();
//        gumballMachine.insertQuarter();

        GumballMachine gumballMachine1 = new GumballMachine(3);
        gumballMachine1.setState(gumballMachine1.hasQuarterState);
        System.out.println(gumballMachine1.getState());
        System.out.println(gumballMachine1.getCandyCount());
        gumballMachine1.getState().insertQuarter();
//        System.out.println(hasQuarter);
//        hasQuarter.insertQuarter();
//
    }
}
