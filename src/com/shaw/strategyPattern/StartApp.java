package com.shaw.strategyPattern;

import java.util.Arrays;

public class StartApp {
    public static void main(String[] args){
        double total = 0.0d;
//        bank_return(total);
        Integer switchIndex = 1;
        bank_return(total,switchIndex);
        Arrays.asList("正常收费","打八折","打七折","打五折");
    }
    public static void bank_return(double total){
        String singlePrice = "10";
        String productWeight = "20";
        System.out.println("商品单价为："+singlePrice+"，商品数量为："+productWeight);
        total += Double.valueOf(singlePrice) * Double.valueOf(productWeight);
        System.out.println(total);
    }
    public static void bank_return(double total,Integer switchIndex){
        String singlePrice = "10";
        String productWeight = "20";
        System.out.println("商品单价为："+singlePrice+"，商品数量为："+productWeight);
        switch(switchIndex){
            case 0:
                total += Double.valueOf(singlePrice) * Double.valueOf(productWeight);
                break;
            case 1:
                total += Double.valueOf(singlePrice) * Double.valueOf(productWeight) * 0.8;
                break;
            case 2:
                total += Double.valueOf(singlePrice) * Double.valueOf(productWeight) * 0.7;
                break;
            case 3:
                total += Double.valueOf(singlePrice) * Double.valueOf(productWeight) * 0.5;
                break;
        }
        System.out.println(total);
    }
}
