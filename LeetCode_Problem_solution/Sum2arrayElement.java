package LeetCode;

public class Sum2arrayElement {

int[] sum(int a[],int fast_index,int last_index,int target){
	int sum=0;
	while(fast_index<last_index) {
		sum=a[fast_index]+a[last_index];
		
		 if(sum>target)
			last_index--;
		 else if(sum<target)
			fast_index++;
		else {
		//	System.out.print("["+fast_index+1 +","+last_index+1+"]");
			return new int[] {fast_index+1,last_index+1};	
		}
		
	}
	return new int[] {fast_index+1,last_index+1};
}



public static void main(String ar[]) {
	int a[]= {2,5,7,10,15};
	int fast_index=0;
	int last_index=a.length-1;
	int target=9;
	Sum2arrayElement obj=new Sum2arrayElement();
	int b[]=new int[2];
	 b=obj.sum(a, fast_index, last_index, target);
	 System.out.print(b);
	
}

}
