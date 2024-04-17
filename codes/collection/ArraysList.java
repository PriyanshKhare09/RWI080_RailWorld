package collection;
import java.util.*;


public class ArraysList
{
	public static void main(String arg[])
	{
		ArrayList<String> al=new ArrayList<>();
		boolean check=true;
		while(check)
		{
			System.out.println("Enter a Data");
			Scanner sc=new Scanner(System.in);
			String st=sc.next();
			al.add(st);
			System.out.println("Add More?Y/N");
			char c=sc.next().charAt(0);
			if(c=='N')
				break;
		}
		System.out.println("Your data is");
		for(String s:al)
		{
			System.out.println(s);
		}
}

}
