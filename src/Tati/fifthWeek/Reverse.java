package Tati.fifthWeek;

public class Reverse {
    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);

        }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));

    }
}
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */