package com.collection.class17;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AccessModifiersDemo1Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 acccess=new AccessModifiersDemo1();
        //System.out.println(acccess.name); Cannot access the field "name" is "private"
    }
}
