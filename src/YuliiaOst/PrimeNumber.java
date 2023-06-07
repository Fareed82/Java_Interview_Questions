package YuliiaOst;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number greater than 1:");
        int n = input.nextInt();

        primeNumber(n);

        input.close();
    }

    /*
    A prime number is a natural number greater than 1 that has only two divisors:
    1 and the number itself
     */

    public static void primeNumber(int number) {

        if (number < 1) {
            System.out.println("Number should be greater than 1");
            return;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not prime, it's composite number");
                return;
            }
        }

        System.out.println(number + " is prime number");

        }
    }

// Write a method that can check if a number is prime or not

/* for (int i = 2; i <= Math.sqrt(number); i++) - квадратный корень

If n is not a prime number, it can be factored into two factors a and b, where a * b = n.
If both a and b were greater than the square root of n, their product would be greater than n, which is not possible.
Therefore, at least one of the factors must be less than or equal to the square root of n.

For example, let's say we want to check if 100 is a prime number. The square root of 100 is 10. If we start checking for divisibility from 11 onwards, we would be redundant because any factor larger than 10 would have a corresponding factor smaller than 10. Thus, if no factors are found up to the square root, we can be confident that the number is prime.

 */