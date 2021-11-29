package com.shaw.Observer;

public class ObserverTest {
    public static void main(String[] args){
        Subject subject = new Subject();

        Observer binaryObserver = new BinaryObserver(subject);
        Observer hexaObserver = new HexaObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        subject.setState(15);
        subject.setState(16);


    }
}
