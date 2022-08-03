package prasannq;
import java.util.*;

public class euals {

	public static void main(String[] args) {
		String s1,s2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter user name");
		s1=s.next();
		System.out.println("enter password");
		s2=s.next();
		if(s1.equals(s2))
		{
			System.out.println("/n welcome to vijayawada----------");
		}
		else
		{
			System.out.println("/n invalid user & passaword");
		}
		

	}

}
