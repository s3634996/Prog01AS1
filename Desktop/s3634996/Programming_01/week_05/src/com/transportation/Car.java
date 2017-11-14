package com.transportation;

import com.company.Vehicle;

public class Car extends Vehicle{
    private int seats;

    public Car(String plateNumber, String owner, int seats) {
        super(plateNumber, owner);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
