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
            } else if (str1==null) {
                return result;
            } else {
                result=false;
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