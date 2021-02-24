import java.util.*;
public class SecondFact
{
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		digitFactorial(num);
		
	}
static	void digitFactorial(int num)
	{
	    
	    int a[]=new int[5];
	    if(num>32767)
	    {
	        System.out.println("Number too large");
	  
	    }
	    else if(num<0)
	    {
	        System.out.println("number too short");
	    }
	    else
	    {
	     int t=num;
	     int rev=0;
	    
	        while(t != 0) 
	        {
            int digit = t% 10;
            rev= rev * 10 + digit;
            t /= 10;
            }

         while(rev!=0)
         {
             int k=rev%10;
             int p=0;
             for(int i=k-1;i>0;i--)
             {
                k=k*i;
                 
             }
             a[p]=k;
              System.out.println(a[p]);
              p++;
             rev=rev/10;
             
         }
	     
	    }
	}
}