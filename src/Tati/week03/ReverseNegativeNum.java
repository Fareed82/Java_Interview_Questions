package Tati.week03;

public class ReverseNegativeNum {
    /*
    2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */
    public static int reverseNegativeNum(int num) {

        num = Math.abs(num); // 123
        String str = "" + num;//  012
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        int n = Integer.parseInt(reverse);
        n *= -1;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNum(-156));
    }
}
