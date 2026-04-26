package DoublyLinkedList.dsa;

public class Main {

	public static void main(String[] args) {
		Doubly_Linked_List list = new Doubly_Linked_List();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        System.out.print("Forward: ");
        list.displayForward();

        System.out.print("\nBackward: ");
        list.displayBackward();

	}

}
