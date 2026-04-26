package BFS_Tree;

import java.util.*;

public class LevelOrderTraversal {
	Node root;
	
	public void levelOrderTra(Node root) {
		 Queue<Node> lo = new LinkedList<>();
		    
		    if (root == null) return; // good practice
		    
		    lo.add(root);
		    
		    while (!lo.isEmpty()) {
		        Node temp = lo.remove();
		        System.out.print(temp.data + " ");
		        
		        if (temp.left != null) {
		            lo.add(temp.left);
		        }
		        
		        if (temp.right != null) {
		            lo.add(temp.right);
		        }
		    }
		
		
	}

}


//class LevelOrderTraversal {
//    Node root;
//
//    public void levelOrderTra(Node root) {
//        if (root == null) return;
//        Node[] queue = new Node[100];
//        int front = 0;
//        int rear = 0;
//
//        queue[rear++] = root;
//
//        while (front < rear) {
//            
//            Node temp = queue[front++];
//            System.out.print(temp.data + " ");
//
//            
//            if (temp.left != null) {
//                queue[rear++] = temp.left;
//            }
//
//            
//            if (temp.right != null) {
//                queue[rear++] = temp.right;
//            }
//        }
//    }
//}