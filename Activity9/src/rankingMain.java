import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;



public class rankingMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList<Ranking> ls = new LinkedList<Ranking>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		System.out.println("Please provide the number of players");
		int no = Integer.parseInt(br.readLine());
		for(int i=1;i<=no;i++) {
			System.out.println("Enter the name of the player "+i);
			String name1= br.readLine();
			System.out.println("Enter the score of the player "+i);
			int score1 = Integer.parseInt(br.readLine());
			ls.add(new Ranking(name1,score1));
		}
		
		System.out.println("Player Details by Score(High to Low)");
		
		
		Collections.sort(ls);  
		for(Ranking rg:ls){  
		System.out.println(rg.getName()+" "+rg.getScore()+" ");  
		}  
		
	}

}
