package Tati;

public class EvenOrOdd {

    public static String identify(int num) {

        if (num == 0) {
            return num + " can be divisible by any number";
        }
        return num % 2 == 0 ? "Even" : "Odd";

    }


    public static void main(String[] args) {
        System.out.println(identify(0));
    }

}

// identify(5) -> "Odd"
