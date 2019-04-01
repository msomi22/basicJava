/**
 * 
 */
package core.array.sort;

/**
 * Search an element in a sorted and rotate array
 * 
 * @author peter
 *
 */
public class SearchAndRotate {

	/**
	 * sort
	 * rotate at a given pivot
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {5,6,7,8,9,10,1,2,3};
		int toFind = 3;//found at index 8
		
		int foundAt = search(arr, 0, arr.length-1, toFind);
		
		if(foundAt != -1){
			System.out.println("Index " + foundAt); 
		}else{
			System.out.println("Key not found"); 
		}

	}

	private static int search(int[] arr, int min, int max, int toFind) {
		
		if(min > max) return -1;
		
		int mid = (min+max)/2;
		if(arr[mid] == toFind) return mid;
		
		if(arr[min] <= arr[mid]){
			if(toFind >= arr[min] && toFind <= arr[mid]) 
				return search(arr, min, mid-1, toFind);
			
			return search(arr, mid+1, max, toFind);  
		}
		
		if(toFind >= arr[mid] && toFind <= arr[max])
			return search(arr, mid+1, max, toFind);
		
		return 0;
	}

}
