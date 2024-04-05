package codes;
//t is a marker interface in Java that is defined in the java.io package. If we want to make the class serializable, we must implement the Serializable interface

import java.io.*;
class emps implements  Serializable
{
	int eid;
	String name;
	int salary;
	
	emps(int eid,String name,int salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
}

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			emps ob1=new emps(101,"Vishu",25000);
			FileOutputStream fout=new FileOutputStream("emp.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			
			out.writeObject(ob1);
			out.flush();
			out.close();
			fout.close();
			System.out.println("Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
