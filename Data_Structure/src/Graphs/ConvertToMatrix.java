package Graphs;
// Undirected Graph To Matrix.
public class ConvertToMatrix {

	int vertices;
	int [] [] adjMatrix;
	
	public ConvertToMatrix(int vertices) {
		this.vertices = vertices;
		adjMatrix = new int[vertices] [vertices];
	}
	public void addEdges(int i, int j) {
		adjMatrix [i][j] = 1;
		adjMatrix [j][i] = 1;
	}
	
//	public void removeEdge(int i, int j) {
//		adjMatrix [i][j] = 0;
//		adjMatrix [j][i] = 0;
//	}
	
	public void displayMatrix() {
		System.out.println("Adjency Matirix");
		for(int i = 0; i<vertices; i++) {
			for(int j = 0; j<vertices; j++) {
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}