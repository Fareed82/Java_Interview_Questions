package YuliiaOst.week04;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {

    public static boolean sameLetters(String str1, String str2) {

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if they are equal
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("We will check if a string is build out the same letters as another string.\nEnter 1st word:");
        String str1 = input.nextLine();

        System.out.println("Enter 2nd word:");
        String str2 = input.nextLine();

        System.out.println("1st string is build out the same letters as 2nd string: " + sameLetters(str1, str2));

    }

}
/*
Write e return method that check if a string is build out the same letters as another string
Ex: same("abc", "cab"); -> true
    same("abc", "abb"); -> false
 */