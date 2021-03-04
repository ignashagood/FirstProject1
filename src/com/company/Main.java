package com.company;

public class Main {

    public static void main(String[] args) {
        int x;
        Bus bus1 = new Bus(54, 400, 30);
        Bus bus2 = new Bus(45, 500, 20);
        if (bus1.isFull())
            System.out.println("Автобус полон!");
        if (bus2.isEmpty())
            System.out.println("Автобус пуст!");

        System.out.print("Для первого автобуса ");
        bus1.defineProfitability();
        System.out.print("Для второго автобуса ");
        bus2.defineProfitability();
    }
}
