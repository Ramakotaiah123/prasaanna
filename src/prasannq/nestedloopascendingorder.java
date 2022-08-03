package prasannq;
import java.util.*;

public class nestedloopascendingorder {

	public static void main(String[] args) {
		int a,b,m;
		Scanner s=new Scanner(System.in);
		System.out.println("limit no");
		 m = s.nextInt();
		for(a=1;a<=m;a++)
		{
		for(b=1;b<=a;b++)
		{
			System.out.println(b+"");
		}
		System.out.println("/n");
		}

}
}