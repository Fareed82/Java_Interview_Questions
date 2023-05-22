package VladimirKozhanov.Java;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Gimme a first number (dividend): ");
            int num1 = scan.nextInt();
            System.out.println("Gimme a second number (divisor): ");
            int num2 = scan.nextInt();
            divide(num1, num2);
        }
    }
    //Well ill update it later. Maybe.

    public static void divide(int num1, int num2) {
        int count = 0;
        int neg = 1;
        if (!(num1 > 0 && num2 > 0 || num1 < 0 && num2 < 0)) {
            neg = -1;
            if (num1 < 0) {
                num1 *= -1;
            }
            if (num2 < 0) {
                num2 *= -1;
            }
        }
        while (num1 != 0) {
            num1 -= num2;
            count++;
        }
        System.out.println(count * neg);
    }
}
