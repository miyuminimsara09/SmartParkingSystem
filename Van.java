
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
