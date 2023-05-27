package VladimirKozhanov.Java.week2;

public class SwapNumbers {
    public static void main(String[] args) {


        int x = 10;
        int y = 25;
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("y = " + y);
        System.out.println("x = " + x);

    }
}
