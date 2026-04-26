package Singly_Linked_List;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new Single_LinkedList();
		list.addFirst(100);
		list.addFirst(11);
		list.addFirst(22);
		list.addFirst(33);
		list.addFirst(44);
		list.addFirst(55);
		list.addFirst(66);
		
		//list.addAnyPos(55, 4);
		//list.addAnyPos(555, 3);
		//list.addAnyPos(5565, 2);
		
		//list.deleteFirst();
		list.deleteLast();
		list.deleteLast();
		//list.deleteAnyPos(1);
		
		list.Display();
	}
}
