package com.ltts;
import java.util.Scanner;
import java.io.IOException;

public class run2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of overs");
		int over= sc.nextInt();
		int arr[]= new int[over];
		System.out.println("Enter the number of runs for each over");
		for(int i=0;i<over;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the over number");
		int ovrNo=sc.nextInt();
		
			System.out.println("Runs Scored in this over:" +arr[ovrNo]);
		
		    }
	
		catch(Exception e) {
			System.out.println("Exception " + e);
		}
		
  }
}