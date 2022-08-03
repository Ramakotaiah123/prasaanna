package prasannq;
import java.util.*;

public class pen {
	public void cre(String yna,String qual,String cou,int fee,int dis) {
		int tfee;
		System.out.println("------------");
		System.out.println("vijayawada soft solutions");
		System.out.println("-------------");
		System.out.println("your name"+yna);
		System.out.println("qualification"+qual);
		System.out.println("joining course"+cou);
		System.out.println("course fee"+fee);
		System.out.println("discount"+dis);
		tfee=fee-dis;
		System.out.println("/t------------");
		System.out.println("payable amount"+tfee);
		System.out.println("------------");
		}
	public static void main(String args[]) {
		String yna,qual,cou;
		int fee,dis;
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		yna=s.next();
		System.out.println("enter qualification");
		qual=s.next();
		System.out.println("enter course");
		cou=s.next();
		System.out.println("enter fee");
		fee=s.nextInt();
		System.out.println("enter discount");
		dis=s.nextInt();
		pen x=new pen();
		x.cre(yna, qual, cou, fee, dis);
		}
	}
