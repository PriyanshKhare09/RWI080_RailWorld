package codes;
//encapsulation binding method and variable together in a single class 
//with the help of pojo and bean class you can achive encapsulation.
class Truck{
	private String make;
	private String model;
	private int year;
	
	
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	Truck(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	
	
	
}
public class encapsulation {

	public static void main(String[] args) {
		Truck t=new Truck("Tata","407",2021);
		System.out.println(t.getYear()+","+t.getMake()+","+t.getModel());
		System.out.println("After Set Data");
		t.setMake("Mahindra");
		t.setModel("Yodha");
		t.setYear(2024);
		System.out.println(t.getYear()+","+t.getMake()+","+t.getModel());
		

	}

}
