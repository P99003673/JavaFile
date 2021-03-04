import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  
		ArrayList<String> al = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		al.add("Sunrisers Hyderabad");
		al.add("Delhi Capitals");
		al.add("Royal Challengers Bangalore");
		al.add("Kolkata Knight Riders");
		al.add("Mumbai Indians");
		System.out.println("predicted top 5 teams are : ");
		System.out.println(al);
		

		System.out.print("enter the position1 where to swap : ");
		int pos1 = Integer.parseInt(br.readLine());
		System.out.print("enter the position2 where to swap : ");
		int pos2 = Integer.parseInt(br.readLine());
		
		
		Collections.swap(al, pos1, pos2);
		System.out.println("new list is ---");
		

		for(String s : al) {
			System.out.println(s);
		}
		
		
	}

}
