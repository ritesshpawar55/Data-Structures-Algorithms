package Arrays.dsa;

import java.util.Scanner;

public class ArrayInsertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Position to Store Element : ");
		int pos = sc.nextInt();
		System.out.println("Enter Element : ");
		int element = sc.nextInt();
		int []arr = {12,56,90,30,50};
		int n = arr.length;
		
		// Swap Array
		for(int i = n-1; i > pos ; i--) {
			arr[i] = arr[i - 1];
		}
		
		// Insert Element
		arr[pos] = element;
		n++;
		
		// Traverse Array
		for(int i =0; i < n; i++) {
			System.out.println(arr[i] + " ");
			
		}
		}
	

}
