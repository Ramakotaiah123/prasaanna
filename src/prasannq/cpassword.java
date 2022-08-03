package prasannq;
import java.util.*;

public class cpassword {

	public static void main(String[] args) {
		String s1,s2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter password");
		s1=s.next();
		System.out.println("enter c-password");
		s2=s.next();
		if(s1.compareTo(s2)==0)
		{
			System.out.println("/n same password");
		}
		else
		{
			System.out.println("/n invalid password");
	}
}
}
			
	




