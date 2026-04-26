package Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayOperations arrayOps = new ArrayOperations(10);

        arrayOps.insert(10, 0);
        arrayOps.insert(20, 1);
        arrayOps.insert(30, 2);
        arrayOps.insert(40, 3);

        System.out.println("Traversal:");
        arrayOps.traverse();

        arrayOps.insert(25, 2);
        System.out.println("After Insertion:");
        arrayOps.traverse();

        arrayOps.delete(1);
        System.out.println("After Deletion:");
        arrayOps.traverse();

        arrayOps.update(2, 100);
        System.out.println("After Update:");
        arrayOps.traverse();

        int index = arrayOps.search(100);
        System.out.println("Element found at index: " + index);
    }
}
