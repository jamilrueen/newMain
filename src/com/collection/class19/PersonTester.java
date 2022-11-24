package com.collection.class19;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {


        Person person1=new Person("Rajoo", 22);
        person1.printInfo();

        Scanner scanner=new Scanner(System.in);
        Person person2=new Person(scanner.nextLine(), scanner.nextInt());
        person2.printInfo();


    }

}
