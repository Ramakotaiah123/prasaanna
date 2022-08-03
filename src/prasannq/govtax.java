package prasannq;
import java.io.*;

public class govtax {

	public static void main(String[] args) throws IOException {
		double sal,gst,tamt,hand,bonus,bsal;
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter salary:");
		sal=Double.parseDouble(BR.readLine());
		System.out.println("gov tax:");
		gst=Double.parseDouble(BR.readLine());
		tamt=sal*gst/100;
		System.out.println(" tax amount:"+tamt);
		hand=sal-tamt;
		System.out.println(" By hand:"+hand);
		System.out.println(" enter bonus:");
		bonus=Double.parseDouble(BR.readLine());
		bsal=hand+bonus;
		System.out.println("----------");
		System.out.println("amount pay:"+bsal);
		System.out.println("----------");
		
		
		
}

}
