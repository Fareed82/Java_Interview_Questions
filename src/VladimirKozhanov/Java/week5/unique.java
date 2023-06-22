package VladimirKozhanov.Java.week5;

public class unique {

    public static void main(String[] args) {

        String str = "AAABBCCCDEF";
        System.out.println(unique(str));


    }


    public static String unique(String str) {
        String check = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                check += str.charAt(i);
            }
        }
        return check;
    }

}
