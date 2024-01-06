package LeetCodeString;

public class Interchange {
	
	static void withoutthirdvariableinterchange() {
		int x=5;
		int y=6;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.print("value of x="+x+"value of y="+y);
		
	}
	
	static void swap() {
		int x=5;
		int y=6;
		int temp=x;
		x=y;
		y=temp;
		System.out.print("x="+x+"and y="+y);
	}
	public static void main(String ar[]) {
		//withoutthirdvariableinterchange();
		swap();
	}
	

}
