package com.collection.class17;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.studentID="1";
        student.studentName="Micheal";
        Student.numberOfStudents++;

        Student student1=new Student();
        student1.studentName="Serge";
        student1.studentID="2";
        Student.numberOfStudents++;

        Student student2=new Student();
        student2.studentName="Mars";
        student2.studentID="3";
        Student.numberOfStudents++;
        System.out.println(Student.numberOfStudents);

    }
}
