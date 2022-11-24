package com.collection.class17;

public class AccessModifiersDemo1 {
    private String name;

    void method1(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        //System.out.println(name);
        //Can't access becasue the Main Method is STATIC
        AccessModifiersDemo1 access=new AccessModifiersDemo1();
        System.out.println(access.name);
    }
}
