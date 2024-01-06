package LeetCodeString;

public class duplicateString {
	boolean result=false;
	//String st="fourbyfour";
	int arr[]= {1,2,3,4,1,8,9,66,5,8};
	int count=0;
	boolean getInteger() {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;			
					return true;
				}
				System.out.println("Duplicate total:"+count);
			}	
		}
		return false;
	}
	public static void main(String ar[]) {
		duplicateString obj=new duplicateString();
		System.out.println(obj.getInteger());
	}
}
