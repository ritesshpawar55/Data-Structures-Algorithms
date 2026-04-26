package DSA.Seaching;

import java.util.Scanner;

public class LinearMain {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int size = scanner.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		 System.out.print("Enter key: ");
	        int key = scanner.nextInt();
	        
	        Linear_Search ls = new Linear_Search();
	        ls.linear_Search(arr, key);

	}

}
