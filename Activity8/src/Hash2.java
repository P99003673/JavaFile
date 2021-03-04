import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class Hash2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    
		
		TreeSet ts = new TreeSet();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String name1= br.readLine();
		String name2= br.readLine();
		String name3= br.readLine();
		String name4= br.readLine();
		String name5= br.readLine();
		
		ts.add(name1);
		ts.add(name2);
		ts.add(name3);
		ts.add(name4);
		ts.add(name5);
		
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		
	}

}
