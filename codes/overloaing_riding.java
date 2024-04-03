package codes;


class parent{
	 void sub(int a,int b)
	 {
		 int s=a-b;
		 System.out.println("this is a parent clas"+s);
	 }
	
}
class sum extends parent{
	
	//method overloading having a same name but different argument in single class
	sum(int a,int b,int c)
	{
		System.out.println("sum is"+(a+b+c));
	}
	sum(int a,int b)
	{
		System.out.println("sum is "+(a+b));
	}
	
	//method overloading having a same name , argument in parent child class
	@Override
	 void sub(int a,int b)
	 {
		 int s=a-b;
		 System.out.println("this is a child class"+s);
	 }
}


public class overloaing_riding {

	public static void main(String[] args) 
	{
		sum obj=new sum(10,20);
		parent obj1=new parent();
		obj1.sub(50, 10);
		obj.sub(100, 50);
		

	}

}
