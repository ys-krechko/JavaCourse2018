package Homework;

/*Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
а другой с помощью StringBuilder и метода append. Сравните скорость их выполения.*/

/*Как сравнить скорость выполнения? Запускал методы по одному в main и смотрел на скорость их компиляции.
StringBuilder всегда медленее на несколько милисекунд.*/

public class Task06_21 {
    public static void main(String[] args) {
        Str();
        StrBuilder();
    }

    public static void Str() {
        String text = "Один ";
        String text1 = text + "Два ";
        String text2 = text1 + "Три ";
        String text3 = text2 + "Четыре ";
        String text4 = text3 + "Пять ";
        String text5 = text4 + "Шесть";
        System.out.println(text5);
    }

    public static void StrBuilder() {
        StringBuilder text = new StringBuilder("Один ");
        text = text.append("Два ");
        text = text.append("Три ");
        text = text.append("Четыре ");
        text = text.append("Пять ");
        text = text.append("Шесть");
        System.out.println(text);
    }
}
