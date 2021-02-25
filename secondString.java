import java.util.Scanner;
public class secondString
{  
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The first name");
        String F =sc.nextLine(); 
         System.out.println("Enter The second name");
        String S =sc.nextLine(); 
        String check1 = F.substring(F.indexOf(' '));
         String check2 = S.substring(S.indexOf(' '));
        if(check1.equals(check2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}