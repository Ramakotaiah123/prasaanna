package prasannq;
import java.util.*;

public class switchstatement {

	public static void main(String[] args) {
		int cost,pt,tcost,choice=2;
		Scanner s=new Scanner(System.in);
		System.out.println("---------------");
		System.out.println("1 idly 2 dosa 3 puri 4 wada");
		System.out.println("---------------");
		System.out.println("enter your choice");
		System.out.println("/n================");
		System.out.println("~@morning star hotel@~");
		System.out.println("/n================");
		switch(choice)
		{
		case 1:
			System.out.println("item name:"+"idly");
			System.out.println("/n item cost");
			cost=s.nextInt();
			System.out.println("/n no of plates");
			pt=s.nextInt();
			tcost=cost*pt;
			System.out.println("/n/t---------");
			System.out.println("total cost"+tcost+"RS");
			System.out.println("/t-------------");
			break;
		case 2:
			System.out.println("item name:"+"dosa");
			System.out.println("/n item cost");
			cost=s.nextInt();
			System.out.println("/n no of plates");
			pt=s.nextInt();
			tcost=cost*pt;
			System.out.println("/n/t---------");
			System.out.println("total cost"+tcost+"RS");
			System.out.println("/t-------------");
			break;
		case 3:
			System.out.println("item name:"+"puri");
			System.out.println("/n item cost");
			cost=s.nextInt();
			System.out.println("/n no of plates");
			pt=s.nextInt();
			tcost=cost*pt;
			System.out.println("/n/t---------");
			System.out.println("total cost"+tcost+"RS");
			System.out.println("/t-------------");
			break;
		case 4:
			System.out.println("item name:"+"wada");
			System.out.println("/n item cost");
			cost=s.nextInt();
			System.out.println("/n no of plates");
			pt=s.nextInt();
			tcost=cost*pt;
			System.out.println("/n/t---------");
			System.out.println("total cost"+tcost+"RS");
			System.out.println("/t-------------");
			break;
			default:
				System.out.println("invalid order");
				}
		System.out.println("============");
		}

}
