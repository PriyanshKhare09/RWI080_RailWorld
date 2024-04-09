package Arrays;

import java.util.Arrays;

public class reverse_oder {

	public static void main(String[] args) {
		int arr[]= {5,2,1,4,7,8,9};
		System.out.println("Orginal Arrays"+Arrays.toString(arr));
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{
			int tem=arr[low];
			arr[low]=arr[high];
			arr[high]=tem;
			low++;
			high--;
		}
		System.out.println("Reverse Arrays"+Arrays.toString(arr));

	}

}
