package Interview_Questions;

import java.util.Scanner;

public class Divide_Without_Operator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide two number to divide.");

        System.out.println("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double number2 = input.nextDouble();

        System.out.println("The quotient is " + divide(number1, number2));

    }

    public static double divide(double nominator, double dominator){

        if (dominator == 0){
            System.err.println("Can not divide by 0");
            System.exit(1);
        }

        double sign = 1;
        if (nominator * dominator < 0){
            sign = -1;
        }

        nominator = Math.abs(nominator);
        dominator = Math.abs(dominator);

        double quotient = 0;

        while (nominator >= dominator){
            nominator = nominator - dominator;
            quotient++;
        }

        System.out.println("The remainder is " + nominator);

        return sign * quotient;

    }

}
