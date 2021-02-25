import java.util.Scanner;
public class name
{  
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The first name");
        String F =sc.nextLine(); 
         System.out.println("Enter The second name");
        String S =sc.nextLine(); 
        String firstLetter = F.substring(0, 1);
         
         firstLetter = firstLetter.toUpperCase();
         String remainingLetters = F.substring(1, S.length());
         remainingLetters= remainingLetters.toLowerCase();
        String secondLetter = S.toUpperCase();
          String name = firstLetter + remainingLetters+ " " +secondLetter;
         System.out.println("Name: "+" " + name);
    }
}