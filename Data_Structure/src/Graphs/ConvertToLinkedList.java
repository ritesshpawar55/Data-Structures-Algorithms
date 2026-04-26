package Graphs;


public class ConvertToLinkedList {
    private int vertices;
    private GTLNode[] adjList;

    // Constructor
    public ConvertToLinkedList(int vertices) {
        this.vertices = vertices;
        adjList = new GTLNode[vertices];
    }

    // Add edge (undirected)
    public void addEdge(int u, int v) {
        // Add v to u's list
    	GTLNode newNode = new GTLNode(v);
        newNode.next = adjList[u];
        adjList[u] = newNode;

        // Add u to v's list
        newNode = new GTLNode(u);
        newNode.next = adjList[v];
        adjList[v] = newNode;
    }

    // Print adjacency list
    public void printList() {
        System.out.println("Adjacency List:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            GTLNode temp = adjList[i];

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
