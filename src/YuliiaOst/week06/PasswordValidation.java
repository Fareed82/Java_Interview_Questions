package YuliiaOst.week06;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = input.next();

       if (passwordValidation(password)) {
            System.out.println("Your password is valid");
        } else {
            System.out.println("Your password is not valid. It must:\n" +
                    "- have 6 characters and should not contain space;\n" +
                    "- at least contain one upper case and one lowercase letter, one special character and a digit.");
        }

        input.close();

    }

    public static boolean passwordValidation(String pass) {

        // Password must be at least have 6 characters and should not contain space
        if (pass.length() < 6 || pass.contains(" ")) {
            return false;
        }

        // Iterate throw each character in the password and check the requirements
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (int i = 0; i < pass.length(); i++) {
            char letter = pass.charAt(i);

            if (Character.isUpperCase(letter)) {              // Password should at least contain one upper case letter
                hasUppercase = true;

            } else if (Character.isLowerCase(letter)) {       // PassWord should at least contain one lowercase letter
                hasLowercase = true;

            } else if (Character.isDigit(letter)) {           // Password should at least contain a digit
                hasDigit = true;

            } else if (!Character.isLetterOrDigit(letter)) {  //Password should at least contain one special characters
                hasSpecialChar = true;
            }
        }

        // All requirements met
        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
    }
}

/*
1. Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
    5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.

 */