package VladimirKozhanov.Java.week3;

import java.util.Scanner;

public class ReverseNegative {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Gimme negative number:");
        int number = scan.nextInt();

        System.out.println(ReverseNumber(number));


    }

//
//    public static int ReverseNumber(int number) {
//        int reversed = 0;
//
//        while (number != 0) {
//            reversed *= 10;
//
//            while (number % 10 != 0) {
//                reversed += 1;
//                number -= 1;
//
//            }
//            number *= 0.1;
//
//        }
//        return reversed;
//    }
//}

    public static int ReverseNumber(int number) {
        int reversed = 0;
        boolean leadingZeros = true;

        while (number != 0) {
            if (leadingZeros && number % 10 == 0) {
                // If leading zeros and the current digit is zero,
                // multiply the reversed number by 10 to add a zero at the beginning
                reversed *= 10;
            } else {
                leadingZeros = false; // Once we encounter a non-zero digit, we stop adding leading zeros
                reversed = (reversed * 10) + (number % 10); // Add the current digit to the reversed number
            }

            number /= 10; // Move to the next digit
        }

        return reversed;
    }
}