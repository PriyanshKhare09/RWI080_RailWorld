package collection;
import java.util.*;
class Book{
	int id;
	String name,author;
	int quantity;
	
	public Book(int id,String name,String author,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.quantity=quantity;
	}
}

public class linkedList {

	public static void main(String[] args) {
		//creating a LinkedList
		List<Book> list=new LinkedList<Book>();
		//creating Books
		Book b1=new Book(101,"C Programming","Dennis Ritchie",11);
		Book b2=new Book(102,"Java SE","Herbert Schildt",10);
		Book b3=new Book(103,"Python","Mark Lutz",15);
		Book b4=new Book(104,"Advance Java","	M.T. Savaliya",10);
		Book b5=new Book(105,"Spring","Rod Jhnson",9);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		System.out.println("All Books ");
		  for(Book b:list){  
			    System.out.println("Book Id:"+b.id+"Book Name:"+b.name+"Book Author:"+b.author+"Book Quantity :"+b.quantity);  
			    }  
		  
		  list.remove(0);//recived the index of the linkedlist
		  System.out.println("Books After Perform the Remove Method");
		  for(Book b:list){  
			    System.out.println("Book Id:"+b.id+"Book Name:"+b.name+"Book Author:"+b.author+"Book Quantity :"+b.quantity);  
			    }    

		

	}

}
