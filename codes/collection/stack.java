package collection;

import java.util.List;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
	    List<Integer>s=new Stack<>();
	    
	    boolean res=s.isEmpty();
	    System.out.println(res);
	    
	    s.add(52);
	    s.add(58);
	    s.add(54);
	    s.add(41);
	    s.add(47);
	    //print the element the stack
	    System.out.println("Eelement"+s);
	    res=s.isEmpty();
	    
	    System.out.println(res);

	}

}
