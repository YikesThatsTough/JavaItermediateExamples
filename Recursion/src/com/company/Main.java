package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        Long inputedNumber = Long.valueOf(input.nextLine());
        System.out.println("The factorial of " + inputedNumber + " is " + factorial(inputedNumber));
    }

    //Factorial
    public static long factorial(Long n) {
        if (n <= 1 )
            return 1; //base case
        else {
         return n * factorial(n-1);
        }
    }
}
