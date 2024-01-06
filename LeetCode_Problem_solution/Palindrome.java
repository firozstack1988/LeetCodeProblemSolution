package LeetCode;

public class Palindrome {
	
	static boolean chkPalindrome() {
		int n=454;
		int sum=0;
		int temp=n;int r;
		boolean result=false;
		while(n>0) {
			sum=sum*10+n%10;
			n=n/10;
		}
		if(sum==temp) 
			result =true;
			//System.out.print("This is Palindrome");
		else
			result=false;
			//System.out.print("This is Not Palindrome");
		return result;
	}
	public static void main(String ar[]) {
		   System.out.print(chkPalindrome());
	}

}
