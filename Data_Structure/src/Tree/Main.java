package Trees;

public class Main {
	//Welcome Ritessh
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.Tree();
		tree.LevelOrderTraversal();
		System.out.println();
		
		System.out.println("Inorder: ");
		tree.InOrder();
		
		System.out.println("\nPreorder: ");
		tree.PreOrder();
		
		System.out.println("\nPostorder: ");
		tree.PostOrder();
	}

}
