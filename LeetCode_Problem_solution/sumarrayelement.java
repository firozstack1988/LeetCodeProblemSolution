package LeetCodeString;

public class sumarrayelement {

	int arr[]= {2,3,2,7,9,5,8,6,12};
	int target=9;
	int low=0;
	int high=arr.length-1;
	void getindex() {
		while(low<high) {
			int sum=arr[low]+arr[high];
			if(sum==target) {
				System.out.print("["+low+","+high+"]");
			    break;
			}
			low++;
			high--;
		}
	}
	public static void main(String ar[]) {
		sumarrayelement obj=new sumarrayelement();
		obj.getindex();
	}
}
