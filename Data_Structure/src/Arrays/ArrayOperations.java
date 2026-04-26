package Arrays;

public class ArrayOperations {

	    private int[] arr;
	    private int size;   

	  
	    public ArrayOperations(int capacity) {
	        arr = new int[capacity];
	        size = 0;
	    }

	    // 1️. Traversal
	    public void traverse() {
	        if (size == 0) {
	            System.out.println("Array is empty");
	            return;
	        }

	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    // 2️. Insertion at position
	    public void insert(int value, int pos) {
	        if (size == arr.length) {
	            System.out.println("Array Overflow");
	            return;
	        }

	        if (pos < 0 || pos > size) {
	            System.out.println("Invalid Position");
	            return;
	        }

	        // Shift right
	        for (int i = size - 1; i >= pos; i--) {
	            arr[i + 1] = arr[i];
	        }

	        arr[pos] = value;
	        size++;
	    }

	    // 3️. Deletion from position
	    public void delete(int pos) {
	        if (size == 0) {
	            System.out.println("Array Underflow");
	            return;
	        }

	        if (pos < 0 || pos > size) {
	            System.out.println("Invalid Position");
	            return;
	        }

	        // Shift left
	        for (int i = pos; i < size - 1; i++) {
	            arr[i] = arr[i + 1];
	        }

	        size--;
	    }

	    // 4️. Update element
	    public void update(int pos, int value) {
	        if (pos < 0 || pos >= size) {
	            System.out.println("Invalid Position");
	            return;
	        }

	        arr[pos] = value;
	    }

          //5.Search (Linear)
	    public int search(int key) {
	        for (int i = 0; i < size; i++) {
	            if (arr[i] == key) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}


