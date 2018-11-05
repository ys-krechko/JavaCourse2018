package Homework;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task11_26 {
    public static void main(String[] args) {
        int x = 10;
        Random r = new Random();
        List<Integer> marks = new ArrayList<>(x);
        for (int i = 0; i < x; i++) { // заполняет случайными оценками
            marks.add(r.nextInt(11));
        }
        System.out.print(marks + " ");
        System.out.println();
        for (int i = 0; i < x; i++) { // удаляет неудовлетворительные оценки из списка
            if (marks.get(i) <= 3) {
                marks.remove(i);
                i--;
                x--;
            }
        }
        System.out.print(marks + " ");
    }
}
