package AVL_Trees;

class Node {
    int key, height;
    Node left, right;

    Node(int key) {
        this.key = key;
        this.height = 1; // new node starts with height 1
    }
}

class AVLTree {

    // Get height
    int height(Node n) {
        return (n == null) ? 0 : n.height;
    }

    // Get balance factor
    int getBalance(Node n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    // Right Rotation (LL Case)
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // rotation
        x.right = y;
        y.left = T2;

        // update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation (RR Case)
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // rotation
        y.left = x;
        x.right = T2;

        // update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert node
    Node insert(Node node, int key) {

        // 1. Normal BST insert
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node; // no duplicates

        // 2. Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Get balance factor
        int balance = getBalance(node);

        // 4. Balance cases

        // LL
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // RR
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // LR
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
    
        public static void main(String[] args) {
            
        	AVLTree tree = new AVLTree();
            Node root = null;

            int[] values = {504, 1511, 6222, 5234, 2440, 5568, 5391};

            for (int v : values) {
                root = tree.insert(root, v);
            }

            tree.inorder(root); // sorted output
        }
}