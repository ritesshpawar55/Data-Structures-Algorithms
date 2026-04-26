package Trees;

public class Node {
	
	public String data;
	public Node lchild;
	public Node rchild;
	
	Node(){
		data = null;
		lchild = null;
		rchild = null;
	}
	
	public Node(String val) {
		data = val;
		lchild = null;
		rchild = null;
	}
}
