package CircularQueue.dsa;

public class Circular_Queue {
	private int [] arr;
	private int front, rear ,size;
	
	public Circular_Queue(int size) {
		this.size = size;
		arr = new int [size];
		front = rear = -1;
		
	}
	
	public boolean isFull() {
		return front == (rear +1 ) % size;
		
	}
	
	public boolean isEmpty() {
		return front == -1;
	}
	
	public void Enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue is Overflow");
			return;
		}
		
		if(isEmpty()) {
			front = rear = 0;
		}
		else {
			rear = (rear + 1) % size;
	}
		arr[rear] = val;
		System.out.println(val + " Is Inserted");
	
	}
	
	public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front] + " Is removed");

        if (front == rear) {
            front = rear = -1;
        }
        else {
            front = (front + 1) % size;
        }
    }
	
	public void Peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println(arr[front] + " Is a Peek Element");
		} 
	}
	public void Display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");

        for (int i = front; ; i = (i + 1) % size) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
        }
        
        System.out.println();
    }

	
	public static void main(String [] args) {
		
		
		Circular_Queue que = new Circular_Queue(2);
		
		que.Enqueue(10);
		que.Enqueue(20);
		que.Enqueue(100);
//		que.Dequeue();
		que.Peek();
		que.Display();
	}
}
