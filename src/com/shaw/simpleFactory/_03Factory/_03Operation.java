package com.shaw.simpleFactory._03Factory;

public class _03Operation {
    public double _numberA = 0;
    public double _numberB = 0;

    public double NumberA(double value){
        _numberA = value;
        return _numberA;
    }
    public double NumberB(double value){
        _numberB = value;
        return _numberB;
    }
    public double GetResult(){
        double result = 0;
        return result;
    }
}
