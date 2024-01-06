package ArrayOperation;

public class ArrayMerge {
	
	static void merge(int arr1[],int arr2[]) {
		int n1=arr1.length;
		int n2=arr2.length;
		int arr[]=new int[n1+n2];
		for(int i=0;i<arr.length;i++) {
			if(i<n1)
				arr[i]=arr1[i];
			else
				arr[i]=arr2[i-n1];
			System.out.print(arr[i]+"->");
		}
	 }
	public static void main(String ar[]) {
		int arr1[]= {2,6,7,8,9,3,12};
		int arr2[]= {20,60,70,80,90,30,12};
		//split(arr);
		merge(arr1,arr2);
	}

}
