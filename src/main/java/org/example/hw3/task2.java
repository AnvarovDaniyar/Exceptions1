package org.example.hw3;

public class task2 {
    public static void readFile(String filePath) throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new FileNotFoundException("Файл не найден");
        }
    }

    public static void writeFile(String filePath, String content) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new IOException("Ошибка при записи файла");
        }
    }

    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        try {
            FileInputStream inputStream = new FileInputStream(sourcePath);
            FileOutputStream outputStream = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            throw new IOException("Ошибка при копировании файла");
        }
    }

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