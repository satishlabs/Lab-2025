package com.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFailFast {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

       /* for (String s : list) {
            list.add("C");   // modification during iteration
        }*/

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals("A")) {
                itr.remove();
            }
        }
        System.out.println(list);
        System.out.println("\n=================");
        CopyOnWriteArrayList<String> cList = new CopyOnWriteArrayList<>();
        cList.add("A");
        cList.add("B");
        for(String s: cList){
            cList.add("C");
        }
        System.out.println(cList);
    }
}
