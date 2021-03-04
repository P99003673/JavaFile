import java.util.Scanner;
public class ShapeMain {

	public static void main(String[] args) {


		Shape s=new Circle();
		Shape t=new Square();
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the Shape");
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		if(c.equalsIgnoreCase("circle"))
		{
			System.out.println("enter the radius");
			int r=sc.nextInt();
			s.calculateArea(r);
		}
		else
		{
			System.out.println("enter the side");
			int r=sc.nextInt();
			t.calculateArea(r);
		}
		
		

	}

	}


