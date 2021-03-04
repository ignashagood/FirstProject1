package com.company;

public class Main {

    public static void main(String[] args) {
        Bus bus1 = new Bus(1, 54, 400);
        Bus bus2 = new Bus(2, 45, 500);
        bus1.setOccupiedSeats(25);
        bus2.setOccupiedSeats(30);
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.print("Первый автобус ");
        printBusProfitability(bus1);
        System.out.print("Второй автобус ");
        printBusProfitability(bus2);
    }

    private static void printBusProfitability(Bus bus) {
        if (bus.isProfitable())
            System.out.println("рентабелен");
        else
            System.out.println("не рентабелен");
    }
}
