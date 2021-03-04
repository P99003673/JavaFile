import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class DisplayTeamMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no= Integer.parseInt(br.readLine());
		
		Set<Team> stteam = new TreeSet<Team>();
				String teamname, playername;
		for(int i=1;i<=no;i++) {
			String str= br.readLine();
			String[] pro = str.split("\\|");
			teamname = pro[0];
			playername=pro[1];
			Team t= new Team(teamname);
			t.addPlayer(playername);
			stteam.add(t);
			for(Team t1: stteam) {
				if(t1.getName().equals(teamname)) {
					t1.addPlayer(playername);
				}
				else {
					
				}
			}
			
		}
		
	}

}
