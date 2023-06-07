package Interview_Questions.Week_3;

public class Reverse_Negative_Number {
    public static void main(String[] args) {

        System.out.println("-21 = " + reverseNegativeNumber(-21));
        System.out.println("-27 = " + reverseNegativeNumber(-27));
        System.out.println("-82 = " + reverseNegativeNumber(-82));
        System.out.println("-1 = " + reverseNegativeNumber(-1));
        System.out.println("-01 = " + reverseNegativeNumber(-01));

        System.out.println("21 = " + reverseNegativeNumber(21));
        System.out.println("27 = " + reverseNegativeNumber(27));
        System.out.println("82 = " + reverseNegativeNumber(82));
        System.out.println("1 = " + reverseNegativeNumber(1));
        System.out.println("01 = " + reverseNegativeNumber(01));


    }

    public static int reverseNegativeNumber(int number){

        int reversedNumber = 0;
        int numberToReverse = Math.abs(number);

        while (numberToReverse > 0) {
            int mod = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + mod;
            numberToReverse /= 10;
        }

        return number < 0 ? reversedNumber * -1 : reversedNumber;
    }

}
