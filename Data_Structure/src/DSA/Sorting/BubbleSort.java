package DSA.Sorting;

class BubbleSort {

	// Method to perform bubble sort
	void sort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n  - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	

	public static void main(String[] args) {

		int arr[] = { 5, 2, 9, 1, 15, 6 };

		BubbleSort obj = new BubbleSort();

		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		obj.sort(arr);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}


	}
}
