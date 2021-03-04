
public class DeluxeACRoom extends DeluxRoom{
 
	private int ratePerSqFeet;

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, 
			int ratePerSqFeet2) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet = ratePerSqFeet2;
	}
	
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int calculateTariff()
	{
		return numberOfSqFeet*ratePerSqFeet;
	}
	
	
}
