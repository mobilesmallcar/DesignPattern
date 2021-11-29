package com.shaw.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> list = new ArrayList<>();
    private int state;
    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state = state;
        this.notifyAllObserver();
    }
    public void attach(Observer observer){
        list.add(observer);
    }
    public void notifyAllObserver(){
        for(Observer observer:list){
            observer.update();
        }
    }
}
