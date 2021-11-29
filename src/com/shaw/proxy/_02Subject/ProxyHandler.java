package com.shaw.proxy._02Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object proxied;
    public ProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("增强前置处理");
        Object obj = method.invoke(proxied,args);
        System.out.println("增强后置处理");
        return obj;
    }
}
