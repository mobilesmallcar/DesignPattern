package com.shaw.proxy._03SqlTime;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "F:/workSpace/IntelliJIDEA/DesignPatterns/src/com/shaw/proxy/_03SqlTime/cglibproxy");
        SqlService sqlService = new SqlService();
        SqlFacadeCglib sqlFacadeCglib = new SqlFacadeCglib(sqlService);

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(sqlService.getClass());
        enhancer.setCallback(sqlFacadeCglib);
        SqlService sqlServiceProxy = (SqlService ) enhancer.create();
        sqlServiceProxy.executeSql();
    }
}
