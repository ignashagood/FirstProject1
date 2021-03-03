package com.company;

public class Main {

    public static void main(String[] args) {
        int x;
        Bus Bus1 = new Bus(54, 400, 25);
        Bus Bus2 = new Bus(45, 500, 30);
        if (Bus1.isFull == true)

        System.out.print("Для первого автобуса ");
        Bus1.profitability();
        System.out.print("Для второго автобуса ");
        Bus2.profitability();
    }
}
