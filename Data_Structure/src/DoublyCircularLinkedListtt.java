class DoublyCircularLinkedList {
    static class Node {
        int data;
        Node next, prev;
        Node(int d) { data = d; }
    }

    Node head;

    void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            head.next = head;
            head.prev = head;
            return;
        }
        Node last = head.prev;
        last.next = n;
        n.prev = last;
        n.next = head;
        head.prev = n;
    }

    void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList l = new DoublyCircularLinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display();
    }
}