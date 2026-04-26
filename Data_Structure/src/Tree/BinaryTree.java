package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	private Node root;
	
	public BinaryTree() { root = null; }
	
	public void InOrder(Node root) {
		
		if(root == null) return; 

		InOrder(root.lchild);
		System.out.println(root.data);
		InOrder(root.rchild);
	}
	
	public void InOrder() { InOrder(root); }

	public void PreOrder(Node root) {
	
		if(root == null) return; 
		
		System.out.println(root.data);
		PreOrder(root.lchild);
		PreOrder(root.rchild);		
	}
	
	public void PreOrder() { PreOrder(root); }


	public void PostOrder(Node root) {
		if(root == null) return; 
		
		PostOrder(root.lchild);
		PostOrder(root.rchild);
		System.out.println(root.data);
	}
	
	public void PostOrder() { PostOrder(root); }


	public void LevelOrderTraversal(Node root) {
		
		if(root == null) return; 
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node firstNode = queue.remove();
		
			System.out.println(firstNode.data + " ");
			
			if(firstNode.lchild != null) {
				queue.add(firstNode.lchild);
			}
			if(firstNode.rchild != null) {
				queue.add(firstNode.rchild);
			}
		}
	}
	
	public void LevelOrderTraversal() { LevelOrderTraversal(root); }

	public void Tree() {
		
		Node n1 = new Node("Ritessh");
		Node n2 = new Node("Kashish");
		Node n3 = new Node("Deepika");
		Node n4 = new Node("Aditi");
		
		n1.lchild = n2;
		n1.rchild = n3;
		n2.lchild = n4;
		
		root = n1;
	}
}
