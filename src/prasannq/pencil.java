package prasannq;

public class pencil {
	public pencil() {
		int tot=590;
		double per,pt;
		System.out.println("total marks"+tot);
		per=tot/6;
		pt=per/10;
		System.out.println("/n percentage"+per);
		System.out.println("/n points"+pt);
		if(tot<250)
		{
			System.out.println("/n fail");
		}
		else
		{
			System.out.println("/n pass");
		}
	}
		public static void main(String args[]) {
			pencil x=new pencil();
		}
		
	}


