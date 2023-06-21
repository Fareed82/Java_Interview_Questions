package NadiiaUrban.week1;

public class NumbersOddOrEven {


    public static void main(String[] args) {
//write the method which can identifies given number is even or odd
        oddOrEven(-10);

    }


    public static void oddOrEven(int number){

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }



}
