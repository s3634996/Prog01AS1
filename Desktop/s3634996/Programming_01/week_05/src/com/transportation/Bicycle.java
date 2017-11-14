package com.transportation;

import com.company.Vehicle;

public class Bicycle extends Vehicle {
    private String color;

    public Bicycle(String plateNumber, String owner, String color) {
        super(plateNumber, owner);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
