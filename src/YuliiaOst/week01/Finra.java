package YuliiaOst.week01;

public class Finra {

    public static void printFinra() {

        String result = "";

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";

            } else if (i % 3 == 0) {
                result += "FIN ";

            } else if (i % 5 == 0) {
                result += "RA ";

            } else {
                result += i + " ";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        printFinra();
    }
}
/*
Write a method, which prints out the numbers from 1 to 30.
but for number which is a multiple of 3, print "FIN" instead of the number
and for number which is a multiple of 5, print "RA" instead of the number.
and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
 */