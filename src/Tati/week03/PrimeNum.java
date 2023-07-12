package Tati.week03;

import java.util.InputMismatchException;

public class PrimeNum {
    /*
    1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
     */
    public static boolean isPrime(int num) {

        if(num==0||num==1){
            throw new InputMismatchException("Please provide number greater than 1");
        }

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }


        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }
}
