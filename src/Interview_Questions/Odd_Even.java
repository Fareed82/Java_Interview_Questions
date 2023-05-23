package Interview_Questions;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        identify(number);


    }

    public static void identify(int number){
        if (number % 2 == 0){
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }
    }


}
