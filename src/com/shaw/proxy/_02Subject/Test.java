package com.shaw.proxy._02Subject;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        Subject proxySubject = (Subject) Proxy.newProxyInstance(
//                Subject.class.getClassLoader(),
                subject.getClass().getClassLoader(),
//                new Class[]{Subject.class},
                subject.getClass().getInterfaces(),
                new ProxyHandler(subject));
        proxySubject.doSomething();
        System.out.println("代理对象的类型:"+proxySubject.getClass().getName());
        System.out.println("代理对象所在类的父类型:"+proxySubject.getClass().getGenericSuperclass());
    }
}
