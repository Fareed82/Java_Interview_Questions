package NadiiaUrban.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintConsucutiveNumber {
    public static void main(String[] args) {

        System.out.println("Please provide a number: ");


        int num = new Scanner(System.in).nextInt();

        if (num <=0) {
        throw new InputMismatchException("Number can not be negative or zero");
        }


        for (int i = 1; i <=num ; i++) {

            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println("CodilityTestCoders");
            }else if(i%2==0 && i%3==0){
                System.out.println("CodilityTest");
            }else if(i%2==0 && i%5==0){
                System.out.println("CodilityCoders");
            } else if (i%3==0 && i%5==0) {
                System.out.println("TestCoders");
            } else if (i%2==0) {
                System.out.println("Codility");
            } else if (i%3==0 ) {
                System.out.println("Test") ;
            } else if (i%5==0) {
                System.out.println("Coders") ;
            }else{
                System.out.println(i);
            }

        }

    }
}
