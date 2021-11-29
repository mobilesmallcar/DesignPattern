package com.shaw.strategyPattern._02Stragegy;

import java.math.BigDecimal;

public class CashContext {
    public final static String NORMAL = "正常收费";
    public final static String EIGHT_FOLD = "八折";
    public final static String FULL_REDUCTION = "满三百减一百";
    CashSuper cs = null;
    public void btnClick(BigDecimal totalMoney, String type){
        switch(type){
            case NORMAL:
                cs = new CashNormal(totalMoney);
                break;
            case EIGHT_FOLD:
                cs = new CashDiscount(totalMoney,new BigDecimal(0.8));
                break;
        }
    }
    public BigDecimal getResult(){
        return cs.getResult();
    }
}
