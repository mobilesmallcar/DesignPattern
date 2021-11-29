package com.shaw.proxy._03SqlTime;

public class SqlService {
    public void executeSql() throws InterruptedException{
        System.out.println("sql执行开始");
        Thread.sleep(1000);
        System.out.println("sql执行结束");
    }
}
