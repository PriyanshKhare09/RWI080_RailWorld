package codes;
//single inheritance
// in a inheritance Constructor and static method are not inherited
class parents{
	void display()
	{
		System.out.println("Hello i am Parent Class");
	}
}
class child extends parents{
	void show()
	{
		System.out.println("Hello i a, child Class");
	}
}
public class single_inheritance {

	public static void main(String[] args) {
	  child c=new child();
	  c.show();
	  c.display();
	}

}
