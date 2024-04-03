package codes;


class demo{
	public void sum()
	{
		int a=20;
		int b=20;
		System.out.println("The sum is"+a+b);
	}
}
public class objexample {

	public static void main(String[] args) 
	{
		//creating a object using new Keyword
		demo d=new demo();
		d.sum();
		
		//creating a object using new instance
		try {
			Class cls=Class.forName("obj");
			demo obj=(demo) cls.newInstance();
		}
	     catch (ClassNotFoundException e) { 
	    	  
	            // Display the exception along with line number 
	            // using printStacktrace() method 
	            e.printStackTrace(); 
	        } 
        catch (InstantiationException e) { 
        	  
            e.printStackTrace(); 
        } 
	      catch (IllegalAccessException e) { 
	            e.printStackTrace(); 
	        }
	}

}
