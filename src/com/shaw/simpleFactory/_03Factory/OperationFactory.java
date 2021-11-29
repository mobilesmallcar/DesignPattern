package com.shaw.simpleFactory._03Factory;

public class OperationFactory {
    public static _03Operation createOperate(String operate){
        _03Operation oper = null;
        switch(operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
