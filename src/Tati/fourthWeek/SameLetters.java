package Tati.fourthWeek;

public class SameLetters {
    public static boolean same(String str1, String str2) {
        boolean result = true;
        for (int i = 0; i < str1.length(); i++) {
            char each1 = str1.charAt(i);
            //char each2 = str1.charAt(j);
            if (str2.contains("" + each1)) {
                str1 = str1.replaceAll("" + each1, "");
                str2 = str2.replaceAll("" + each1, "");
            } else if (str1 == null) {
                return result;
            } else {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(same("abc", "abb"));
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

/*
public static boolean SameLetters(String str1, String str2) {
        // write a return method  that check if a string is build out of the same letters as another string
        // ex: "abc", "cab"-> true;    "abc", "abb" -> false

        int count = 0; // count how many element str2 contains str1
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(str1.charAt(i) + "")) {  // check if str2 contains i element str1 and opposite
                count++; // if contains increase count
            }
        }
        if (count == str1.length()) {  // if equal it means count increased every loop iteration, what means str2 contains from characters str1
            return true;
        } else return false;
    }

    public static void main(String[] args) {

        System.out.println("SameLetters("abcde", "cabed"), expected true = " + SameLetters("abcde", "abcde"));
        System.out.println("SameLetters("abc", "aabed"), expected false = " + SameLetters("abc", "aabed"));
    }
 */