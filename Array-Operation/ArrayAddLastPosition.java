package ArrayOperation;

public class ArrayAddLastPosition {

	static void addLast(int arr[]) {
		int data=25;
		int ar_new[]=new int[arr.length+1];
		for(int i=0;i<ar_new.length;i++) {
			if(i<ar_new.length-1) {
				ar_new[i]=arr[i];				
			}
			else {
				ar_new[i]=data;
			}
		 
			System.out.print(ar_new[i]+"->");
		}
	}
	public static void main(String ar[]) {
		int arr[]= {2,6,7,8,9,3,12};
		addLast(arr);
	}
}
