package DoublyLinkedList.dsa;

public class Doubly_Linked_List {
    Node head = null;

    // 🔸 Insert at beginning
    void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    // 🔸 Insert at end
    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // 🔸 Insert at position
    void insertPosition(int pos, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // 🔸 Delete from beginning
    void deleteBeginning() {
        if (head == null) return;

        head = head.next;
        if (head != null)
            head.prev = null;
    }

    // 🔸 Delete from end
    void deleteEnd() {
        if (head == null) return;

        Node temp = head;

        if (temp.next == null) {
            head = null;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // 🔸 Delete from position
    void deletePosition(int pos) {
        Node temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        if (temp.prev != null)
            temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }
    
    // Display forward
    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Display backward
    void displayBackward() {
        Node temp = head;

        // go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // traverse backward
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}