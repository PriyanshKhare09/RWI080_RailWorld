package collection;

import java.util.List;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
	    List<Integer>s=new Stack<>();
	    
	    boolean res=s.isEmpty();
	    System.out.println(res);
	    
	    s.push(52);
	    s.push(58);
	    s.push(54);
	    s.push(41);
	    s.push(47);
	    //print the element the stack
	    System.out.println("Eelement"+s);
	    res=s.isEmpty();
	    
	    System.out.println(res);
	    System.out.println("Pop "+s.pop());
	    System.out.println("Peek Element "+s.peek());

	}

}
