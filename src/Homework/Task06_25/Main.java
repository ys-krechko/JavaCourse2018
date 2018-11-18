package Homework.Task06_25;

/*Создать иерархию классов, описывающих банковские карточки. Иерархия должна иметь хотя бы три уровня.*/

public class Main {
    public static void main(String[] args) {
        Card c1 = new Card("Белинвестбанк", "Visa");
        Card c2 = new Card("Беларусбанк", "MasterCard");
        c1.bankName();
        c1.cardType();
        c1.cardBalance(1000);
        c2.bankName();
        c2.cardType();
        c2.cardBalance(500);
    }
}
