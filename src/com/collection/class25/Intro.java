package com.collection.class25;

interface Main{
    String name="Jamil";
    void teach();
}
public class Intro implements Main {
    public static void main(String[] args) {
        System.out.println(name);
        Intro intro=new Intro();
        intro.teach();
    }
    @Override
    public void teach() {
        System.out.println("This man can teach.");

    }
}
