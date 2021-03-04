package com.ltts;
import java.util.*;

public class IPLTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> aList = new ArrayList<String>();
	        aList.add("Kolkata Knight Riders");
	        aList.add("Royal Challengers Bangalore");
	        aList.add("Chennai Super Kings");
	        aList.add("Kings XI Punjab");
	        aList.add("Rajasthan Royals");
	        aList.add("Mumbai Indians");
	        aList.add("Sunrisers Hyderabad");
	        aList.add("Delhi Capitals");
	        


	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the expected Winner");
	        String wnr = sc.nextLine();
	        System.out.println("Enter the expected runner-up");
	        String rnr = sc.nextLine();
	        sc.close();
	        try{
	            if(aList.contains(wnr) && aList.contains(rnr)) {
	                System.out.println("found");
	            }else{
	            throw new TeamNotFoundException();   
	            }
	            System.out.println("Expected Winner --> " + wnr);
	            System.out.println("Expected Runner-up --> "+ rnr);
	        } 
	        catch(TeamNotFoundException e){
	            // System.out.println("error occured");
	        }
	        
	    }
	}

	public class TeamNotFoundException extends Exception{
	    public TeamNotFoundException(){
	        System.err.println("Error--> TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
	        }

}
