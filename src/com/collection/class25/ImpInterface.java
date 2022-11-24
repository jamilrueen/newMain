package com.collection.class25;

import org.omg.CORBA.OBJ_ADAPTER;

interface MyInterface{
    public void method1();
    public void method2();
}
public class ImpInterface implements MyInterface {
    @Override
    public void method1() {
        System.out.println("This is method 1.");

    }

    @Override
    public void method2() {
        System.out.println("This is method 2.");

    }

    public static void main(String[] args) {
        MyInterface obj=new ImpInterface();
        obj.method1();
        obj.method2();
    }
}
