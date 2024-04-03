package codes;


interface Walkable{
	void walk();
}
interface Swimmable{
	void swim();
}

class frog implements Walkable,Swimmable{
	public void  walk()
	{
		System.out.println("Frog is Walking");
	}
	public void swim()
	{
		System.out.println("Frog is Swimming");
	}
}
public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frog f=new frog();
		f.walk();//inhrited from walable interface
		f.swim();//inherited from Swimmable interface

	}

}
