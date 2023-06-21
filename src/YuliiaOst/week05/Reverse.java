package YuliiaOst.week05;

import javax.print.event.PrintEvent;
import java.util.Scanner;

public class Reverse {

    public static String reverse (String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) { // go throw every character from end to begin
            char letter = str.charAt(i);
            result += letter;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word or sentence:");
        String str = input.nextLine();

        System.out.println(reverse(str));

        input.close();
    }


}
/*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */