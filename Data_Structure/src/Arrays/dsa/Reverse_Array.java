package Arrays.dsa;

import java.util.Scanner;
public class Reverse_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length : ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter Array Elements : ");
		
		for(int i = 0; i < n ; i++ ) {
			 arr1[i] = sc.nextInt();
		}
			
		for(int i = n-1; i >= 0 ; i-- ) {
			
			System.out.print(arr1[i]+" ");
			
		}
		
//		for (int i = 0; i < n / 2; i++) {
//            int temp = arr1[i];
//            arr1[i] = arr1[n - 1 - i];
//            arr1[n - 1 - i] = temp;
//        }
//
//		for(int num :  arr1 ) {
//			
//			System.out.print(num +" ");
//		}
		
	}
}




