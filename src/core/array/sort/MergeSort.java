package core.array.sort;

public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int[] arr = {9,1,5,4,8,2,3,6,7}; 
		int startIndex = 0;
		int lastIndex = arr.length -1;//8
		
		sort(arr,startIndex,lastIndex); 
		
		print(arr);
		
		
	}

	private static void sort(int[] arr, int startIndex, int lastIndex) {
		
		if(startIndex < lastIndex) {
			
			int mid = (startIndex + lastIndex)/2;
			
			sort(arr,startIndex,mid);//0 4
			sort(arr,mid+1,lastIndex);//5 8
			
			merge(arr,startIndex,mid,lastIndex);
			
		}
		
	}

	private static void merge(int[] arr, int startIndex, int mid, int lastIndex) {
		
		int leftLen = mid - startIndex + 1;//5
		int rightLen = lastIndex - mid;//4
		
		int[] left = new int[leftLen];
		int[] right = new int[rightLen]; 
		
		for(int i=0;i<leftLen;i++)
			left[i] = arr[startIndex + i];
		for(int j=0;j<rightLen;j++)
			right[j] = arr[mid + j +1]; 
		
		int i=0,j=0;
		int k = startIndex;
		while(i<leftLen && j<rightLen) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		//copy if any 
		while(i<leftLen) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<rightLen) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
		
	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]); 
		}
		
	}



}
