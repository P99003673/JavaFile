
public class vehicle {

	protected String vehicleNumber;
	// private int noOfWheels;
	protected String make;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	

	public vehicle(String vehicleNumber, String make, String fuelType, int fuelCapacity, int cc) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.make = make;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

}
