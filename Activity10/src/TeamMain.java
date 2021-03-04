
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class TeamMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Team> all=new ArrayList<Team>();
		
	System.out.println("Enter no of teams");
	int num=sc.nextInt();
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter Team "+(i+1)+ " details");
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Team no of matches");
		int no=sc.nextInt();
			
		all.add(new Team(name, no));
	}
	
	Collections.sort(all,new TeamComparator());  
	for(Team s:all)
	{
		System.out.println(s);
	}
	}
}
