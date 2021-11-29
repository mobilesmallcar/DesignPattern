package com.shaw.strategyPattern._02Stragegy;

import java.math.BigDecimal;
import java.util.Scanner;

public class StrategyTest {
    public static void main(String[] args){
        CashContext cc = new CashContext();
        Scanner sc = new Scanner(System.in);
        BigDecimal price = BigDecimal.valueOf(Integer.valueOf(sc.next()));
        BigDecimal amount = BigDecimal.valueOf(Integer.valueOf(sc.next()));
        cc.btnClick(price.multiply(amount),CashContext.EIGHT_FOLD);
        System.out.println(cc.getResult());
    }
}
