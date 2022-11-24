package Zatal;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {
    public static void main(String[] args) {
        Map Jamil=new HashMap<>();

        Jamil.put(1, "Jamil");
        Jamil.put(2, "Malik");

        System.out.println(Jamil.get(1));
        int andaza=Jamil.size();

        System.out.println("There are "+andaza+" elements in this map.");

    }
}
