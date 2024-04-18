package DSA;
class nodes{
	int data;
	nodes next;
	
	public nodes(int x)
	{
		this.data=x;
		this.next=null;
	}
}

class linkedlistt{
	nodes head;
	
	public linkedlistt()
	{
		head=null;
	}
	
	public void inser(int n)
	{
		nodes newnode=new nodes(n);
		if(head==null)
		{
			head=newnode;
		}
		else {
			nodes current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newnode;
		}
		
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else {
			nodes curet=head;
			while(curet!=null)
			{
				System.out.println(curet.data);
				curet=curet.next;
			}
		
		}
	}
	
	public void insetfirst(int n)
	{
		nodes newnode=new nodes(n);
		if(head==null)
		{
			head=newnode;
		}
		else {
			nodes tem=head;
			newnode.next=head;
			head=newnode;
			
		}
	}
	
	public void findmiddle()
	{
		if(head==null)
		{
			System.out.println("list is Empty");
		}
		else {
			nodes slow=head;
			nodes fast=head;
			
			while(fast!=null&&fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
			}
			System.out.println(slow.data);
		}
	}
	
	public void deletefist()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else {
			head=head.next;
			System.out.println("Delete Succussfully");
		}
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else if(head.next==null)
		{
			head=null;
		}
		else {
			nodes cur=head;
			nodes prv=null;
			while(cur.next!=null)
			{
				prv=cur;
				cur=cur.next;
			}
			prv.next=null;
			
		}
	}
	
	public void rever() 
	{
		nodes cur=head;
		nodes prv=null;
		
		while(cur!=null)
		{
			nodes nextnode=cur.next;
			cur.next=prv;
			prv=cur;
			cur=nextnode;
		}
		head=prv;
	}
	
}
public class linkedlist {
	public static void main(String args[])
	{
		linkedlistt lt=new linkedlistt();
		lt.inser(10);
		lt.inser(20);
		lt.inser(30);
		lt.inser(40);
		lt.display();
		lt.insetfirst(50);
		System.out.println("After");
		lt.display();
		System.out.println("Middle Eelement");
		lt.findmiddle();
		System.out.println("Delelt first Node");
		lt.deletefist();
		lt.display();
		System.out.println("Delete Last Node");
		lt.deleteLast();
		lt.display();
		System.out.println("Reverse LinkList");
		lt.rever();
		lt.display();
	}

}
