package CircularLinkedList;

public class Circular_Linked_list {
	Node head = null;
	Node tail = null;
	
	void InsertFirst(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			tail.next = head;
		}else {
		newNode.next = head;
		head = newNode;
		tail.next = head;
	}
	}
	
	void InsertLast(int data) {
	Node newNode = new Node(data);
	
	
	if(head == null) {
		head = tail = newNode;
		tail.next = head;
	}else {
		tail.next = newNode;
        tail = newNode;
        tail.next = head;
	}
	
	}
	
	void InsertAtPosition(int data, int pos) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			tail.next = newNode;
			return;
		}
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
			tail.next = head;
			return;
		}
		
		Node temp = head;
		for(int i = 1 ; i < pos-1 && temp.next != head; i++) {
			temp = temp.next;
			
		}
		newNode.next = temp.next;
        temp.next = newNode;
			
		
	}
	void DeleteFirst() {
		 if(head == null) {
			 System.out.println("List is Empty!");
		 }
		 if(head == null) {
			 head = tail =null;
		 }else {
			 head =head.next;
			 tail.next = head;
		 }
		 
		 
	}
	void DeletLast() {
		
		 if(head == null) {
			 System.out.println("List is Empty!");
		 }
		 
		 if(head == null) {
			 head = tail = null;
		 }
		 
		 Node temp = head;
		 while(temp.next != tail) {
			 temp = temp.next;
		 }
		 temp.next = head;
		 temp = tail;
		 
	}
	
	void DeleteAtPosition(int pos) {
		if(head == null) {
			 System.out.println("List is Empty!");
		 }
		 
		 if(head == null) {
			 head = tail = null;
		 }
		 Node temp = head;
		 for (int i = 1; i < pos - 1; i++) {
		    temp = temp.next;
		}
		 temp.next = temp.next.next;
	}
	
	// peek first element
	public void peek() {
	    if (head == null) {
	        System.out.println("List is empty");
	    }
	    System.out.println(head.data + " Is Peek Element"); 
	}
	
	void Display() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		Node temp = head;
		
		do {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
			
		}while(temp != head);
		System.out.println("Back to the Head!");
	}
	
	
	

}

//for (int i = 1; i < position - 1; i++) {
//    temp = temp.next;
//}
//Node nodeToDelete = temp.next;

