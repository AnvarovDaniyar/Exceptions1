package org.example.hw3.task2;

import java.io.IOException;

import static org.example.hw3.task2.FileManager.*;

public class main {
    public static void main(String[] args) {
        try {
            readFile("input.txt");
            writeFile("output.txt", "Пример записи в файл");
            copyFile("input.txt", "copy.txt");
            System.out.println("Операции выполнены успешно");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
