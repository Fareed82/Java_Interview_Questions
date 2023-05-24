package YuliiaOst;

import java.util.Scanner;

public class divisionWithoutOperator2 {
    public static void divisionWithoutOperatorWithRemainder(int dividend, int divisor) {

        if (divisor == 0) {
            throw new ArithmeticException("Divisor can not be zero");
        }

        if (dividend == 0) {
            System.out.println("The quotient is 0");
            System.exit(0);
        }

        int positiveOrNegative = 1;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            positiveOrNegative = -1;
        }

        dividend = Math.abs(dividend); // absolute value of a number, without considering its sign.
        divisor = Math.abs(divisor); // if the number is negative, it removes the negative sign and returning a positive value.

        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println("The quotient is " + quotient * positiveOrNegative + " with remainder " + dividend); ;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer dividend:");
        int num1 = input.nextInt();

        System.out.println("Enter integer divisor:");
        int num2 = input.nextInt();

        divisionWithoutOperatorWithRemainder(num1, num2);

        input.close();
    }
}

/*
Write a method that can divide two numbers without using division operator
 */