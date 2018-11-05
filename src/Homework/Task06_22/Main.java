package Homework.Task06_22;

/*Чоздать класс и объекты описывающие промежуток времени.
Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
(метод должен работать аналогично compareTo в строках). Создать два конструктора: получающий общее количество
секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.*/

/*Впрос: пункт "метод должен работать аналогично compareTo в строках", не могу придумать как это сделать.
Я сделал метод, на основании метода compare для Integer. Как должен выглдять метод, чтобы соответствовать условию?*/

public class Main {
    public static void main(String[] args) {
        Time a = new Time(10657);
        Time b = new Time(2, 57, 47);
        int x = a.compareTo(b);
        System.out.println("Промежуток времени в объекте а - " + a.displayData());
        System.out.println("Промежуток времени в объекте b - " + b.displayData());
        System.out.println("Количество секунд в объекте а - " + b.toSeconds());
        System.out.println("Объекте а и объект b - " + a.compareToText(x));
    }
}
