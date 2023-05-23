package NadiiaUrban.java_interview_questions;

public class NumbersOddOrEven {


    public static void main(String[] args) {

        oddOrEven(7);

    }


    public static void oddOrEven(int number){

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }


    }



}
