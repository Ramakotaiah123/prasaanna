package prasannq;
import java.util.*;

public class stringbuilder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your String:");
		String sentence=sc.nextLine();
		char letters[]=sentence.toCharArray();
		System.out.println(letters.length);
		sc.close();
	}
		
}
