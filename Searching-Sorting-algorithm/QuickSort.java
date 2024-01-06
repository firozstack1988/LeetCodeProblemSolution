package SortingAlgorithm;

public class QuickSort {
	
	static void quicksort(int arr[],int low,int high) {
		//step 1 choose pivot at array
		if(low >=high) {
			return;
		}
		int pivot=arr[high];
		int leftPointer=low;
		int rightPointer=high;
		//step partition the array
		while(leftPointer < rightPointer) {
			while(leftPointer <=pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while(rightPointer >=pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap( arr,leftPointer,rightPointer);
		}
		swap( arr,leftPointer,high);
		quicksort(arr, low, leftPointer-1);
		quicksort(arr,leftPointer+1,high);
	}
	//step 3 swaping
	static void swap(int arr[],int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String ar[]) {
		int arr[]= {2,1,4,5,3,7,6,12,8,11};	
		quicksort(arr,0,arr.length-1);
		printArray(arr);
	}

}
