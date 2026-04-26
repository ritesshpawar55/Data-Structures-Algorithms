 package BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {
    Node root;

    // Insert function
    Node insert(Node root, int key) {
        // Step 1: Base case (empty spot found)
        if (root == null) {
            return new Node(key);
        }
  
        // Step 2: Compare and go left
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        // Step 3: Compare and go right
        else if (key > root.data) {
            root.right = insert(root.right, key);
        }

        // Step 4: Return unchanged node
        return root;
    }
    
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        }
        else if (key > root.data) {
            root.right = delete(root.right, key);
        }
        else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    boolean search(Node root, int key) {
        // Base case
        if (root == null) return false;

        if (key == root.data) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }
    
    public void Tree() {
    	
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 10);
        root = insert(root, 40);
        root = insert(root, 80);
        root = insert(root, 90);
        
        
    }
    
    public static void main(String[] args) {
        BST tree = new BST();

        tree.Tree();

        // SEARCH
        System.out.println("Search 20: " + tree.search(tree.root, 20)); 	//true
        System.out.println("Search 90: " + tree.search(tree.root, 90));  	//true

        // DELETE
        tree.root = tree.delete(tree.root, 20);

        System.out.println("After deleting 20:");
        System.out.println("Search 20: " + tree.search(tree.root, 20)); // false
    }
}