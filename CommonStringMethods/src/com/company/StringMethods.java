package com.company;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String[] words = {"funk", "chunk", "furry", "baconater"};

        //Starts with
        for (String w : words) {
            if (w.startsWith("fu"))
                System.out.println(w + " starts with fu");
        }

        //Ends with
        for (String w : words) {
            if (w.endsWith("nk"))
                System.out.println(w + " ends with nk");
        }

        /*Search for the first index of some character or characters
        From index: starts at 5 ignores what's in front*/
        String s = "chasekiddisthebestofalltime";
        System.out.println(s.indexOf('a', 5));

        //Adding strings together with concat
        String a = "Bacon ";
        String b = "Monster";
        System.out.println(a.concat(b));

        //Replace character with new character
        System.out.println(a.replace('B', 'F'));

        //Uppercase
        System.out.println(b.toUpperCase(Locale.ROOT));

        //Lowercase
        System.out.println(a.toLowerCase(Locale.ROOT));

        //Get rid of whitespace
        System.out.println(b.trim());
    }
}
