import java.util.Scanner;

public class arithmatic {

    public static void ArithmaticOperation(int inp1, int inp2, int ch)
    {
        int res;
        if((inp1<0 && inp2<0) || (ch>4 && ch<=0)){
            System.out.println("invalid input");
        }
        else{
        switch(ch){
            case 1:
                res = inp1 + inp2;
                System.out.println("sum is : " +res);
                break;
            case 2:
                res = inp1 - inp2;
                System.out.println("difference is : " +res);
                break;
            case 3:
                res = inp1 * inp2;
                System.out.println("product is : " +res);
                break;
            case 4:
                res = inp1 / inp2;
                System.out.println("division is : " +res);
                break;
            default:
                System.out.println("invalid");
            }
        }
    }
    public static void main(String[] args) {
        int inp1, inp2, ch;
        System.out.println("Enter first number ");
        Scanner sc = new Scanner(System.in);
        inp1 = sc.nextInt();
        System.out.println("Enter second number ");
        Scanner sc1 = new Scanner(System.in);
        inp2 = sc1.nextInt();
        System.out.println("Enter the operator\nPress 1 for Sum\nPress 2 for Substraction\nPress 3 for Product\nPress 4 for Division ");
        Scanner sc2 = new Scanner(System.in);
        ch = sc2.nextInt();
        ArithmaticOperation(inp1, inp2, ch);
        
    }
}