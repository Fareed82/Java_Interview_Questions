package Interview_Questions.Week_1;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        identify(number);


        input.close();
    }

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }


}
// add what if value is 0