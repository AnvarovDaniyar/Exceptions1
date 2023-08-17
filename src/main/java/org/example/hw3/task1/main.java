package org.example.hw3.task1;

import static org.example.hw3.task1.PasswordVerifier.verifyPassword;

public class main {
    public static void main(String[] args) {
        try {
            verifyPassword("Abc12345");
            System.out.println("Пароль корректен");
        } catch (InvalidPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

