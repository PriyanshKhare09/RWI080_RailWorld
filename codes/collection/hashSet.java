package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
		//Insert the element into set
		set.add("Priyansh");
		set.add("Vishu");
		set.add("vishu");
		set.add("Priyansh");//set store the unique element
		//print the element
		System.out.println(set);
		
		//print the set using iterator
		
		Iterator tre=set.iterator();
		while(tre.hasNext())
		{
			System.out.println(tre.next());
		}
		
		//remove the element 
		set.remove("Priyansh");
		
		System.out.println("Print the Element After remove");
		System.out.println(set);
		
		//adding one set to another set
		HashSet<String>st2=new HashSet<>();
		st2.add("Ram");
		st2.add("Shyam");
		st2.add("Ravi");
		st2.add("Priyansh");
		
		set.addAll(st2);
		
		System.out.println("After adding one Set to another Set");
		System.out.println(set);
		
		
		

	}

}
