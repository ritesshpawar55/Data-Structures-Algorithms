package Stack.Operations;

import java.util.*;

public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer> sc = new Stack<>();
		
		int [] arr = {1, 2, 3, 4, 5};
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.push(arr[i]);
		}
	
	System.out.print(sc);
	
	System.out.println();
		for(int i = 0; i< arr.length ; i++) {
			arr[i] = sc.pop();
           System.out.println(arr[i]);
            
		}
		 System.out.println(Arrays.toString(arr));
	}

}
