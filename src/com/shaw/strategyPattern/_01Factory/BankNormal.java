package com.shaw.strategyPattern._01Factory;

public class BankNormal extends _01BankOperation{

    @Override
    public double countTotal(){
        double total = 0.0d;
        total += price() * weight();
        return total;
    }
}
