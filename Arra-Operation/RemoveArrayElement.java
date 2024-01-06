package ArrayOperation;

public class RemoveArrayElement {
	
	static void remove(int arr[]) {
		int []new_ar=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(i==(arr.length-1)) {
				continue;
			}
			new_ar[i]=arr[i];
			System.out.print(new_ar[i]+"->");
		}
	}
	
	public static void main(String ar[]) {
		int arr[]= {2,6,7,8,9,3,12};
		remove(arr);
	}

}
