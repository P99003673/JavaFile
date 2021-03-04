import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter player 1 details:");
		String player1= br.readLine();
		System.out.println("Enter player 2 details:");
		String player2= br.readLine();
		String [] p1= player1.split("\\,");
		String [] p2= player2.split("\\,");
		
		String ps1= p1[0];
		String ps2=p1[1];
		String ps3= p1[2];
		int ps4= Integer.parseInt(p1[3]);
		int ps5=  Integer.parseInt(p1[4]);
		int ps6=Integer.parseInt( p1[5]);
		String ps7= p1[6];
		double ps8=Double.parseDouble(p1[7]);
		
		String ps11= p2[0];
		String ps22=p2[1];
		String ps33= p2[2];
		int ps44= Integer.parseInt(p2[3]);
		int ps55=  Integer.parseInt(p2[4]);
		int ps66=Integer.parseInt( p2[5]);
		String ps77= p2[6];
		double ps88=Double.parseDouble(p2[7]);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(ps2, formatter);
		System.out.println(date);
		LocalDate date1 = LocalDate.parse(ps22, formatter);
		
		Player p = new Player(ps1,date,ps3,ps4,ps5,ps6,ps7,ps8);
		System.out.println("Player 1 \n" + p + "\n");
		Player o = new Player(ps11,date1,ps33,ps44,ps55,ps66,ps77,ps88);
		System.out.println("Player 2 \n" + o + "\n");
		
		 Comp comp1 = new Comp(ps1, ps3, ps7);
	      Comp comp2 = new Comp(ps11, ps33, ps77);
	     
	      boolean bl = comp1.equals(comp2);

	      if(bl)
	      {
	    	  System.out.println("Player One is same as player two");
	      }
	      else
	      {
	    	  System.out.println("Player One and player 2 are different");
	      }


		
	}
}

	


