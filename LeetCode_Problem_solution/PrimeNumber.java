package LeetCode;

public class PrimeNumber {

	public static void main(String ar[]) {
		
		int n=3;
		int count=0;
		for(int i=2;i<16;i++) {
			if(n%i==0) {
				count++;
			}
				
		}
		if(count==2)  
			 System.out.print("Prime Number");
			else
			System.out.print("Not Prime Number");
	}
}
