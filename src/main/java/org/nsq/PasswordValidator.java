package org.nsq;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        return hasUppercase(password) && hasNumber(password);
    }

    private static boolean hasUppercase(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }

    private static boolean hasNumber(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }
}