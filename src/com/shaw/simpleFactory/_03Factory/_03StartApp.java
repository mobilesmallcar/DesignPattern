package com.shaw.simpleFactory._03Factory;

public class _03StartApp {
    public static void main(String[] args){
        _03Operation oper;
        oper = OperationFactory.createOperate("*");
        oper.NumberA(10);
        oper.NumberB(2);
        double result = oper.GetResult();
        System.out.println(result);
    }
}
