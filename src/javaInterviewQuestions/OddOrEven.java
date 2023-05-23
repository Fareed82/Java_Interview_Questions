package javaInterviewQuestions;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favorite number");
        int num1 = input.nextInt();

        OddOrEven(num1);
        input.close();
    }
    public static void OddOrEven(int num1){
        if (num1 % 2 == 0){
            System.out.println("Congratulations, your number is even!" );
        }else {
            System.out.println("Boooooooo you have an odd number");
        }
    }





}
