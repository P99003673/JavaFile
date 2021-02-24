import java.util.Scanner;
class Leap
{
    static int checkLeapYear(int year)
    {
       
        if (year % 400 == 0 || year % 4 == 0)
            return 1;
     
        if (year % 100 == 0)
            return 0;
     
       
        if (year < 0)
            return -1;
      return 0;
    }
         

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the year \n");
        int y=sc.nextInt();
        int yr=checkLeapYear(y);
        if(yr==1)
        System.out.println( "yes" );
        else if(yr==0)
        System.out.println( "no" );
        else
        System.out.println( "Invalid Input" );
    }
}