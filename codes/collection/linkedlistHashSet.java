package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedlistHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  // TODO Auto-generated method stub

	}

}