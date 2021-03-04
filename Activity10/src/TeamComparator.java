import java.util.Comparator;


	public class TeamComparator implements Comparator <Team>
	{

		@Override
		public int compare(Team t1, Team t2) {
			if(t1.numberOfMatches == t2.numberOfMatches)  
				return 0;  
			
				else if(t1.numberOfMatches > t2.numberOfMatches)  
				return 1;  
				
				else  
				return -1; 
		}
}

