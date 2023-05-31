package VladimirKozhanov.Java.week2;

public class Divisible {

    public static void main(String[] args) {
        String DivBy15 = "";
        String DivBy3 = "";
        String DivBy5 = "";

        for (int num = 0; num < 100; num++) {
            if (num % 15 == 0 && num % 5 == 0 && num % 3 == 0) {
                DivBy15 += num + " ";
            } else if (num % 3 == 0 && num % 15 != 0) {
                DivBy3 += num + " ";
            } else if (num % 5 == 0 && num % 15 != 0) {
                DivBy5 += num + " ";
            }

        }
        System.out.println("Divisible By 15 " + DivBy15.trim());
        System.out.println("Divisible By 3 " + DivBy3.trim());
        System.out.println("Divisible By 5 " + DivBy5.trim());

    }

}
