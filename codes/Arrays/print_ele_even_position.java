package Arrays;

public class print_ele_even_position {
	
	static void printEvent(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	static void printodd(int brr[])
	{
		for(int i=0;i<brr.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(brr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,50,60,40,30};
		System.out.println("The Odd Index Position Element is:");
		printodd(arr);
		System.out.println("The Even Index Position Element is:");
		printEvent(arr);


	}

}
