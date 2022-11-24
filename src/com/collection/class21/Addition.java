package com.collection.class21;

public class Addition {
    public void add(int a, int b){
        System.out.println(a+b);

    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(double a, int b){
        System.out.println(a+b);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
    public void add(double a, double b, double c){
        System.out.println(a+b+c);
    }
}
class Test{
    public static void main(String[] args) {
        Addition addition=new Addition();
        addition.add(1, 1.3);
        addition.add(1.2, 1.6);
        addition.add(1.5, 1, 1.3);

    }
}
