package NadiiaUrban.week4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SameLetters {

/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

    public static void main(String[] args) {
        String str1 = "ACb123*";
        String str2 = "AbC321*";


        System.out.println("sameLetters(str1,str2) = " + sameLetters(str1, str2));

    }

    public static boolean sameLetters(String str1, String str2) {

            TreeSet<String> first = new TreeSet<>(Arrays.asList(str1.split("")));
            TreeSet<String> second = new TreeSet<>(Arrays.asList(str2.split("")));
            return first.equals(second);

    }


}