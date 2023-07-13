package Tati.week08;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class ArrayNUniqueIntegers {
    /*
    Question 1: Array - N unique integers that sum up to 0
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5].
 The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1]
  (but there are many more correct answers).
     */

    public static int[] uniqueIntegers(int n) {

        if (n > 100 || n < 1) {
            throw new InputMismatchException("Number cannot be less than 1 or more than 100");
        }

        int[] arr = new int[n];

        Random rand = new Random();

        int sumWithoutLast = 0;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = rand.nextInt(100 + 100) - 100;
            sumWithoutLast += arr[i];

        }

        do {
            arr[n - 1] = rand.nextInt(100 + 100) - 100;
        }
        while ((sumWithoutLast + arr[n - 1] )!= 0);


        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueIntegers(7)));

    }
}
