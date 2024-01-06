package LeetCodeString;

public class stringliteral {

	 boolean chkstring() {
		 String s1="Hello";
		 String S3="Hello";
		 String s2=new String("Hello");		 
		 if(s1.equals(s2))
		 {
		     return true;
		 }
		 else {
			 return false;
		 }
	 }
	public static void main(String ar[]) {
	
		stringliteral obj=new stringliteral();
		System.out.print(obj.chkstring());
	}
}
