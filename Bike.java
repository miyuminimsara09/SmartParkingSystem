public class Bike implements Vehicle {

    @Override
    public void park() {
        System.out.println("Bike is parked in the parking lot.");
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
