
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Car c = new Car();
		c.setCarName("Benz");
		c.setVehicleNumber("KA57a480");
		c.setNoOfWheels(4);
		
		System.out.println(c.getCarName()+ " "+c.getVehicleNumber()+" "+c.getNoOfWheels());
	}

}
