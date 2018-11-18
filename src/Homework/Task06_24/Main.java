package Homework.Task06_24;

/*Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов,
часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.*/

public class Main {
    public static void main(String[] args) {
        Appliances fridge= new Appliances(true, "Холодильник");
        Appliances microwave =new Appliances(true,"Микроволновка");
        fridge.name();
        fridge.printPowerState();
        System.out.println(fridge.lifeTime);
        microwave.name();
        microwave.printPowerState();
        System.out.println(microwave.lifeTime);
    }
}
