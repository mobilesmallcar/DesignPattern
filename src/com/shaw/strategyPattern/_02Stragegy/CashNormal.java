package com.shaw.strategyPattern._02Stragegy;

import java.math.BigDecimal;

public class CashNormal extends CashSuper{
    public CashNormal() {
        super();
    }

    public CashNormal(BigDecimal totalMoney) {
        super(totalMoney);
    }

    public BigDecimal getResult() {
        return totalMoney;
    }
}
