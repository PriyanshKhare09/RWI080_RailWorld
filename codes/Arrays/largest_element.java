package Arrays;
class codes{
	//Max Element 
	static void Max_element(int arr[])
	{
		int max=0;
		for(int x:arr)
		{
			if(x>max)
			{
				max=x;
			}
		}
		System.out.println("Max Element is "+max);
	}
	//Second Max Element 
	static void Second_largest(int arr[])
	{
		int max=0;
		int sec_max=0;
		for(int x:arr)
		{
			if(x>max)
			{
				sec_max=max;
				max=x;
			}
			else if(x>sec_max&&max!=x)
			{
				sec_max=x;
			}
		}
		System.out.println("Max Element is"+max+" Second Max Element is"+sec_max);
	}
	//Smallest Element
	static void smallest_element(int arr[])
	{
		int smllst=Integer.MAX_VALUE;
		for(int x:arr)
		{
			if(x<smllst)
			{
				smllst=x;
			}
		}
		System.out.println("Smallest Element is "+smllst);
	}
	//Second Smallest 
	static void Second_Smallest_element(int arr[])
	{
		int smllest=Integer.MAX_VALUE;
		int Sec_smllest=Integer.MAX_VALUE;
		
		for(int x:arr)
		{
			if(x<smllest)
			{
				Sec_smllest=smllest;
				smllest=x;
			}
			else if(x<Sec_smllest&&x!=smllest)
			{
				Sec_smllest=x;
			}
		}
		System.out.println("Smallest Element Is"+smllest+"Second Smallest Element Is"+Sec_smllest);
	}
}
public class largest_element {

	public static void main(String[] args) 
	{
		int arr[]= {10,10,20,30,80,40,50,100,60,70,80,80,100,10,20,0};
		codes.Max_element(arr);
		codes.Second_largest(arr);
		codes.smallest_element(arr);
		codes.Second_Smallest_element(arr);
	}

}
