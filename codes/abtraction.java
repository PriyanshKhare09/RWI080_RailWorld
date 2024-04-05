package codes;
//A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods.
//achieve abstraction with abstract class (0to100%)
abstract class Train{
	Train(){
		System.out.println("Train is ready");
	}
	//abstract method
	abstract void run();
	//non abstract method
	public void stop()
	{
		System.out.println("The Train is Stop");
	}
}

class IRCT extends Train{
	 public void run()
	 {
		 System.out.println("Train is running on the Track No 1520");
	 }
}
public class abtraction {

	public static void main(String[] args) {
		//create Abstract class reference variable ,but you can't create the object of abstract class
		Train t=new IRCT();
		t.run();
		t.stop();
	}

}
