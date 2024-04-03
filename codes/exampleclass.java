package codes;


class test{
	//Fields
	int a=10;
	
	//Constructors
	 test()
	{
		System.out.println("This is a constructors");
	}
	 //constructors with parameter
	 test(int a,int b)
	 {
		 int sum=a+b;
		 System.out.println(sum);
	 }

	//static block
	static {
		System.out.println("This is a static block");
		
	}
	
	//method
	public void display()
	{
		System.out.println(a);
	}
}
public class exampleclass {
	public static void main(String arg[])
	{
		test t=new test();
		test t2=new test(10,20);
		t.display();
	}

}
