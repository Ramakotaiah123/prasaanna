package prasannq;
import java.util.*;

public class stringbuffer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer sb1=new StringBuffer("lakshmi");
		StringBuffer sb2=new StringBuffer("prasanna");
		StringBuffer sb3=new StringBuffer();
		System.out.println("first name"+sb1);
		System.out.println("last name"+sb2);
		sb3=sb1.append(sb2);
		System.out.println("/n full name"+sb3);
		}

}
