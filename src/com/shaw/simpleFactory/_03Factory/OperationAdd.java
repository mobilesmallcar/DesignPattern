package com.shaw.simpleFactory._03Factory;

public class OperationAdd extends _03Operation {

    @Override
    public double GetResult(){
        double result = 0;
        result = _numberA+_numberB;
        return result;
    }
}
