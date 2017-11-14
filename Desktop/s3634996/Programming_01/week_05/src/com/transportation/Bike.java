package com.transportation;

import com.company.Vehicle;

public class Bike extends Vehicle {
    private String brand;

    public Bike(String plateNumber, String owner, String brand) {
        super(plateNumber, owner);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
