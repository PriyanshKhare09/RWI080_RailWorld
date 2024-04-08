package codes;
class Test2 extends Thread
{
	public void run()
	{
		//get the Thread Name using GetName Method
		System.out.println(Thread.currentThread().getName());
		System.out.println("The");
		//set the thread Name
		Thread.currentThread().setName("Child");
		System.out.println(Thread.currentThread().getName());
	}
}
public class Basic_Method_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2=new Test2();
		t2.start();
		//print Main thread name you can also can main thread method using SetNam
		System.out.println(Thread.currentThread().getName());
		//this method check thread is alive or not
		System.out.println(t2.isAlive());
		System.out.println(Thread.currentThread().isAlive());
	
	}

}
