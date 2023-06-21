package Interview_Questions.Week_4;

import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string of characters");

        remove_Duplicates(in.next());


        in.close();
    }

    public static void remove_Duplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (! result.contains("" + each)){
                result += each;
            }

        }

        System.out.println(result);

    }

}
