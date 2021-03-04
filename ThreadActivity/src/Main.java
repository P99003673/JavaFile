import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.*;
public class Main
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Match");
		String match = sc.next();
		System.out.println("Enter the Scores: ");
		String score = sc.next();
		
		System.out.println("Enter the Match");
		String match1 = sc.next();
		System.out.println("Enter the Scores: ");
		String score1 = sc.next();
		System.out.println("Enter the Match");
		String match2 = sc.next();
		System.out.println("Enter the Scores: ");
		String score2 = sc.next();
		
		SortScores obj = new SortScores(match,score);
		SortScores obj1 = new SortScores(match1,score1);
		SortScores obj2 = new SortScores(match2,score2);
		try
		{
		Thread th = new Thread(obj);
		obj.start();
		obj.join();
		Thread th1 = new Thread(obj1);
		obj1.start();
		obj1.join();
		Thread th2 = new Thread(obj2);
		obj2.start();
		obj2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		

	}

}
