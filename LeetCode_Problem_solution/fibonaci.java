package LeetCodeString;

public class fibonaci {
	static void fibo() {
		int num=10;
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.print(+sum);
	}
	static int fac(int n) {
	    if(n>=1)
		     return n*fac(n-1);
	    else
	    	 return 1;
	}
	static void prime() {
		int num=61;
		boolean isprime=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isprime=true;
				break;
			}
		}
		if(!isprime) {
			System.out.print("Prime Number");
		}
		else {
			System.out.print("Not Prime Number");
		}
	}
	public static void main(String ar[]) {
		//fibo();
		 int n=10;
		 //System.out.print(fac(n));
		 prime();
	}

}
