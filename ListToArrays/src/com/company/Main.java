package com.company;

import java.util.Arrays;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        //Convert to an List
        LinkedList<String> theList = new LinkedList<>(Arrays.asList(stuff));

        theList.add("pumkin");
        theList.addFirst("First Thing");
        System.out.println("Printing as an List: " + theList);

        //Convert back to an array
        stuff = theList.toArray(new String[theList.size()]);

        for (String x : stuff)
            System.out.printf("%s ", x);
    }
}
