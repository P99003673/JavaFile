import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class List1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		LinkedList ll = new LinkedList();
		System.out.println("Enter the Player's Details");
		System.out.println("Enter Player Name");
		String name= br.readLine();
		System.out.println("Enter Age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter Country");
		String coun= br.readLine();
		System.out.println("Enter Skills");
		String skill= br.readLine();
		ll.add(name);
		ll.add(age);
		ll.add(coun);
		ll.add(skill);
		System.out.println("Player Details");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		System.out.println("Enter the position of the detail to be removed");
		int detail = Integer.parseInt(br.readLine());
		ll.remove(detail);
		System.out.println("Player Details");
		Iterator itr1 = ll.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		
		}

	}
}	
