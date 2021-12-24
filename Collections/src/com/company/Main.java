package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> listOne = new ArrayList<>();

        //Add array items to list
        for (String x: things)
            listOne.add(x);

        String[] moreThings = {"lasers", "hates"};
        List<String> listTwo = new ArrayList<>();

        //Add array items to list
        for (String y: moreThings)
            listTwo.add(y);

        //Print out list one
        for (int i = 0; i<listOne.size(); i++){
            System.out.printf("%s ", listOne.get(i));
        }

        editList(listOne, listTwo);
        System.out.println();

        //Print out list one
        for (int i = 0; i<listOne.size(); i++){
            System.out.printf("%s ", listOne.get(i));
        }
    }

    //Remove Items from List one if list two contains them
    public static void editList(Collection<String> l1, Collection<String> l2){
        l1.removeIf(l2::contains);
    }
}




