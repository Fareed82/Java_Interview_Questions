package VladimirKozhanov.Java.week5;

public class ReverseString {

    public static void main(String[] args) {

        String str = "ABCD";


        System.out.println(reverse(str));

    }


    public static String reverse(String str) {
        String reversed = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            reversed += str.charAt(j);
        }

        return reversed;
    }


}
