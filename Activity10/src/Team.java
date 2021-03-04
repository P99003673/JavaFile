
public class Team {

	String name;  
	int numberOfMatches;
	
	public Team(String name, int numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	
	@Override
	public String toString() {
		//System.out.println("Team List After sort by number of matches:");
		return   name + "--"+ numberOfMatches;
	}
	
	
}
