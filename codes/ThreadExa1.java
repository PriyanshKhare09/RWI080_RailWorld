package codes;
//creating a Thread using Thread class
class Test_thread extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running");
	}
}
//Creating a thread using Runnable interface

class Test1_thread implements Runnable
{
	public void run()
	{
		System.out.println("Running thread Runnable");
	}
}
public class ThreadExa1 {

	public static void main(String[] args) {
		Test_thread t1=new Test_thread();
		t1.start();
		
//		Test1_thread t2=new Test1_thread();
//		Thread th=new Thread(t2);
//		th.run();
		Thread t2= new Thread(new Test1_thread());
		t2.start();

	}

}
