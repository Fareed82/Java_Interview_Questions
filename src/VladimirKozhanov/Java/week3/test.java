package VladimirKozhanov.Java.week3;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Gimme negative number:");
        int number = scan.nextInt();

        System.out.println(ReverseNumber(number));


    }


    public static int ReverseNumber(int number) {
        int reversed = 0;
        int test = 0;
        while(number != 0) {

            test = number % 10;
               number = (int)((number - test)*0.1);
               reversed = reversed * 10 + test;
        }



        return reversed;
    }
}