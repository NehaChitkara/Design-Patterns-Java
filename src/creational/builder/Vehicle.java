package creational.builder;

public class Vehicle {

    private String engine;
    private int wheel;

    // 1. optional parameter
    private int noOfAirbags;

    // 2. Private constructor with Builder as input
    private Vehicle(VehicleBuilder builder) {
	this.engine = builder.engine;
	this.wheel = builder.wheel;
	this.noOfAirbags = builder.noOfAirbags;
    }

    @Override
    public String toString() {
	return "Vehicle [engine=" + engine + ", wheel=" + wheel + ", noOfAirbags=" + noOfAirbags + "]";
    }

    // 3. Public static Builder class
    public static class VehicleBuilder {
	// 4. Has all the parameters of outer class
	private String engine;
	private int wheel;
	private int noOfAirbags;

	public VehicleBuilder(String engine, int wheel) {
	    this.engine = engine;
	    this.wheel = wheel;
	}

	public VehicleBuilder setAirbags(int noOfAirbags) {
	    this.noOfAirbags = noOfAirbags;
	    return this;
	}

	// 5. Has a Build method which returns Main Class Object
	public Vehicle build() {
	    return new Vehicle(this);
	}
    }
}
