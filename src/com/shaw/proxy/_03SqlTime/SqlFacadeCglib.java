package com.shaw.proxy._03SqlTime;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SqlFacadeCglib implements MethodInterceptor {

    private Object target;

    public SqlFacadeCglib(Object target){
        this.target = target;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //开始时间
        Long startTime = System.currentTimeMillis();
        //调用父类方法
        Object result = methodProxy.invokeSuper(o,objects);
        Long endTime = System.currentTimeMillis();
        System.out.println(target.getClass().getName()+"执行sqlExecute的时间为:"+(endTime-startTime)+"ms");
        return result;
    }
}
