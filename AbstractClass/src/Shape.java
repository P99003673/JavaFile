
public abstract class Shape {
  
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	 abstract void calculateArea(double value);
}
