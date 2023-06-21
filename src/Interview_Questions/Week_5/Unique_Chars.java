package Interview_Questions.Week_5;

import java.util.Scanner;

public class Unique_Chars {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string of characters and watch the magic happen");

        System.out.println(uniqueChars(in.next()));

        in.close();
    }

    public static String uniqueChars(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)){
                unique += each;
            }

        }

        return unique;
    }


}

