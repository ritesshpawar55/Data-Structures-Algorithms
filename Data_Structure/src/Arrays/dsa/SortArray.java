package Arrays.dsa;

public class SortArray {

public static void main(String[] args) {
		
		int arr[] = {1, 2, 0, 2, 0, 1, 0, 0, 1, 0, 2, 0, 2, 1};
//		int arr[] = {1 , 6, 4, 3, -1, -12, -63, -6, -5};
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i+1 ; j < arr.length;j++ ) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}	
			System.out.print(arr[i]+" ");
}
}
}