class AVLTree {
    class Node {
        int key, height;
        Node left, right;
        Node(int d) { key = d; height = 1; }
    }

    Node root;

    int height(Node n) {
        return n == null ? 0 : n.height;
    }

    int balance(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node t = x.right;

        x.right = y;
        y.left = t;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node t = y.left;

        y.left = x;
        x.right = t;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    Node insert(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.key) node.left = insert(node.left, key);
        else if (key > node.key) node.right = insert(node.right, key);
        else return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int b = balance(node);

        if (b > 1 && key < node.left.key) return rightRotate(node);
        if (b < -1 && key > node.right.key) return leftRotate(node);
        if (b > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (b < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void inorder(Node n) {
        if (n != null) {
            inorder(n.left);
            System.out.print(n.key + " ");
            inorder(n.right);
        }
    }

    public static void main(String[] args) {
        AVLTree t = new AVLTree();
        t.root = t.insert(t.root, 10);
        t.root = t.insert(t.root, 20);
        t.root = t.insert(t.root, 30);
        t.root = t.insert(t.root, 40);
        t.root = t.insert(t.root, 50);
        t.inorder(t.root);
    }
}