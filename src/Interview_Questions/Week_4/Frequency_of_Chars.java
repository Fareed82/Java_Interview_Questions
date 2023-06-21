package Interview_Questions.Week_4;

import java.util.Scanner;

public class Frequency_of_Chars {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string of characters");

        freqencyOfChars(in.next());


        in.close();
    }

    public static void freqencyOfChars(String str){

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch){
                    count++;
                }
            }

            if (result.contains("" + ch)){
                continue;
            }
            result += "" + ch + count + " ";

        }


        System.out.println(result);

    }



}
