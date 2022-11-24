package com.collection.class17;

public class EmpTester {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.empID="132";
        employee.salary=10000;
        System.out.println(employee.empID);
        System.out.println(employee.salary);
        System.out.println(employee.CEO);

        Employee employee1=new Employee();
        employee1.empID="454";
        employee1.salary=12000;
        System.out.println(employee1.empID);
        System.out.println(employee1.salary);

    }
}
