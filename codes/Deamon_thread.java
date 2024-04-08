package codes;
//Daemon thread 
class  Test extends Thread{
	public void run()
	{
		System.out.println("This is child");
	}
}
public class Deamon_thread {

	public static void main(String[] args) {
		Test t1=new Test();
		System.out.println("This is main thread");
//		t1.setDaemon(true);
		t1.start();
//		t1.setDaemon(true); you can set Daemon threa after the start method invoke that's why you can set main thread as daemon 
		
		
		

	}

}
