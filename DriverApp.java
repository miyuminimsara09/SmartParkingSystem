
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
