package VladimirKozhanov.Java;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Gimme a first number: ");
            int num1 = scan.nextInt();

            System.out.println("Gimme a second number: ");
            int num2 = scan.nextInt();

            divide(num1, num2);
        }

    }


   public static void divide(int num1, int num2){
       int count = 0;
        while(!(num1 == 0)) {

            num1 -= num2;
            count++;
        }
       System.out.println(count);
    }



}
