
import java.util.Collections;
import java.util.List;

public class Team implements  Comparable<Team> {

	private String name;
	private List playerList;
	
	
	public Team(String name, List playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public Team() {
		super();
	}

	public Team(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List playerList) {
		this.playerList = playerList;
	}

	public void addPlayer(String name) {
		playerList.add(new Player( name));
	}
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
	
	
}
