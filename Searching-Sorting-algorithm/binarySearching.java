package searching;

public class binarySearching {
	static void binarysearch(int arr[],int target,int low,int high) {
	 while(low<high) {
		 int mid=(low+high)/2;
		 if(target==arr[mid]) {
			  System.out.println("Data found="+arr[mid]+" "+"at index="+mid);
			  break;
			 }
		 else if(target<arr[mid]) {
			 high=mid-1;
		 }
		 else  {
			 low=mid+1;		 
		 }
		 if(low==high) {
			 break;
		 }
			 
	 }
	 
		 
	}
	
	public static  void main(String ar[]) {
	int arr[]= {2,12,15,25,35,45,60,70,80};
	int low=0;
	int high=arr.length-1;
	
	int target=15;
	binarysearch(arr,target,low,high);
	}

}
