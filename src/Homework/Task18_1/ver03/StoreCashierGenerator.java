package Homework.Task18_1.ver03;

// генерирует заданое количество объектов типа покупатель
public class StoreCashierGenerator implements Runnable {
    private Line line;
    private int storeCashierCount;
    Thread thrd;

    public StoreCashierGenerator(Line line, int storeCashierCount) {
        this.line = line;
        this.storeCashierCount = storeCashierCount;
        thrd = new Thread();
        thrd.start();
    }

    @Override
    public void run() {
        int count = 0;
        while (count < storeCashierCount) {
            Thread.currentThread().setName("Store cashier generate");
            count++;
            line.put(new StoreCashier("Касса № " + count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
