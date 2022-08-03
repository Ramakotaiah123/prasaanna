package prasannq;
import java.util.*;

public class salary {
	public salary(double salary,double hra,double da,double ta,double pf) {
		double tsal,tax=13,tamt,hand;
		double sal = 0;
		tsal=sal-hra+da+ta-pf;
		System.out.println("/n total salary"+tsal);
		System.out.println("/n gov tax"+tax);
		tamt=tsal*tax/100;
		System.out.println("/n tax amount"+tamt);
		hand=tsal-tamt;
		System.out.println("/n by hand"+hand);
		}
	public static void main(String args[]) {
		double sal,hra,da,ta,pf;
		Scanner s=new Scanner(System.in);
		System.out.println("salary");
		sal=s.nextDouble();
		System.out.println("hra");
		hra=s.nextDouble();
		System.out.println("da");
		da=s.nextDouble();
		System.out.println("ta");
		ta=s.nextDouble();
		System.out.println("pf");
		pf=s.nextDouble();
		salary x=new salary(sal,hra,da,ta,pf);
	}

}
