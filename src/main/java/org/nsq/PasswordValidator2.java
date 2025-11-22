package org.nsq;

public class PasswordValidator2 {

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        return containsUppercase(password) && containsNumber(password);
    }

    private static boolean containsUppercase(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }

    private static boolean containsNumber(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }
}
