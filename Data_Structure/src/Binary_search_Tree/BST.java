package Binary_search_Tree;

public class BST {
	
	Node root;
	
	Node insert(Node root, int data) {
		if(root == null) {
			return new Node (data);
		}
		if(data < root.data) {
			  root.left = insert(root.left, data);
		}
		else if(data> root.data) {
			root.right = insert(root.right, data);
		}
		
		return root;
	}
	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
			return;
		}
		
	}
	
	public void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.data+ " ");
			preOrder(root.left);
			preOrder(root.right);
			return;
		}
		
	}
	
	public void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
			return;
		}
		
	}
}
