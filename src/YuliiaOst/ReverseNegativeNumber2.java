package YuliiaOst;

import java.util.Scanner;

public class ReverseNegativeNumber2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter negative integer number:");
        int n = input.nextInt();

        System.out.println(reverseNegativeNumber2(n));

        input.close();
    }

    public static int reverseNegativeNumber2(int number) {

        if (number >= 0) {
            System.out.println("Number should be negative");
        }

        int reversedNumber = 0;
        int absNumber = Math.abs(number);

        while (absNumber != 0) {
            int lastDigit = absNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit; // (reversedNumber * 10) shift the digits to the left
            absNumber /= 10; // last digit is removed from the absolute number

        }

        return reversedNumber*(-1);
    }
}

// Write a return method that can reverse negative number and return it as int