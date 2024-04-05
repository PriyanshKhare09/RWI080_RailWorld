package codes;
//Cleanable interface in Java is also a marker interface that belong to java.lang package. It generates replica (copy) of an object with different name.
class emp implements  Cloneable
{
	int eid;
	String name;
	int salary;
	
	emp(int eid,String name,int salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Name:"+this.name+","+this.eid+","+this.salary);
		
	}
	 @Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
}


public class Marker_interface {
	//marker interface is a interface that does't have any method and constant inside it.
	//this type interface provide the runtime type information about the object so jvm and complier have extra information about the object
	//build in marker interface 
	//1 Cloneable interface
	//2 Serialization interface 
	//3 remote interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		emp obj1=new emp(101,"Amit",5000);
		emp obj2=(emp)obj1.clone();
		obj2.display();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
