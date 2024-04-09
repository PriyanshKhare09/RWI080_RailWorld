package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class copy_element {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) 
		{
				a[i]=sc.nextInt();
		}
		System.out.println("You enter Element"+Arrays.toString(a));
		int[] a1=new int [a.length];
		
		int i=0;
		for(int x:a)
		{
			a1[i]=x;
			i++;
		}
		System.out.println("Copy the element a to a1"+Arrays.toString(a1));
	}

}
