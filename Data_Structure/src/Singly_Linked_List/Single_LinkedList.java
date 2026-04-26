package Singly_Linked_List;

public class Single_LinkedList implements LinkedList{
	
	public Node headNode;
	public Node tailNode;
	
	public Single_LinkedList() {
		headNode=null;
		tailNode=null;
	}

	@Override
	public void addFirst(int val) {
		
		Node newNode = new Node();
		newNode.data = val;
		newNode.nextNode = headNode;
		headNode = newNode;
		
//		if(tailNode == null) {
//			tailNode = headNode;
//		}
	}

	@Override
	public void addLast(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.nextNode = null;
		
		if(headNode == null) {
			headNode = newNode;
			tailNode = newNode;
			return;
		}  
		
		tailNode.nextNode = newNode;
		tailNode = newNode;
	}

	@Override
	public void addAnyPos(int val, int pos) {

	    if (pos < 0) {
	        System.out.println("Invalid position");
	        return;
	    }

	    // Insert at beginning
	    if (pos == 0) {
	        addFirst(val);
	        return;
	    }

	    Node newNode = new Node();
	    newNode.data = val;

	    Node tempNode = headNode;

	    // Traverse to (pos - 1)
	    for (int i = 0; i < pos - 1; i++) {
	        if (tempNode == null) {
	            System.out.println("Position out of bounds");
	            return;
	        }
	        tempNode = tempNode.nextNode;
	    }

	    if (tempNode == null) {
	        System.out.println("Position out of bounds");
	        return;
	    }

	    newNode.nextNode = tempNode.nextNode;
	    tempNode.nextNode = newNode;

	    // If inserted at last → update tail
	    if (newNode.nextNode == null) {
	        tailNode = newNode;
	    }
	}

	@Override
	public void deleteFirst() {
		if(headNode == null) {
			System.out.println("list is empty");
			return;
		}
		
		Node tempNode = headNode;
		headNode = headNode.nextNode;
		
		if(headNode == null) {
			tailNode = headNode;
		}
		return;
	}

//	@Override
//	public void deleteLast() {
//		if(headNode == null) {
//			return;
//		}
//		
//		if(headNode == tailNode) {
//			headNode = null;
//			tailNode = null;
//			return;
//		}
//		
//		Node currentNode = headNode;
//		while(currentNode.nextNode != tailNode) {
//			currentNode = currentNode.nextNode;
//		}
//		
//		currentNode.nextNode = null;
//		tailNode = currentNode;
//	
//	}

	@Override
	public void deleteAnyPos(int pos) {

	    if (headNode == null || pos < 0) {
	        return;
	    }

	    // Delete first node
	    if (pos == 0) {
	        return;
	    }

	    Node tempNode = headNode;

	    // Traverse to (pos - 1)
	    for (int i = 0; i < pos - 1; i++) {
	        if (tempNode.nextNode == null) {
	            return;
	        }
	        tempNode = tempNode.nextNode;
	    }

	    // If next node doesn't exist
	    if (tempNode.nextNode == null) {
	        return;
	    }

	    Node nodeToDelete = tempNode.nextNode;
	    int val = nodeToDelete.data;

	    tempNode.nextNode = nodeToDelete.nextNode;

	    // If last node deleted → update tail
	    if (tempNode.nextNode == null) {
	        tailNode = tempNode;
	    }

	    return;
	}
	
	@Override
	public void deleteLast() {
		
		if(headNode==null) {
			System.out.println("list is empty");
			return;
		}
		
		if(headNode == tailNode) {
			headNode = tailNode = null;
			return;
		}
		
		Node currentNode = headNode;
		
		while(currentNode.nextNode != tailNode) {
			currentNode = currentNode.nextNode;
		}
		
		currentNode.nextNode = null;
		tailNode = currentNode;
			
	}
	
	@Override
	public void Display() {
		Node currentNode = headNode;
		while(currentNode.nextNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.nextNode;
		}
	}
}
