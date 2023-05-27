package Tati.secondWeek;

public class DivisibleBy {

    public static void divisible(int num) {
        String divBy15 = "";
        String divBy5 = "";
        String divBy3 = "";

        for (int i = 3; i <= num; i++) {
            if (i % 15 == 0) {
                divBy15 += i+" ";
            }
            else if (i % 3 == 0) {
                divBy3 += i+" ";
            }
            else if (i % 5 == 0) {
                divBy5 += i+" ";
            }
        }
        System.out.println("Divisible By 15 " + divBy15);
        System.out.println("Divisible By 5 " + divBy5);
        System.out.println("Divisible By 3 " + divBy3);


    }

    public static void main(String[] args) {
        divisible(100);
    }
}
