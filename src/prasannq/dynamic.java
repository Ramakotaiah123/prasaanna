package prasannq;
import java.util.*;

public class dynamic {

	public void cre(int a,int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("/n A"+a+"/tB"+b);
		}
	public static void main(String args[]) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter A");
		a=s.nextInt();
		System.out.println("enter B");
		b=s.nextInt();
		dynamic x=new dynamic();
		x.cre(a,b);
	}

}
