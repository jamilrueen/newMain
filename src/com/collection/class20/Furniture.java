package com.collection.class20;

public class Furniture {
    String color="Red";
    }

    class Chair extends Furniture{
    String color="Black";
    void printColor(){
        System.out.println(super.color);
        System.out.println(color);
    }
}
class MainClass{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
