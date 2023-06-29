package YuliiaOst.week01;

import java.util.Scanner;

public class OddOrEven {

    public static void identifyOddOrEven(int number) {

        if (number % 2 == 0) { // when we divide a number by 2, if a remainder is 0, it means the number is even
            System.out.println("Number " + number + " is even");

        } else { // if a number is not even, it's odd
            System.out.println("Number " + number + " is odd");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int number = input.nextInt();

        identifyOddOrEven(number);

        input.close();
    }
}

/*
Write a method which can identifies given number is even or odd

EX:
identify(5) -> "Odd"
identify(6) -> "Even"
 */
