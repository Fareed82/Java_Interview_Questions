package Tati;

public class EvenOrOdd {

    public static String identify(int num) {

        return num % 2 == 0 ? "Even" : "Odd";

    }


    public static void main(String[] args) {
        System.out.println(identify(5));
    }

}

// identify(5) -> "Odd"
