package creational.builder;

public class BuilderMain {
    public static void main(String[] args) {

	Vehicle vehicle = new Vehicle.VehicleBuilder("engine", 4).
		setAirbags(4).build();
	System.out.println(vehicle.toString());
	//Output: Vehicle [engine=engine, wheel=4, noOfAirbags=4]
    }
}
