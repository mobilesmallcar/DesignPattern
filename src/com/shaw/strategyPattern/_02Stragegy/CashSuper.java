package com.shaw.strategyPattern._02Stragegy;

import java.math.BigDecimal;

public class CashSuper {
    public BigDecimal totalMoney;

    public CashSuper() {
    }

    public CashSuper(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getResult(){
        this.totalMoney = BigDecimal.ZERO;
        return totalMoney;
    }
}
