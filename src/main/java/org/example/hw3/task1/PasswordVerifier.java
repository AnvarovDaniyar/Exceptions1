package org.example.hw3.task1;

    public class PasswordVerifier {
        public static void verifyPassword(String password) throws InvalidPasswordException {
            if (password.length() < 8) {
                throw new InvalidPasswordException("Пароль должен быть не менее 8 символов");
            }

            boolean hasDigit = false;
            boolean hasUpperCase = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                }
            }

            if (!hasDigit || !hasUpperCase) {
                throw new InvalidPasswordException("Пароль должен содержать хотя бы одну цифру и одну заглавную букву");
            }
        }
    }