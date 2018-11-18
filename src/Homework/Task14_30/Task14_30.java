package Homework.Task14_30;

/*Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task14_30 {
    public static void main(String[] args) throws IOException {
        int count;
        try (BufferedReader reader = new BufferedReader(new FileReader("Task14_30.txt"))) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода-ввывода: " + e);
        }
    }
}
