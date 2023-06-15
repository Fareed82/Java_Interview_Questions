package YuliiaOst.week04;

public class FrequencyOfCharacters {

    public static String  frequencyOfCharacters(String str) {

        String result = "";

             // Iterate through each character in the string
        for (int i = 0; i <= str.length() - 1; i++) {
            char letter = str.charAt(i);
            int frequencyOfChars = 0;

            // Skip if the character already contained in result
            if (result.toString().contains(letter+"")) {
                continue;
            }

            // Count the frequency of the character
            for (int j = i; j <= str.length() - 1; j++) {
                if (letter == str.charAt(j)) {
                    frequencyOfChars++;
                }
            }
            // Add the character and frequency to result
            result += letter + "" + frequencyOfChars;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }
}
/*
Write a return method that can find the frequency of characters
EX: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */