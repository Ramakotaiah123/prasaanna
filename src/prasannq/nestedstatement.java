package prasannq;
import java.util.*;

public class nestedstatement {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter A value");
		a=s.nextInt();
		System.out.println("enter B value");
		b=s.nextInt();
		System.out.println("enter C value");
		c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("/n A is big");
		}
		if(b>a && b>c)
		{
			System.out.println("/n Bis big");
		}
		if(c>a && c>b)
		{
			System.out.println("/n c is big");
		}
			
		
}

}
