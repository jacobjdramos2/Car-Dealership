package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehicleByPrice(double min, double max) {
        ArrayList<Vehicle> sortedByPrice = new ArrayList<>();

        return sortedByPrice;
    }

    public List<Vehicle> getVehicleByMakeModel(String make, String model) {
        ArrayList<Vehicle> sortedByMakeAndModel = new ArrayList<>();

        return sortedByMakeAndModel;
    }

    public List<Vehicle> getVehicleByYear(int min, int max) {
        ArrayList<Vehicle> sortedByYear = new ArrayList<>();

        return sortedByYear;
    }

    public List<Vehicle> getVehicleByColor(String color) {
        ArrayList<Vehicle> sortedByColor = new ArrayList<>();

        return sortedByColor;
    }

    public List<Vehicle> getVehicleByMileage(int min, int max) {
        ArrayList<Vehicle> sortedByMileage = new ArrayList<>();

        return sortedByMileage;
    }

    public List<Vehicle> getVehicleByType(String vehicleType) {
        ArrayList<Vehicle> sortedByType = new ArrayList<>();

        return sortedByType;
    }

    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }
}
