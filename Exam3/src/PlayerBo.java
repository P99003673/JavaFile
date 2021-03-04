
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.*;

public class PlayerBo {
	

	String a;
	String b;
	List<Player> player1 = new ArrayList<Player>();
	//ClassPlayer c = new ClassPlayer();
	public void findPlayer(List<Player> player1,String nationality)
	{
		for(Player e:player1)
		{
			if(e.getNationality().equals(e))
			{
				 a = e.getName();
				 System.out.println(a);
			}
	
		}
	}
	
	public  void findPlayer(List<Player>player1,Date dateOfBirth)
	{
		for(Player e1:player1)
		{
			if(e1.getDate1().equals(e1))
			{
				 b = e1.getName();
				 System.out.println(e1);
			}
		}
	}
}
