package LeetCode;

public class StringReverse {
	
	String reverse() {
		String st= "abcde";
		char ch;
		String str1="";
		for(int i=0;i<st.length();i++) {
			ch=st.charAt(i);
			str1=ch+str1;
		}
		return str1;
	}
	
	int palindrom() {
		int n=454;
		int temp=n;
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp) {
			System.out.print("Pallindrom");
		}
		else
			System.out.print("Not Pallindrom");	
		return sum;
	}
	
	
	public static void main(String ar[]) {
		StringReverse obj=new StringReverse();
		//System.out.print(obj.reverse());
		System.out.print(obj.palindrom());
		
	}

}
