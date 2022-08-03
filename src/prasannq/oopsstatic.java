package prasannq;
public class oopsstatic {

	public void cre() {
		int a=10,b=5,c,d,f,g,h;
		System.out.println("A value"+a);
		System.out.println("B value"+b);
		c=a+b;
		d=a-b;
		f=a*b;
		g=a/b;
		h=a%b;
		System.out.println("/n add"+c);
		System.out.println("/n sub"+d);
		System.out.println("/n mul"+f);
		System.out.println("/n div"+g);
		System.out.println("/n mod"+h);
	}
	public static void main(String args[])
	{
		oopsstatic x=new oopsstatic();
		x.cre();
	}

}
