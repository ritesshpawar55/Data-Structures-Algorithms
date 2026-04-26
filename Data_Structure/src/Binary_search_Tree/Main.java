package Binary_search_Tree;

public class Main {

	public static void main(String[] args) {
	BST bst = new BST();
	bst.root = bst.insert(bst.root, 50);
	 bst.insert(bst.root, 90);
	 bst.insert(bst.root, 40);
	 bst.insert(bst.root, 70);
	 bst.insert(bst.root, 10);
	 bst.insert(bst.root, 60);
	 bst.insert(bst.root, 20);
	 
	 System.out.print("InOrder : ");
	 bst.inorder(bst.root);
	 
	 System.out.println();
	 System.out.print("PreOrder : ");
	 bst.preOrder(bst.root); 	
	 
	 System.out.println();
	 System.out.print("PostOrder : ");
	 bst.postOrder(bst.root);
	}

}
