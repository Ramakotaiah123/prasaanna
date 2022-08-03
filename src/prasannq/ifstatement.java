package prasannq;
import java.util.*;

public class ifstatement {

	public static void main(String[] args) {
		int a,b,big;
		Scanner s=new Scanner(System.in);
		System.out.println("enter A value:");
		a=s.nextInt();
		System.out.println("enter B value:");
		b=s.nextInt();
		big=a;
		if(a<b)
		{
			big=b;
			}
		System.out.println("Big value is:"+big);
		
		}

}
