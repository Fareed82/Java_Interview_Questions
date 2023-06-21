package YuliiaOst.week04;

import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDup(String str) {

        if (str.isEmpty()) {
            System.out.println(("String is empty"));
        } else if (str.isBlank()) {
            System.out.println("String contains only empty spaces");
        }

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char letter = str.charAt(i);

            if (!result.contains(letter + "")) {
                result += letter;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any string: ");
        String str = input.nextLine();

        System.out.println(removeDup(str));

        input.close();

    }

}

/*
Write a return method that can remove the duplicated values from String.
Ex: removeDup("AAABBBCCC") ==> ABC
 */