package utils.week06;

public class SumOfDigitsString {
    /**
     * 3. Sum of digits in a string:
     *   Write a method that can return the sum of the digits in a string.
     *     *   Ex: "A3v15" = > 3 + 1 + 5 = 9
     *         return 9
     */

    public static int SumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {//We check if the character ch is a digit by comparing it with the characters '0' and '9'. If it falls within this range, we can assume it's a digit. Unicode '0'= 49  '9'=57
                int digit = ch - '0';//we calculate the numeric value of the digit by subtracting ch from '0' (ASCII table). ch '3'  and '3'-'0'=51-48 returns int 3
                sum += digit;
            }
        }
        return sum;
    }

    public static void main( String[] args ) {
        String str = "5N953GpRt2";

        System.out.println(SumOfDigits(str));//5+9+8+3=28
    }
}
