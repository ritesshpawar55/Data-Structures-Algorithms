package Graphs;

public class GraphToMarix {
    public static void main(String[] args) {
        ConvertToMatrix g = new ConvertToMatrix(4);

        g.addEdges(0, 1);
        g.addEdges(1, 2);
        g.addEdges(2, 3);

        g.displayMatrix();
//      g.removeEdge(2, 3);
//      System.out.println();
//      g.displayMatrix();
        
    }
}