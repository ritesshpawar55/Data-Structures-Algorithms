package BinaryTree;

public class BinaryTree {
Node root;

public void preOrder(Node root) {
	
	if(root == null) {
		System.out.println("Tree is Empty!");
	}
	 System.out.print(root.data + " ");
	 
	 if(root.left != null) {
		 preOrder(root.left);
	 }
	 
	 if(root.right != null) {
		 preOrder(root.right);
	 }
}

public void inOrder(Node root) {
	if(root == null) {
		System.out.println("Tree is Empty!");
	}
	
	if(root.left != null) {
		inOrder(root.left);
	}
	
	System.out.print(root.data + " ");
	
	if(root.right != null) {
		inOrder(root.right);
	}
}

public void postOrder(Node root) {
	if(root == null) {
		System.out.println("Tree is Empty");
	}
	if(root.left != null) {
		postOrder(root.left);
	}
	if(root.right != null) {
		postOrder(root.right);
	}
	System.out.print(root.data + " ");
}
}
