package VladimirKozhanov.Java.week3;

import java.util.Scanner;

public class ReverseNegative {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Gimme negative number:");
        int number = scan.nextInt();

        System.out.println(ReverseNumber(number));


    }


    public static int ReverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            reversed *= 10;

            while (number % 10 != 0) {
                reversed -= 1;
                number += 1;

            }
            number *= 0.1;

        }
        return reversed;
    }
}
