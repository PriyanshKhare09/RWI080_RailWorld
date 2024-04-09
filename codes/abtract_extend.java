package codes;
abstract class Animal1{
	abstract void makeSound();
}
abstract class Mammal1 extends Animal1{

}

class Dog1 extends Mammal1{
	void makeSound() {
		System.out.println("Whaao Whaao");
	}
}
public class abtract_extend {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.makeSound();

	}
	}


