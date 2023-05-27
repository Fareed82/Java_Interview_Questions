package VladimirKozhanov.Java.week1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Gimme a number: ");
        int num = scan.nextInt();

        identify(num);
        }
    }

    public static void identify(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

}
