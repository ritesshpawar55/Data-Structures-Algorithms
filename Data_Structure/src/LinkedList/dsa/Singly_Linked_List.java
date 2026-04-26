package LinkedList.dsa;

class Singly_Linked_List {
	Node head;
	Node tail;
	// Insert First
	 void InsertFirst(int data) {
		Node newNode = new Node(data);
		
		 if (head == null) {
	            head = tail = newNode;
	        } else {
	            newNode.next = head;
	            head = newNode;
	        }
	}
	 
	  // Insert Last
	 void InsertLast(int data) {
		 Node newNode = new Node(data);
		 
		 if (head == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	 }
	 
	 // Insert at Position
	 void insertAtPosition(int data, int pos) {
	        Node newNode = new Node(data);

	        if (pos == 1) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        for (int i = 1; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) return;

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }
	 
	 // Delete First
	 void DeleteFirst() {
		 if(head == null) {
			 System.out.println("List is Empty");
		 }else {
			 head = head.next;
		 }
	 }
	 
	 // Delete Last
	 void DeleteLast() {
		 if (head == null) {
			 System.out.println("List is Empty");
		 }

	        if (head.next == null) {
	            head = null;
	            return;
	        }

	        Node temp = head;
	        while (temp.next.next != null) {
	            temp = temp.next;
	        }

	        temp.next = null;
	 }
	 
	 void DeleteAtPosition(int pos) {
		 if(head == null) {
			 System.out.println("List is empty");
		 }
		 
		 if(pos == 1) {
			 head = head.next;
			 return;
			 
		 }
		 Node temp = head;
		 for(int i = 1; i < pos-1 && head != null; i++) {
			 temp = temp.next;
		 }
		 
//		 if(head == null || head.next == null) {
//			 System.out.println("Invalid Position");
//			 return;
//		 }else {
			 temp.next = temp.next.next;
//		 }
	 }
	 
	 void Display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println(" Null");
	    }
	 
	 
	

}
