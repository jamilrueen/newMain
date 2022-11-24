package com.collection.class28;

import java.util.ArrayList;
import java.util.Arrays;

public class Arolost {
    public static void main(String[] args) {
        ArrayList <String> fList=new ArrayList<>();
        fList.add("Jambal");
        fList.add("Qabal");
        //fList.remove(0);
        System.out.println(fList);

        //Part 2
        ArrayList <String> fList2=new ArrayList<>(Arrays.asList("Jamil", "Malik", "Shayeq", "Shakir", "Parwiz"));
        System.out.println(fList2);
        System.out.println(fList2.get(0));
        System.out.println(fList2.size());
        System.out.println(fList2.remove(0));

        System.out.println(fList2);
        fList2.add("Landora");
        System.out.println(fList2);




    }
}
