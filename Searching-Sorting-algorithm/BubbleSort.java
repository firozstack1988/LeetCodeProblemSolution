package SortingAlgorithm;

public class BubbleSort {
	
	static void sorting(int arr[],int len) {
		int temp=0;
		System.out.println("Before sorting");
		for(int i=0;i<len;i++) {
			System.out.print(+arr[i]);
		}
		System.out.println("After sorting");
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.print(+arr[i]);
		}
		
	}
	public static void main(String ar[])
	{
	
		int arr[]= {2,1,4,5,3,7,6,12,8,11};
		int len=arr.length;
		sorting(arr,len);
	}
}
