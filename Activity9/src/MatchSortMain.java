import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class MatchSortMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  
		LinkedList<Match> ls = new LinkedList<Match>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		System.out.println("Enter the number of matches");
		int no = Integer.parseInt(br.readLine());
		for(int i=1;i<=no;i++) {
			System.out.println("Enter match date in (MM-dd-yyyy) "+i);
			String date= br.readLine();
			System.out.println("Enter Team 1 ");
			String team1= br.readLine();
			System.out.println("Enter Team 2");
			String team2= br.readLine();
			ls.add(new Match(date,team1,team2));
			
		}
		
		System.out.println("Match Details");
		Collections.sort(ls);
		for(Match mg:ls){  
			System.out.println(mg.getMatchDate()+" "+mg.getTeamOne()+" "+mg.getTeamTwo());  
			}  
	}

}
