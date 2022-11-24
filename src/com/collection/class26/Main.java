package com.collection.class26;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Cheverole", "Camero", 2000);

        car.setMake("Shevy");
        car.setModel("Malabo");
        car.setYear(2008);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
