package YuliiaOst.week04;

import java.util.Scanner;

public class FrequencyOfCharacters {

    public static String frequencyOfCharacters(String str) {

        String result = "";

        // Iterate through each character in the string
        for (int i = 0; i <= str.length() - 1; i++) {
            char letter = str.charAt(i);
            int frequencyOfChars = 0;

            // Count the frequency of the character
            for (int j = 0; j <= str.length() - 1; j++) {
                if (letter == str.charAt(j)) {
                    frequencyOfChars++;
                }
            }

            // Check if the character is already present in the result (and it's not frequency)
            boolean isAlreadyAdded = false;
            for (int k = 0; k <= result.length() - 1; k += 2) { // we check only 1, 3, 5, 7... characters - it's letters, and don't check 2, 4, 6... letters - it's frequency
                if (result.charAt(k) == letter) {
                    isAlreadyAdded = true;
                    break;
                }
            }

            // skip if the character already contained in result
            if (isAlreadyAdded) {
                continue;
            }

            // Add the character and frequency to result
            result += letter + "" + frequencyOfChars;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word or sentence:");
        String wordInput = input.next();

        System.out.println(frequencyOfCharacters(wordInput));

        input.close();
    }
}
/*
Write a return method that can find the frequency of characters
EX: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */