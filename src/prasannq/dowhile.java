package prasannq;
import java.util.*;

public class dowhile {

	public static void main(String[] args) {
		int a=20,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter least no:");
		n=s.nextInt();
		do
		{
			System.out.println(a);
			a--;
			}
		while(a>=n);
		}

}
