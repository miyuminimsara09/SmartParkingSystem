/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
public class Main {

    public static void main(String[] args) {

        // Create parking lot
        ParkingLot parkingLot = new ParkingLot(2);

        // Create observers
        DriverApp driver1 = new DriverApp("Miyumi");
        DriverApp driver2 = new DriverApp("Nimsara");

        // Register observers
        parkingLot.addObserver(driver1);
        parkingLot.addObserver(driver2);

        // Create vehicles using Factory Method
        Vehicle car = VehicleFactory.createVehicle("car");
        Vehicle bike = VehicleFactory.createVehicle("bike");
        Vehicle van = VehicleFactory.createVehicle("van");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);

        // Parking full
        parkingLot.parkVehicle(van);

        // Release one slot
        parkingLot.releaseSlot();

        // Try parking again
        parkingLot.parkVehicle(van);
    }
}