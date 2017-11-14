package com.company;

public class Vehicle {
    private String plateNumber;
    private String owner;

    public Vehicle(String plateNumber, String owner) {
        this.plateNumber = plateNumber;
        this.owner = owner;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
