package Arrays;

public class print_duplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,5,4,4,5,9,1};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
