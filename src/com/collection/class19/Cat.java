package com.collection.class19;

public class Cat {
    String name;
    int age;
    double height;
    double weight;
    Cat(String name, int age, double height, double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;


    }
    void printInfo(){
        System.out.println("Name: "+name+" Age: "+age+ " Height "+height+ " Weight: "+weight);
    }
}
