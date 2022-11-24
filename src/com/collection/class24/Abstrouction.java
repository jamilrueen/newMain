package com.collection.class24;

abstract class Prod { //Make this class abstruct. You will see an error in the creating object.
    abstract void dance();
    abstract void teach();
}
public class Abstrouction {
    public static void main(String[] args) {

        Prod prod= new Prod() {
            @Override
            void dance() {
                System.out.println("It can dance.");
            }

            @Override
            void teach() {
                System.out.println("It can teach.");

            }
        };
            prod.dance();
            prod.teach();

    }
}
