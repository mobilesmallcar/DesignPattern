package com.shaw.Observer;

public class BinaryObserver extends Observer{


    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("binaryObserver:"+(2+subject.getState()));
    }
}
