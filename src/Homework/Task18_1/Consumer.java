package Homework.Task18_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Consumer implements Runnable {
    // необходимые переменные
    static StoreCashier storeCashier = new StoreCashier();
    Goods goods = new Goods();
    Thread thrd; //
    String name;
    Random r = new Random();
    BigDecimal sum = new BigDecimal(0); // общая сумма покупок
    BigDecimal purse = new BigDecimal(r.nextInt(2000)); // кошелёк
    /*int x = 0; // переменная для хранения случайного числа при генерации случайных покупок*/

    public Consumer(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " запуск.");
        // процесс совершения покупок
        int x = r.nextInt(10) - 2;
        List<String> listOfPurchases = new ArrayList<>(x); // для хранения наименований покупок

        for (int i = 0; i < x; i++) { // генерируется случаёное количество покупок
            // выбирается случайная покупка и его цена+формирование общей суммы покупок
            listOfPurchases.add(goods.goodsName.get(x));
            sum = sum.add(goods.goodsPrice.get(x));
        }

        purse = purse.add(sum); // добавление в кошелёк общей суммы покупок, чтобы покупателю всегда хватало денег расплатиться
        System.out.println("Сумма в кошельке " + purse + " руб.");
        System.out.println("Список покупок: ");
        for (String g : listOfPurchases) {
            System.out.print(g + " ");
        }

        storeCashier.sell(sum, purse);
        System.out.println(thrd.getName() + " завершение.");
    }
}
