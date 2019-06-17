package core.array.sort;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] arr = {9,1,5,7,3,2,8,4,6};
		int len = arr.length;

		bubbleSort(arr,len-1);

		print(arr);

	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(" " + arr[i]); 
	}

	private static void bubbleSort(int[] arr, int lastIndex) {
		for(int i=0;i<lastIndex-1;i++)
			for(int j=0;j<lastIndex-i-1;j++) 
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

	}

}
