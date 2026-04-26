package Arrays.dsa;

import java.util.Arrays;

public class KthSmallestEle {
	public static void main(String[] args) {
		
		int arr[] = {110, 20, 30, 11, 21, 31};
		
//		Arrays.sort(arr);
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i+1 ; j < arr.length;j++ ) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}	
			System.out.println(arr[i]);
			
			
			}
		int k = 3;
		System.out.println("Kth Min Element : "+arr[k-1]);
		System.out.println("Kth Max Element : "+arr[arr.length -k]);
	}

}
