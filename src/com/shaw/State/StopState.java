package com.shaw.State;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("stop state");
        context.setState(this);
    }
    public void getString(){
        System.out.println("stop");
    }
}
