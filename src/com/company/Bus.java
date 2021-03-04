package com.company;

public class Bus {
    private int numberBus;
    private int numberSeats;
    private int ticketPrice;
    private int occupiedSeats;

    public Bus() {
    }

    public Bus(int numberBus, int numberSeats, int ticketPrice, int occupiedSeats) {
        this.numberBus = numberBus;
        this.numberSeats = numberSeats;
        this.ticketPrice = ticketPrice;
        this.occupiedSeats = occupiedSeats;
    }

    public Bus copy() {
        return new Bus(numberBus, numberSeats, ticketPrice, occupiedSeats);
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
        return occupiedSeats == numberSeats;
    }

    public boolean isEmpty() {
        return occupiedSeats == 0;
    }

    public int calculateProfit() {
        return occupiedSeats * ticketPrice;
    }

    public void defineProfitability() {
        if (occupiedSeats * ticketPrice > 11000)
            System.out.println("поездка рентабельна");
        if (occupiedSeats * ticketPrice <= 11000)
            System.out.println("поездка не рентабельна");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberBus=" + numberBus +
                ", numberSeats=" + numberSeats +
                ", ticketPrice=" + ticketPrice +
                ", occupiedSeats=" + occupiedSeats +
                '}';
    }
}
