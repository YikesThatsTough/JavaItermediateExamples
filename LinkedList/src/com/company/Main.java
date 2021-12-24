package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        String[] things = {"apples", "noobs", "pwng", "bacon", "goATS"};
        List<String> listOne = new LinkedList<>();
        Collections.addAll(listOne, things);

        String[] thingsTwo = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> listTwo = new LinkedList<>();
        Collections.addAll(listTwo, thingsTwo);

        listOne.addAll(listTwo);
        listTwo = null;

        printMe(listOne);
        removeStuff(listOne, 2, 5);
        printMe(listOne);
        reverseMe(listOne);
    }

    public static void printMe(List<String> l){
        for (String b : l)
        System.out.printf("%s ", b);
        System.out.println();
    }

    public static void removeStuff(List<String> l, int from, int to){
        l.subList(from, to).clear();
    }

    private static void reverseMe(List<String> l) {
        ListIterator<String> lit = l.listIterator(l.size());
        while (lit.hasPrevious())
            System.out.printf("%s ", lit.previous());
    }
}
