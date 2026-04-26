package DSA.Sorting;

public class Selection_Sort {

	    static void selectionSort(int[] arr) {

	        for (int i = 0; i < arr.length ; i++) {

	            int minIndex = i;

	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // swap
	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	    }

	    public static void main(String[] args) {        

	        int[] arr = {64, 25, 12, 22, 11};

	        selectionSort(arr);

	        for (int x : arr) {
	            System.out.print(x + " ");
	        }
	    }
	}
