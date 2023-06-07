package YuliiaOst.week03;

import java.util.Scanner;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter negative integer number:");
        int n = input.nextInt();

        reverseNegativeNumber(n);

        input.close();
    }

    public static void reverseNegativeNumber(int number) {

        if (number >= 0) {
            System.out.println("Number should be negative");
            return;
        }

        number = Math.abs(number);

        String numberAsString = "" + number; // converts int to String

        /*
        or:
        String numberAsString = Integer.toString(number);
        or:
        String strNumber = String.valueOf(number);
         */

        String reversResultAsString = "";

        for (int i = numberAsString.length()-1; i >= 0; i--) {
            reversResultAsString += numberAsString.charAt(i);
        }

        int reversResultAsInteger = Integer.parseInt(reversResultAsString)*(-1);
        System.out.println(reversResultAsInteger);

    }
}
// Write a return method that can reverse negative number and return it as int
