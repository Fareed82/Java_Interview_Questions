package YuliiaOst.week06;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of numbers:");
        int quantityOfNumbers = input.nextInt();

        int[] arrayOfNumbers = new int[quantityOfNumbers];

        System.out.println("Enter " + quantityOfNumbers + " integer numbers:");

        for (int i = 0; i < quantityOfNumbers; i++) {
            arrayOfNumbers[i] = input.nextInt();
        }

        maximumNumber(arrayOfNumbers);

    }

    public static void maximumNumber(int[] numbers) {

        // Sort the array in ascending order

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        /*
        Arrays.sort(numbers);
        int max = numbers[numbers.length-1];
        */

        System.out.println("Maximum number is " + max);
    }

}
/*
2. Find Maximum:
  Write a method that can find the maximum number from an int Array.
 */

