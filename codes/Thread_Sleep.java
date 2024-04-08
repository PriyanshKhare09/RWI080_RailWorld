package codes;

public class Thread_Sleep {

	public static void main(String[] args) {
		try {
			for(int i=0;i<=10;i++)
			{
				Thread.sleep(1000);//sleep method is used to pause this executions of code limited time.the time is given by user
				//sleep method is static  so you can call it directly with class name
				// there are two types of sleep method 
				//1 is public static native  void sleep(long millisecond)
				//2 is public static void sleep(long mls,int nanosec)
				//both method throw Interrupted Exception. so you can wrapper the code inside try and catch block
				System.out.println(i);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
