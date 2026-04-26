package Stack.Operations;

public class Stack_Operations   {
	int [] stack = new int[3];
	int top = -1;
	
	void push(int num) {
		try {
		if(top == stack.length-1) {			
				throw new StackOverflowError("Stack Overflow");
			}
		else {
			++top;
			stack[top] = num;
			System.out.println(num + " Element push successfully");
		}
		}
		catch (StackOverflowError e) {
			System.out.println(e);
		}
	}
	
	void pop () {
		if(top == -1) {
			System.out.println("Stack underflow");
		}
		int res = stack[top--];
		System.out.println(res+" Element pop successfully");
	}
	
	void display() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		else {
			for(int i = top ; i>=0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
	
	void peek() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		else {
			int result = stack[top];
			System.out.println(result+" Peek element");
		}
	}
	public static void main(String[] args) {
		Stack_Operations so = new Stack_Operations();
		so.push(10);
		so.push(20);
		so.push(30);
//		so.push(300);
		
		so.display();
//		so.push(40);
//		so.pop();
//		so.display();
//		so.peek();
	}
}

