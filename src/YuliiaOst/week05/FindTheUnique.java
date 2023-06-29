package YuliiaOst.week05;

import java.util.Scanner;

public class FindTheUnique {

    public static String findTheUnique(String str) {

        String result = "";

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            int frequency = 0;

            // Count the frequency of the character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == letter) {
                    frequency++;
                }
            }

            // Check if the character is unique (not already in the result)

            if (frequency == 1) {
                result += letter;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word or sentence:");
        String str = input.nextLine();

        System.out.println("Unique characters from the String : " + findTheUnique(str));

        input.close();
    }


}
/*
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */