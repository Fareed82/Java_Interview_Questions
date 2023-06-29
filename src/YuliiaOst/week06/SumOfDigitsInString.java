package YuliiaOst.week06;

import java.util.Scanner;

public class SumOfDigitsInString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word or sentence which contains digits:");
        String str = input.nextLine();
        System.out.println("Sum of digits from this word/sentence is " + sumOfDigitsInString(str));
        input.close();

    }

    public static int sumOfDigitsInString(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachCharOfWord = str.charAt(i);

            if (Character.isDigit(eachCharOfWord)) {
                sum += Character.getNumericValue(eachCharOfWord);
            }
        }
        return sum;
    }
}
/*
3. Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9

 */