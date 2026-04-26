class DoublyLinkedList {
    static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    Node head;

    void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = n;
        n.prev = temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.display();
    }
}