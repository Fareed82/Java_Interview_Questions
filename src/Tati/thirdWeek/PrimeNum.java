package Tati.thirdWeek;

public class PrimeNum {
    /*
    1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
     */
    public static boolean isPrime(int num) {

        if(num==0||num==1){
            System.err.println("Please provide number greater than 1");
            System.exit(1);
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
        System.out.println(isPrime(3078));
    }
}
