package ArrayOperation;

public class ArraySplit {

	static void split(int arr[]) {
		int n=arr.length;
		int n1=n/2;
		int n2=n-n1;
		 
		int new_arr1[]=new int[n1];
		int new_arr2[]=new int[n2];
		for(int i=0;i<n1;i++) {
			new_arr1[i]=arr[i];
			System.out.print(new_arr1[i]+"->");
		}
		for(int i=n1;i<n;i++) {
			new_arr2[i-n1]=arr[i];
			System.out.println(new_arr2[i-n1]);
		}
	}
	public static void main(String ar[]) {
		int arr[]= {20,60,70,80,90,30,12};
		split(arr);
		
	}
}
