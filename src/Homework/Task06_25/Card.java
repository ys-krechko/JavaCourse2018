package Homework.Task06_25;

import java.util.Random;

public class Card extends Bank {
    String name;
    String type;

    Random r = new Random();

    Account<Integer> amountOfMoney = (bal) -> (bal + 5000 + r.nextInt(6000) - 1000);

    public Card(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void cardBalance(int a) {
        System.out.println("Баланс счёта - " + amountOfMoney.balance(a));
    }

    @Override
    public void bankName() {
        System.out.println("Наименование банка - " + name);
    }

    @Override
    public void cardType() {
        System.out.println("Тип карты - " + type);
    }
}
