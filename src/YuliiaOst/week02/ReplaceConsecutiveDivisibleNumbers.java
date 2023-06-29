package YuliiaOst.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReplaceConsecutiveDivisibleNumbers {

    public static void replaceConsecutiveDivisibleNumbers(int n) {


        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders ");

            } else if (i % 2 == 0 & i % 3 == 0) {
                System.out.println("CodilityTest");

            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");

            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");

            } else if (i % 5 == 0) {
                System.out.println("Coders");

            } else if (i % 3 == 0) {
                System.out.println("Test");

            } else if (i % 2 == 0) {
                System.out.println("Codility");

            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integer number:");
        int n = input.nextInt();


        /*

        System.out.println("Enter positive integer number:");
        int n = new Scanner(System.in).nextInt();

         */

        if (n <= 0) {
            throw new InputMismatchException("Number can not be negative or zero");
        }

        replaceConsecutiveDivisibleNumbers(n);

        input.close();
    }
}

/*
Write a function, that, given a positive integer N, prints consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of numbers 2, 3 or 5 - it should be replaced by a concatenation of the respective words Codility, Test or Coders in this given oder.
For ex: numbers, divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three nymbers: 2, 3 and 5 - should be replaced by CodilityTestCoders

 */