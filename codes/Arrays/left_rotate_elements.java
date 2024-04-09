package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class left_rotate_elements {

	public static void main(String[] args) {
		System.out.println("Enter a position where to left");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();	
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<k;i++)//run loop nth number
		{
			int first=arr[0];//store fist element 
			for(int j=0;j<arr.length-1;j++)//run second loop arrays length
			{
				arr[j]=arr[j+1];//shift the each element of loop
			}
			arr[arr.length-1]=first;//insert the fist element at last element
		}
		System.out.println(Arrays.toString(arr));
	}

}
