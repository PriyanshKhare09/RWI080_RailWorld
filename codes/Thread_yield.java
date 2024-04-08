package codes;

public class Thread_yield extends Thread 
{
	public void run()
	{
		System.out.println("This is child");
		for(int i=0;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	} 

	public static void main(String[] args) {
		
		Thread_yield ty=new Thread_yield();
		ty.start();
		System.out.println("This is Parent");
		Thread.yield();
		//this method is used to stop the current Executing thread and give a chance to other thread for execution
		//thread Provides the hit to the thread-scheduler,then it depends on the thread-scheduler to accept the hit or ignore it. 
		for(int i=0;i<=100;i++)
		{
			System.out.println("Main");
		}

	}

}
