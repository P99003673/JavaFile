import java.util.Scanner;
class InningsMain{
   
   public static void main(String args[]){
    
      Innings i = new Innings();
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the team name:");
      String name= sc.nextLine();
      i.setTeamName(name);
      System.out.println("Enter session:");
      String inningsname= sc.nextLine();
      i.setInningsName(inningsname);
      System.out.println("Enter Runs:");
      int runs= sc.nextInt();
      i.setRuns(200);
    //   System.out.println("Name:" + i.getTeamName());
      
    //   System.out.println("Runs:" + i.getRuns());
      
      i.displayInningsDetails(inningsname);

   }

}