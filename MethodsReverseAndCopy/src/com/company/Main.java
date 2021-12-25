    package com.company;

    import java.util.Arrays;
    import java.util.Collections;
    import java.util.List;

    public class Main {

        public static void main(String[] args) {

            //Create an array and convert to list
            Character[] characters = {'p', 'o', 'w', 'n'};
            List<Character> list = Arrays.asList(characters);
            System.out.println("List is: " );
            output(list);

            //Reverse and print out the list
            Collections.reverse(list);
            System.out.println("After reverse:  ");
            output(list);

            //Create a new array and a new list
            Character[] newCharacters = new  Character[4];
            List<Character> listCopy = Arrays.asList(newCharacters);

            //Copy contents of list into listCopy
            Collections.copy(listCopy, list);
            System.out.println("Copy of list: ");
            output(listCopy);

            //Fill collection with stuff
            Collections.fill(list, 'X');
            System.out.println("After filling the list: ");
            output(list);
        }

        private static void output(List<Character> theList) {
            for (Character thing : theList)
                System.out.printf("%s ", thing);

            System.out.println();
        }
    }


