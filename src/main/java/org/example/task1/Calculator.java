package org.example.task1;

public class Calculator {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = divide(num1, num2);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}