/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lasantha
 */
public class Van implements Vehicle {

    @Override
    public void park() {
        System.out.println("Van is parked in the parking lot.");
    }

    @Override
    public String getType() {
        return "Van";
    }
}
