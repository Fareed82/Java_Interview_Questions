package YuliiaOst;

public class DivisibleByNumbers {

    public static void divisibleByFifteenFiveThree() {

        // A number is divisible by 15 if it is divisible by 3 and 5

        String divByFifteen = "";
        String divByFive = "";
        String divByThree = "";

        for (int i = 1; i < 100; i++) {

            if (i % 15 == 0) {
                divByFifteen += i + " ";
            } else if (i % 5 == 0) {
                divByFive += i + " ";
            } else if (i % 3 == 0) {
                divByThree += i + " ";
            }
        }

        System.out.println(" Divisible By 15: " + divByFifteen);
        System.out.println(" Divisible By 5: " + divByFive);
        System.out.println(" Divisible By 3: " + divByThree);
    }

    public static void main(String[] args) {

        divisibleByFifteenFiveThree();
    }
}
/*
Write a program that can print numbers between 1 ~ 100 that can be divisible by 3, 5 and 15.
- if the number can be divisible by 3, 5, 15 - then it should only be displayed in "Divisible By 15" section
- if the number can be divisible by 5, but cannot be divisible by 15 - then it should only be displayed in "Divisible By 5" section
- if the number can be divisible by 3, but cannot be divisible by 15 - then it should only be displayed in "Divisible By 3" section

OutPut:
 Divisible By 15: 15 30 45 60 75 90
 Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95
 Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

 */