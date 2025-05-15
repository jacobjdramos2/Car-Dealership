package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DealershipFileManager {
    private static final Logger logger = Logger.getLogger(DealershipFileManager.class.getName());

    public Dealership getDealership() {
        String csvFile = "/Users/jacobjandekramos/Desktop/Year_Up_United/JavaClass/Assignments/car-dealership/src" +
                "/main/resources/inventory.csv";
        String line;
        String splitBy = ",";

        Dealership dealership = new Dealership("Subaru", "25000 Mission Blvd, Hayward, CA 94544", "(510) 826-0000");

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] currVehicle = line.split(splitBy);
                Vehicle newVehicle = new Vehicle(
                        Integer.parseInt(currVehicle[0]),
                        Integer.parseInt(currVehicle[1]),
                        currVehicle[2],
                        currVehicle[3],
                        currVehicle[4],
                        Integer.parseInt(currVehicle[5]),
                        Double.parseDouble(currVehicle[6])
                );
                dealership.addVehicle(newVehicle);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to read dealership inventory file", e);

        }

        return dealership;
    }

    public Dealership saveDealership() {
        return null;
    }
}
