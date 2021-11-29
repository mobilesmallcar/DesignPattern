package com.shaw.Observer;

public class OctalObserver extends Observer{


    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("OctalObserver:"+(8+subject.getState()));
    }
}
