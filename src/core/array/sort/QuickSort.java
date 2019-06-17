package core.array.sort;

public class QuickSort {

	public QuickSort() {
		
	}

	public static void main(String[] args) {
		
		int[] arr = {9,5,1,8,2,7,3,4,6};
		int low = 0;//lowest index
		int high = arr.length -1;//largest index
		sort(arr,low,high);
		
		print(arr);
		

	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]); 
		}
		
	}

	private static void sort(int[] arr, int low, int high) {
		
		if(low < high) {
			
			int pi = partition(arr, low, high);
			
			sort(arr,low,pi-1);//left of pivot
			sort(arr,pi+1,high);//right of pivot 
			
		}
		
		
	}

	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high]; 
		int i = (low-1);
		for(int j=low;j<high;j++) {
			
			if(arr[j] <= pivot) {//TODO 
				i++;
				//swap
				int temp = arr[i];//TODO
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//original = 9,5,1,8,2,7,3,4,6
		//pivot = 6
		//i = 5
		//new = 5,1,2,3,4,7,9,8,6
		
		//swap stopAt and pivot
		int temp = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = temp;
	
		return i+1;
	}

}
