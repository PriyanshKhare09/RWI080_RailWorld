package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Student{
	int roll;
	String name;
	String Address;
	
	public Student(int roll,String name,String Address)
	{
		this.roll=roll;
		this.name=name;
		this.Address=Address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", Address=" + Address + "]";
	}
	
	
}
public class arrayslist2 {

	public static void main(String[] args) {
		Student s1=new Student(101,"Priyansh","indore");
		Student s2=new Student(102,"Ravi","Bhopal");
		Student s3=new Student(103,"Rahul","Idore");
		
		ArrayList<Student> st=new ArrayList<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		//print element 
		for(Student s:st)
		{
			System.out.println(s.Address+","+s.name+","+s.roll);
		}
		//print the element with iterator
		Iterator  itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		System.out.println("________________");
		//print the element foreach method
		st.forEach(se->{
			System.out.println(se);
		});
		
		//print the element reverse order
		System.out.println("_______reverse____");
	    ListIterator itr2=st.listIterator(st.size());
	    while(itr2.hasPrevious())
	    {
	    	System.out.println(itr2.previous());
	    }
	   
	    

	}

	

}
