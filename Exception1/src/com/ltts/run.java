package com.ltts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class run {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total runs scored");
		int runs= Integer.parseInt(br.readLine());
		System.out.println("Enter the total overs");
		int overs= Integer.parseInt(br.readLine());
		try {
			double runRate= runs/overs;
			System.out.println("Current run rate:"+runRate);
			
		}
		catch(Exception e){
			throw new ArithmeticException();
			//System.out.println("run exception");
			
		}
		
	}

}
