package Tati.week02;

public class SwapNumber {

    public static void main(String[] args) {


        int x = 6;
        int y = 4;
        // y = 6
        // x = 4
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);


    }
}
/*
Swap two variables value without using a third variable
 */