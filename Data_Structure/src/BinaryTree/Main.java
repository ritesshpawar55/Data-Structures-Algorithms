package BinaryTree;

public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node n1= new Node(10);
		Node n2  = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		tree.root =  n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		
		
		System.out.print("PreOrder Traversal : ");
		tree.preOrder(tree.root);
		System.out.println();
		System.out.print("InOrder Traversal : ");
		tree.inOrder(tree.root);
		System.out.println();
		System.out.print("PostOrder Traversal : ");
		tree.postOrder(tree.root);	
		

	}

}
