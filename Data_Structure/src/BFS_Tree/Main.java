package BFS_Tree;

public class Main {

	public static void main(String[] args) {
		LevelOrderTraversal lot = new LevelOrderTraversal();
		lot.root = new Node(10);
		lot.root.left = new Node(20);
		lot.root.right = new Node(30);
		lot.root.left.left = new Node(40);
		lot.root.left.right = new Node(50);
		lot.root.right.left = new Node(60);
		lot.root.right.right = new Node(70);
		
		System.out.print("Level Order Traversal : ");
		lot.levelOrderTra(lot.root);
		
		
	}

}
