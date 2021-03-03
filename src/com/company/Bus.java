package com.company;

public class Bus {
    private int numberSeats;
    private int ticketPrice;
    private int occupiedSeats;
    public Bus() {
    }
    public Bus(int numberSeats, int ticketPrice, int occupiedSeats){
        this.numberSeats = numberSeats;
        this.ticketPrice = ticketPrice;
        this.occupiedSeats = occupiedSeats;
    }
    public void copy(Bus f) {
        f.numberSeats = this.numberSeats;
        f.ticketPrice = this.ticketPrice;
        f.occupiedSeats = this.occupiedSeats;
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
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public void setOccupiedSeats(int occupiedSeats) {
        this.occupiedSeats = occupiedSeats;
    }
    public int employment(){
        return (numberSeats-occupiedSeats);
    }
    public boolean isFull() {
        if (occupiedSeats == numberSeats)
            return true;
    }
    public boolean isEmpty() {
        if (occupiedSeats == 0)
            return true;
    }
    public int Price(){
        return (occupiedSeats*ticketPrice);
    }
    public void profitability() {
        if (occupiedSeats*ticketPrice > 11000)
            System.out.println("поездка рентабельна");
        if (occupiedSeats*ticketPrice <= 11000)
            System.out.println("поездка не рентабельна");
    }
}
