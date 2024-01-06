package ArrayOperation;

public class ArrayAddFirstPosition {

	static void addFirst(int arr[]) {
		int data=25;
		int len=arr.length+1;
		int ar_new[]=new int[len];
		int  j=0;
		for(int i=6;i>=0;i--) {
			j++;
			if(i>=0) {
				ar_new[j]=arr[i];		
			}			 		 
		}
		ar_new[0]=data;	
		for(int k=0;k<len;k++) {
			System.out.print(ar_new[k]+"->");	
		}
		
	}
	public static void main(String ar[]) {
		int arr[]= {2,6,7,8,9,3,12};
		addFirst(arr);
	}
}
