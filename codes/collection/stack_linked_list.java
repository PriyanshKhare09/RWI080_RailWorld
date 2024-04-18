package DSA;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Stacklinkedlist {
	Node top;

	public Stacklinkedlist() {
		this.top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int x) {
		Node newNode = new Node(x);
		if (isEmpty()) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}
		int popped = top.data;
		top = top.next;
		System.out.println(popped);
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		}
		int peak = top.data;
		System.out.println(peak);
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		Node current = top;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println();
	}
}

public class stack_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
