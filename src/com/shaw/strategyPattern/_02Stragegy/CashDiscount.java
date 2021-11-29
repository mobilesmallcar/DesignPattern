package com.shaw.strategyPattern._02Stragegy;

import java.math.BigDecimal;

public class CashDiscount extends CashSuper{
    private BigDecimal discount;
    public CashDiscount() {
    }

    public CashDiscount(BigDecimal totalMoney,BigDecimal discount) {
        super(totalMoney);
        this.discount = discount;
    }

    @Override
    public BigDecimal getResult() {
        return totalMoney.multiply(discount);
    }
}
