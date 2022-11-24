package com.collection.class19;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    String education;

    Person (){
        System.out.println("Important lines of code that should always be "+
                "executed shen createing the object of the class.");
    }

    Person(String personName, int personAge){
        this();
        System.out.println("First constructor ");
        name=personName;
    age=personAge;
    weight=50;
    height=45;
    education="None";

    }


    void printInfo(){
        System.out.println("Name: "+name+" Age: "+age+"Weight: "+weight+" Height "+height+"Education "+education);
    }
    Person(int personAge, String personName){
        System.out.println("2nd constructor");
        name=personName;
        age=personAge;
        weight=50;
        height=45;
        education="None";
    }

    Person (String a, String b){
        System.out.println("3rd Constructor");
    }

}
