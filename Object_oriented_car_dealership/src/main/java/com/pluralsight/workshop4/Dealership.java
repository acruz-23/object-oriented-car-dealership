package com.pluralsight.workshop4;

import java.util.ArrayList;

public class Dealership {
    private String name, address, phone;
    private ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void getVehiclesByPrice(double min, double max){}

    public void getVehiclesByMakeModel(String make, String model){}

    public void getVehiclesByYear(int min, int max){}

    public void getVehiclesByColor(String color){}

    public void  getVehiclesByMileage(int min, int max){}

    public void getVehiclesByType(String type){}

    public void getAllVehicles(){}

    public void addVehicle(Vehicle vehicle){}

    public void removeVehicle(Vehicle vehicle){}

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
