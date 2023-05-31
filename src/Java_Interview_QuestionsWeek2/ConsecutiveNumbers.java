package Java_Interview_QuestionsWeek2;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("The following program will show numbers from 1 to Nth value.\nNumbers divisible by 2, 3, or 5 and will show as \"Codility, Test, or Coders\" respectively.\n");

    System.out.println("Please enter your Nth number.");
    System.err.println("NUMBER CAN ONLY BE POSITIVE\n");

    consecutive_Numbers(input.nextInt());

}

    public static void consecutive_Numbers(int number) {

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");

            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");

            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");

            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");

            } else if (i % 2 == 0) {
                System.out.println("Codility");

            } else if (i % 3 == 0) {
                System.out.println("Test");

            } else if (i % 5 == 0) {
                System.out.println("Coders");

            } else {
                System.out.println(i);
            }

        }

    }

}
