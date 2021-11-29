package com.shaw.Observer;

public class HexaObserver extends Observer{


    public HexaObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("HexaObserver:"+(16+subject.getState()));
    }
}
