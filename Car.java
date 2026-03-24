
public class Car implements Vehicle {

    @Override
    public void park() {
        System.out.println("Car is parked in the parking lot.");
    }

    @Override
    public String getType() {
        return "Car";
    }
}
