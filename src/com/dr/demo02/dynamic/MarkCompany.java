package com.dr.demo02.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MarkCompany implements InvocationHandler {

    private Object factory;

    public MarkCompany(Object factory) {
        this.factory = factory;
    }


    /**
     *
     */
    private void doSthAfter() {
        System.out.println("精美包装，快递一条龙服务。。。。");
    }

    /**
     *
     */
    private void doSthBefor() {
        System.out.println("根据需求，进行市场调研和产品分析。。。。");
    }

    /**
     * 获取动态代理的代理对象
     */

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), this);
    }

    /**
     * 通过动态代理对象方法进行增强
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSthBefor();
        Object result = method.invoke(factory, args);
        doSthAfter();
        return result;
    }
}
