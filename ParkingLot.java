/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingObserver> observers;
    private int totalSlots;
    private int availableSlots;

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        this.availableSlots = totalSlots;
        this.observers = new ArrayList<>();
    }

    public void addObserver(ParkingObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ParkingObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (ParkingObserver observer : observers) {
            observer.update(message);
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        if (availableSlots > 0) {
            System.out.println("\nParking a " + vehicle.getType() + "...");
            vehicle.park();
            availableSlots--;
            System.out.println("Available slots remaining: " + availableSlots);
            notifyObservers(vehicle.getType() + " parked successfully. Available slots: " + availableSlots);
        } else {
            System.out.println("\nNo parking slots available for " + vehicle.getType() + ".");
            notifyObservers("Parking lot is full. No slots available.");
        }
    }

    public void releaseSlot() {
        if (availableSlots < totalSlots) {
            availableSlots++;
            System.out.println("\nOne parking slot has been released.");
            System.out.println("Available slots now: " + availableSlots);
            notifyObservers("A parking slot is now available. Available slots: " + availableSlots);
        } else {
            System.out.println("\nAll slots are already free.");
        }
    }

    public int getAvailableSlots() {
        return availableSlots;
    }
}