package VladimirKozhanov.Java.week3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

       /* for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Please gimme number: ");
        int numb = scan.nextInt();
        if(isPrime(numb)){
            System.out.println("Number " + numb +" is Prime");
        }else{
            System.out.println("No!NOOOO. " + numb + " Not a Prime!");
        }

    }


    public static boolean isPrime(int numb) {

        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }


}

