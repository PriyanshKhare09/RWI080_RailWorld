package codes;
//in abstract class have a static and non Static method ,abstract and non abstract method.
abstract class Bike1{
	Bike1()//constructor of abstract Bike class 
	{
		System.out.println("Bike Is Created");
	}
	abstract void run(String name);//abstract method
	
	void TopSpeed()//non abstract and non static  method
	{
		System.out.println("Top Speed Is 120");
	}
	static void color()//static method
	{
		System.out.println("Black");
	}
}

class HFDelux extends Bike1{
	void run(String name)
	{
		System.out.println("HFDelux run by "+name);
	}
}

public class abstract_Const {

	public static void main(String[] args) {
		Bike1 b=new HFDelux();
		b.run("Amit");
		b.TopSpeed();
		Bike1.color();

	}

}
