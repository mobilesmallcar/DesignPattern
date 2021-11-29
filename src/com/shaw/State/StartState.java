package com.shaw.State;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("start state");
        context.setState(this);
    }
    public void getString(){
        System.out.println("start");
    }
}
