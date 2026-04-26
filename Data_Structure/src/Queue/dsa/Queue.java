package Queue.dsa;

public class Queue {
	int size = 5;
	int [] queue = new int[size];
	int front = -1, rear = -1;
	
	void enqueue(int value) {
		if(rear == size -1) {
			System.out.println("Queue is Overflow");
		}else {
			if(front == -1) {
				front = 0;
			}
				queue[++rear] = value;
				System.out.println(value + " is Inserted in Queue.");
			
		}
	}
	
	void Dequeue() {
		if(front == -1 || front > rear) {
			System.out.println("Queue is Underflow!!");
		}else {
			System.out.println(queue[front++] + " Deleted!");
		}
	}
	
	void Peek() {
		if(front == -1 || front > rear) {
			System.out.println("Queue is Overflow!");
		}else {
			System.out.println(queue[front] + " is a Top Element!");
		}
	}
	
	
	void Display() {
		if(front == -1) {
			System.out.println("Queue is Empty");
		}else {
			for(int i= front; i <= rear; i++) {
				System.out.println(queue[i] + " ");
			}
			System.out.println();
		}
	}
	    
	

	    public static void main(String[] args) {
	    	Queue que = new Queue();
	    	que.enqueue(10);
	    	que.enqueue(20);
	    	que.enqueue(30);
//	    	que.enqueue(40);
//	    	que.enqueue(50);
	    	que.enqueue(60);
	    	que.Display();
	    	que.Dequeue();
	    	que.Display();
	    	que.Peek();
	    	que.Display();
	    	
	    
	    }
	}


