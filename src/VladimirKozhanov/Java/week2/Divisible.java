package VladimirKozhanov.Java.week2;

public class Divisible {

    public static void main(String[] args) {

for (int num = 0; num <=100 ; num++) {
    if (num % 15 == 0 && num % 5 == 0 && num % 3 == 0) {
        System.out.println("DivisibleBy15");
    } else if (num % 3 == 0 && num % 15 != 0) {
        System.out.println("DivisibleBy3");
    } else if (num % 5 == 0 && num % 15 != 0) {
        System.out.println("DivisibleBy5");
    }else{
        System.out.println(num);
    }
}

    }




}
