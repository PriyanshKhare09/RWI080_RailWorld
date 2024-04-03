package codes;
//multilieve_inheritance
// A subclass extends another subclass, creating a chain of inheritance
class A{
	void sum(int a ,int b)
	{
		System.out.println("the Sum is "+(a+b));
	}
}
class B extends A{
	void sub(int a,int b)
	{
		System.out.println("the Sub is"+(a-b));
	}
}
class C extends B{
	void multi(int a,int b)
	{
		System.out.println("the multi is"+(a*b));
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		C obj=new C();
		obj.sum(10,20);
		obj.sub(50,10);
		obj.multi(5, 8);

	}

}
