package com.shaw.simpleFactory;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入A的值：");
        String A = sc.next();
        System.out.print("请选择运算符号（+、-、*、/）：");
        String strOperate = sc.next();
        System.out.print("请输入B的值：");
        String B = sc.next();
        String strResult = "";
        switch(strOperate){
            case "+":
                strResult = String.valueOf(Double.valueOf(A)+Double.valueOf(B));
                break;
            case "-":
                strResult = String.valueOf(Double.valueOf(A)-Double.valueOf(B));
                break;
            case "*":
                strResult = String.valueOf(Double.valueOf(A)*Double.valueOf(B));
                break;
            case "/":
                if(B != "0"){
                    strResult = String.valueOf(Double.valueOf(A)/Double.valueOf(B));
                }else{
                    strResult = "除数不能为0";
                }
                break;
        }
        System.out.println(strResult);
    }
}
