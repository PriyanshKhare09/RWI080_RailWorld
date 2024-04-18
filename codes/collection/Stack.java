package DSA;

public class Stack {
	int a[];
	int top;
	int cap;

	// constructor
	public Stack(int cap) {
		this.cap = cap;
		top = -1;
		a = new int[cap];
	}

	void push(int data) throws Exception {
		if (top == cap - 1) {
			throw new Exception();
		}
		top++;
		a[top] = data;
	}

	int pop() throws Exception {
		if (top == -1) {
			throw new Exception();
		}
		int b = a[top];
		top--;
		return b;
	}

	int peak() throws Exception {
		if (top == -1) {
			throw new Exception();
		}
		return a[top];
	}

	boolean isEmpty() {
		return top == -1;
	}

	void displau() {
		for (int x : a) {
			System.out.println(x);
		}
	}

}

class Driver{
	public static void main(String arg[]) throws Exception
	{
		Stack s=new Stack(10);
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		s.displau();
		System.out.println(s.peak());
		s.pop();
		s.displau();
		
		
	}
}
