package Interview_Questions.Week_5;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any word");

        System.out.println(reverseString(in.next()));


        in.close();
    }

    public static String reverseString(String str){

        String reverse = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

}
