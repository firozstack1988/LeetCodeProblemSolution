package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class findDuplicateElement {
	
	public boolean finddupelement(int b[],int len) {
		int count=0;
		HashSet<Integer> num=new HashSet<Integer>();
		
		/*for(int i=0;i<len;i++) {
			if(num.contains(b[i])) return true;	
			num.add(b[i]);	
			System.out.print(num);
		}*/
		Arrays.sort(b);
		for(int i=0;i<len-1;i++) {
			if(b[i]==b[i+1]) return true;
			System.out.print(b[i]);
		}
		
		  return false;
	}

	public static void main(String ar[]) {
		int arr[]= {1,4,5,6,7,1,8};
		int len=arr.length;
		findDuplicateElement obj=new findDuplicateElement();
		
	System.out.print(obj.finddupelement(arr,len));
	}
}
