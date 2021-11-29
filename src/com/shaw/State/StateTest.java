package com.shaw.State;

public class StateTest {
    public static void main(String[] args){
        Context context = new Context();
        State startState = new StartState();
        startState.doAction(context);
        startState.getString();
        State stopState = new StopState();
        stopState.doAction(context);
        stopState.getString();
    }
}
