package YuliiaOst.week01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DivisionWithoutOperator {

    public static double divisionWithoutOperator(int dividend, int divisor) {

        if (divisor == 0) {
            throw new ArithmeticException("Divisor can not be zero");
        }

        if (dividend == 0) {
            return 0;
        }

        int positiveOrNegative = 1;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            positiveOrNegative = -1;
        }

        dividend = Math.abs(dividend); // absolute value of a number, without considering its sign.
        divisor = Math.abs(divisor); // if the number is negative, it removes the negative sign and returning a positive value.

        int intPartOfQuotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            intPartOfQuotient++;
        }

        double decimalPartOfQuotient = 0;
        if (dividend < divisor && dividend != 0) {
            dividend = dividend * 100;
            while (dividend >= divisor) {
                dividend -= divisor;
                decimalPartOfQuotient += 0.01; // the final result will be 100 times smaller: this means every 1 will be equal to 0.01
            }
        }

        double result = (intPartOfQuotient + decimalPartOfQuotient) * positiveOrNegative;
        // double roundedResult = Math.round(result * 100.0) / 100.0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double roundedResult = Double.parseDouble(decimalFormat.format(result));

        return roundedResult;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer dividend:");
        int num1 = input.nextInt();

        System.out.println("Enter integer divisor:");
        int num2 = input.nextInt();

        System.out.println("The quotient is " + divisionWithoutOperator(num1, num2));

        input.close();
    }
}

/*
Write a method that can divide two numbers without using division operator
 */