package codes;
// By default main thread priority is 5
//window does't support this priority concept, output totally depends on O/s
//if you given multiple thread same priority than output depends on thread scheduler
public class Priority_Thread extends Thread {
	public void run()
	{
		System.out.println("Child Thread");
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Priority_Thread pt=new Priority_Thread();
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
		//pt.setPriority(90);//this line throw the exception you can set priority between 0/10.
		pt.start();

	}

}
