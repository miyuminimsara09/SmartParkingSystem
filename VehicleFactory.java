
public class VehicleFactory {

    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("van")) {
            return new Van();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type: " + type);
        }
    }
}
