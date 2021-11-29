package com.shaw.strategyPattern._01Factory;

public class BankFactory {

    public static _01BankOperation createBank(String operate){
        _01BankOperation ope = null;
        switch(operate){
            case "discount":
                ope = new BankDiscount();
                break;
            case "normal":
                ope = new BankNormal();
                break;
        }
        return ope;
    }
}
