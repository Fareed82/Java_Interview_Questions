package Tati.week06;

import java.util.Collections;

public class SumDigitsString {
    /*
    3. Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */
    public static int sumDigits(String str){
        char ch;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(Character.isDigit(ch)){

                sum+=Character.getNumericValue(ch);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("A3v15"));
    }
}
