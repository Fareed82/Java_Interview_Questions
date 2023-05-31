package Tati.secondWeek;

public class ConsecutiveNum {

    public static void consecutive(int num) {

        if (num <= 0) {
            System.err.println("The number can only be positive");
            System.out.println("Please call the method one more time with a positive argument");
        } else {

            //String result = "";
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {

                    System.out.println("CodilityTestCoders");
                } else if (i % 2 == 0 && i % 3 == 0) {

                    System.out.println("CodilityTest");
                } else if (i % 3 == 0 && i % 5 == 0) {

                    System.out.println("TestCoders");
                } else if (i % 2 == 0 && i % 5 == 0) {

                    System.out.println("CodilityCoders");
                } else if (i % 2 == 0) {

                    System.out.println("Codility");
                } else if (i % 3 == 0) {

                    System.out.println("Test");
                } else if (i % 5 == 0) {

                    System.out.println("Coders");
                } else {
                    System.out.println(i);
                }
            }
            //System.out.println(result);
        }
    }
    public static void main(String[] args) {
        consecutive(24);
    }
}
/*
Numbers divisible by 2 -> Codility
Numbers divisible by 3 -> Test
Numbers divisible by 5 -> Coders
Numbers divisible by both 2 and 3 -> CodilityTest
Numbers divisible by both 2,3,5 -> CodilityTestCoders
 */