package codes;
//hyrbid_inheritance
//Hybrid inheritance is a combination of two or more types of inheritance. This is often achieved through interfaces and a mix of other inheritance types.

interface Flying{
         void fly();	
}

interface swimming{
		void swims();
}

class animals{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}

class Bird extends animals implements Flying{
	void chirp()
	{
		System.out.println("bird is chirping");
	}
	public void fly()
	{
		System.out.println("Bird is flying");
	}
	
}

class fish extends animals implements swimming{
	public void swims() {
		System.out.println("Fish is Swimming");
	}
}
public class hybrid_inheritance {

	public static void main(String[] args) {
		Bird obj=new Bird();
		obj.eat();
		obj.chirp();
		obj.fly();
		
		fish obj1=new fish();
		obj1.eat();
		obj1.swims();
				
				

	}

}
