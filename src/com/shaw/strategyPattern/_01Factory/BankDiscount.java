package com.shaw.strategyPattern._01Factory;

public class BankDiscount extends _01BankOperation {

    public BankDiscount() {
        super();
    }
    public BankDiscount(String price,String weight,String discount){
        super(price,weight,discount);
    }
    @Override
    public double countTotal() {
        double total = 0.0d;
        total += singlePrice * productWeight * productDiscount;
        return total;
    }
}
