package LeetCodeString;

public class stringPalindrome {
   String st="aba";
   String sb="";
	void getPalindrom() {
		for(int i=0;i<st.length();i++) {
			sb+=st.charAt(i);
		}
		if(sb.equalsIgnoreCase(st)) 
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void main(String ar[]) {
		stringPalindrome obj=new stringPalindrome();
		obj.getPalindrom();
	}
}
