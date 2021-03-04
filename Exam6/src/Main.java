
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of players: ");
		n=sc.nextInt();
		PlayerExam [] pl = new PlayerExam[n];
		for(int i=0;i<n;i++) {
			String str;
			Scanner sc2=new Scanner(System.in);
			str=sc2.nextLine();
			pl[i]=PlayerExam. createPlayer(str);
			}
		HashMap<String, Integer> hs = new HashMap<String, Integer>(); 

		String key = ""; 
		int value = 0; 

		
		for (int i = 0; i < n; i++) { 
			if (hs.containsKey(pl[i].getNationality())) { 
				hs.put(pl[i].getNationality(), hs.get(pl[i].getNationality()) + 1); 
		    }  else { 
		    	hs.put(pl[i].getNationality(), 1); 
		    }
			Set<Map.Entry<String, Integer> > set = hs.entrySet(); 
			
			for (Map.Entry<String, Integer> me : set) { 
				if (me.getValue() > value) { 
					value = me.getValue(); 
         
					key = me.getKey(); 
				} 
 } 
System.out.println("The nationality with maximum players: "+key);
System.exit(0);

} 
} 
}

