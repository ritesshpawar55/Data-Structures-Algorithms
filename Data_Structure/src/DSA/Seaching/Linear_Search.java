
package DSA.Seaching;

public class Linear_Search {
	public void linear_Search(int [] arr, int key) {
		 boolean found = false;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == key) {
				System.out.println(key +" element is found at index!! "+i);
				 found = true;
				break;
			}
		}
		 if (!found) {
	            System.out.println(key + " element is not found!!");
	        }
		
	}
}
	


