package Homework.Task18_1;

import java.math.BigDecimal;

public class StoreCashier {
    public synchronized void sell(BigDecimal sum, BigDecimal purse) {
        int percent = 5;
        BigDecimal result = new BigDecimal(0);
        if (sum.compareTo(new BigDecimal(5.00)) < 0) {
            System.out.println("Скидка - 0%." + "\nОбщая сумма чека: " + sum + " руб.");
            System.out.println("Оплачено: " + purse + " руб.\nСдача: " + (purse.subtract(sum)) + " руб.");
        } else {
            int discount = sum.intValue();
            discount *= (percent / 100);
            result = result.add(sum).subtract(new BigDecimal(discount));
            System.out.println("Скидка - " + percent + " %." + "\nОбщая сумма чека: " + result + " руб.");
            System.out.println("Оплачено: " + purse + " руб.\nСдача: " + (purse.subtract(result)) + " руб.");
        }
    }
}
