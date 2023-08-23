package com.pluralsight.workshop4;

public class Vehicle {
    private int vin, year, odometer;
    private double price;
    private String make, model, vehicleType, color;

    public Vehicle(int vin, int year, int odometer, double price, String make, String model, String vehicleType, String color) {
        this.vin = vin;
        this.year = year;
        this.odometer = odometer;
        this.price = price;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }
}
