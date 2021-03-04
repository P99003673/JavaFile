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
		
		SortScores scr = new SortScores(match,score);
		SortScores scr1 = new SortScores(match1,score1);
		SortScores scr2 = new SortScores(match2,score2);
		try
		{
		Thread th = new Thread(scr);
		scr.start();
		scr.join();
		Thread th1 = new Thread(scr1);
		scr1.start();
		scr1.join();
		Thread th2 = new Thread(scr2);
		scr2.start();
		scr2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		

	}

}
