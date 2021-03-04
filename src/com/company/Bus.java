package com.company;

public class Bus {
    private static final int RENT_COEFF = 11000;

    private int numberBus;
    private int numberSeats;
    private int ticketPrice;
    private int occupiedSeats;

    public Bus() {
    }

    public Bus(int numberBus, int numberSeats, int ticketPrice) {
        this.numberBus = numberBus;
        this.numberSeats = numberSeats;
        this.ticketPrice = ticketPrice;
    }

    public Bus copy() {
        Bus copiedBus = new Bus(numberBus, numberSeats, ticketPrice);
        copiedBus.setOccupiedSeats(getOccupiedSeats());
        return copiedBus;
    }

    public int getNumberBus() {
        return numberBus;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public void setNumberBus(int numberBus) {
        this.numberBus = numberBus;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setOccupiedSeats(int occupiedSeats) {
        this.occupiedSeats = occupiedSeats;
    }

    public int calculateFreeSeats() {
        return numberSeats - occupiedSeats;
    }

    public boolean isFull() {
        return occupiedSeats >= numberSeats;
    }

    public boolean isEmpty() {
        return occupiedSeats == 0;
    }

    public int calculateProfit() {
        return occupiedSeats * ticketPrice;
    }

    public boolean isProfitable() {
        return calculateProfit() > RENT_COEFF;
    }

    @Override
    public String toString() {
        return "Автобус " +
                "номер " + numberBus +
                ": количество мест - " + numberSeats +
                ", цена билета - " + ticketPrice +
                ", количество занятых мест - " + occupiedSeats;
    }
}
