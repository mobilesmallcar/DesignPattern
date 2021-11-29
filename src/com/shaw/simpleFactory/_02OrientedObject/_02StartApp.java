package com.shaw.simpleFactory._02OrientedObject;

import java.util.Scanner;

public class _02StartApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入A的值：");
        String A = sc.next();
        System.out.print("请选择运算符号（+、-、*、/）：");
        String strOperate = sc.next();
        System.out.print("请输入B的值：");
        String B = sc.next();
        Double strResult;
        strResult = Operation.GetResult(Double.valueOf(A),Double.valueOf(B),strOperate);
        System.out.println(strResult);
    }
}
