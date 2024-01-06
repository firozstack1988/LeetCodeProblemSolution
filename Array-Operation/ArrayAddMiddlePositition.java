package ArrayOperation;

public class ArrayAddMiddlePositition {

	static void addMiddle(int arr[]) {
		int data=25;
		int pos=4;
		int len=arr.length+1;
		int ar_new[]=new int[len];
		 
		for(int i=0;i<arr.length+1;i++) {
			if(i<pos)  
				ar_new[i]=arr[i];
			 
			else if(i==pos) 
				ar_new[i]=data;	
			 
			else  
				ar_new[i]=arr[i-1];	
		
			System.out.print(ar_new[i]+"->");
		}	
	}
	public static void main(String ar[]) {
		int arr[]= {2,6,7,8,9,3,12};
		addMiddle(arr);
	}
}
