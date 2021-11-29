package com.shaw.Memento;

public class MementoTest {
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("1");

        CareTaker careTaker = new CareTaker();

        careTaker.add(originator.saveStateToMemento());
        originator.setState("2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("3");
        System.out.println(originator.getState());
        System.out.println(careTaker.get(0).getState());
    }
}
