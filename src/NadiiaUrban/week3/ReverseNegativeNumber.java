package NadiiaUrban.week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNegativeNumber {

    public static int  reverseNum(int num){
        return num*(-1);
    }

    public static int  reverseNum2(int num){
        return Math.abs(num);
    }





    public static void main(String[] args) {
        System.out.println("Please enter a negative number: ");
        int num = new Scanner(System.in).nextInt();
        if (num >= 0) {
            throw new InputMismatchException("Number must be negative!");
        } else {


            System.out.println(reverseNum(num));
            System.out.println(reverseNum2(num));
        }
    }


}
/*
Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */