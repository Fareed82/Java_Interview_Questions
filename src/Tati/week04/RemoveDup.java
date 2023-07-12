package Tati.week04;

public class RemoveDup {

    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) { // if the string result doesnt cantain the ch of str yet
                result += each; // then we will add the ch to string result
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */