package codes;
//Hierarchical_inheritance
//in this inheritance multiple subclass inherit from the same superclass /Parent Class

class animal{
	void eat()
	{
		System.out.println("Animal is eating");
	}
	
}
class dog extends animal{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class cat extends animal{
	void meow()
	{
		System.out.println("Cat is meowing");
	}
}
public class Hierarchical_inheritance {

	public static void main(String[] args) {
		
		dog obj =new dog();
		obj.bark();//from animal class
		obj.eat();//from dog class

		cat obj1=new cat();
		obj1.eat();//from animal class
		obj1.meow();//from cat class
			
	}

}
