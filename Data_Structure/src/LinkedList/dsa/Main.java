package LinkedList.dsa;

import java.util.*;

public class Main {
	public static void main(String [] args) {
		Singly_Linked_List l = new Singly_Linked_List();
		l.InsertFirst(10);
		l.InsertFirst(89);
		l.InsertFirst(8900);
		l.Display();
		
//		l.InsertLast(20);
//		l.InsertLast(67);
//		l.Display();
//		
//		l.insertAtPosition(100,4 );
//		l.Display();
//		
//		l.DeleteFirst();
//		l.Display();
//		
//		l.DeleteLast();
//		l.Display();
		
		l.DeleteAtPosition(2);
		l.Display();
		
		
		
	}

}
