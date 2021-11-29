package com.shaw.strategyPattern._01Factory;

public class _01BankOperation {

    private String price = "10";
    private String weight = "20";
    private String discount = "1";
    public Double singlePrice;
    public Double productWeight;
    public Double productDiscount;
    public  _01BankOperation(){

    }
    public _01BankOperation(String price,String weight,String discount){
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }
    public Double price(){
        this.singlePrice = Double.valueOf(price);
        return this.singlePrice;
    }
    public Double weight(){
        this.productWeight = Double.valueOf(weight);
        return this.productWeight;
    }
    public Double discount(){
        this.productDiscount = Double.valueOf(discount);
        return this.productDiscount;
    }
    public double countTotal(){
        double total = 0.0d;
        return total;
    }
}
