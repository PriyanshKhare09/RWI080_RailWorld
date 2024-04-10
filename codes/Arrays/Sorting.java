package Arrays;

import java.util.Arrays;

class Sort{
	//sorting the element using bubble sort
	static void ascending_Sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrr[]= {5,2,6,7,8,9,11,10};
		Sort.ascending_Sort(arrr);

	}

}
