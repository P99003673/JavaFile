import java.util.*;
public class Innings{
  private String teamname;
  private String inningsname;
  private int runs;

  public void setTeamName(String teamname){
     this.teamname=teamname;
  }

   public String getTeamName(){
     return teamname;
  }

  public void setInningsName(String inningsname){
     this.inningsname=inningsname;
  }

  public String getInningsName(){
     return inningsname;
  }

   public void setRuns(int runs){
     this.runs=runs;
  }

  public int getRuns(){
      return runs;
  }

  public void displayInningsDetails(String inningsname){
      if(inningsname.equals("First") || inningsname.equals("first"))
      {
          System.out.println("Name:" + " " + getTeamName() + " " + "Scored  \n" + getRuns() + "Need " + (getRuns() + 1) + " to win");
      }

      else 
		{
			System.out.println("Name:" + " " + getTeamName() + " " + "Scored " + getRuns() +" " + "Match Ended.");
		}	

   }


}
  