package com.collection.class18;

public class Task3 {
    /* Create a method that will accept a String as a parameter and return a new String that consists
    only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.

     */
    private static String onlyWowels(String inputStr){
        return inputStr.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(onlyWowels("abcdefghijklmonqrstuvwxyz"));
    }
}
