//import java.lang.*;
public class outer {
 
	int a=10;
	class inner{
		int a=100;
		public void m1() {
			int a=1000;
			System.out.println("I am in inner class");
			System.out.println("a Value" +a);
			System.out.println("This.a Value" +this.a);
			//System.out.println("This.a Value" +this.a);
		}
	}
}
