import java.util.ArrayList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		Scanner sc=  new Scanner(System.in);
		int noOfMatch= sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<noOfMatch;i++) {
			int j= sc.nextInt();
			al.add(j);
		}
		
		int countFif=0, countHun=0;
		
		for(Integer i:al) {
			if(i>=50 && i<100) {
				countFif++;
			}
			if(i>=100) {
				countHun++;
			}
		}
		System.out.println(countFif);
		 System.out.println(countHun);

	}

}
