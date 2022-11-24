package com.collection.class17;

public class StaticDemo {
    String name="Jamil";
    static String country="USA";

    void method1(){
        System.out.println(name);
        System.out.println(country);
    }

    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo();
        staticDemo.method1();
    }
    static void method3(){

    }
}
