/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
public class DriverApp implements ParkingObserver {

    private String driverName;

    public DriverApp(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void update(String message) {
        System.out.println(driverName + " received notification: " + message);
    }
}