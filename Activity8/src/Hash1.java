import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Hash1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   
		HashSet hs = new HashSet();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String name1= br.readLine();
		String name2= br.readLine();
		String name3= br.readLine();
		String name4= br.readLine();
		String name5= br.readLine();
		
		hs.add(name1);
		hs.add(name2);
		hs.add(name3);
		hs.add(name4);
		hs.add(name5);
		
		System.out.println(hs.size());
	}

}
