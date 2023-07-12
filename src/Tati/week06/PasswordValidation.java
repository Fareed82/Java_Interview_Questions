package Tati.week06;

public class PasswordValidation {
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
    public static boolean passwordValidation(String password) {

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialDigit = false;

        char ch;

        if (password.length() >= 6 && !(password.contains(" "))) {
            for (int i = 0; i < password.length(); i++) {
                ch = password.charAt(i);
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >=91 && ch<=96) || (ch >=123 && ch<=126)){
                    hasSpecialDigit = true;
                    /*
                     else if (!Character.isLetterOrDigit(letter)) {  //Password should at least contain one special characters
                hasSpecialChar = true;
                     */
                }
                    if (hasDigit && hasLowerCase && hasUpperCase && hasSpecialDigit) {
                        return true;
                    }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(passwordValidation("rT678@#!ty"));
    }
}
