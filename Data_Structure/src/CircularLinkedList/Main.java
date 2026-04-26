package CircularLinkedList;

public class Main {

	public static void main(String[] args) {
		Circular_Linked_list cl = new Circular_Linked_list();
		
		cl.InsertFirst(10);
		cl.InsertFirst(20);
		cl.InsertFirst(30);
		cl.Display();
		
		cl.InsertLast(90);
		cl.InsertLast(80);
		cl.InsertLast(70);
		cl.Display();
		
		cl.InsertAtPosition(100, 4);
		cl.Display();
		
		cl.DeleteFirst();
		cl.Display();
		
		cl.DeletLast();
		cl.Display();
		
		cl.DeleteAtPosition(3);
		cl.DeleteAtPosition(2);
		cl.DeleteAtPosition(2);
		cl.Display();
		
		cl.InsertAtPosition(299, 2);
		cl.Display();
		
		cl.peek();

	}

}
