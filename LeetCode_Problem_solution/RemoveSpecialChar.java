package LeetCodeString;

public class RemoveSpecialChar {
static void removeSpecialchar() {
		String st="$ja&v!ast*ar";
		String s2="";
		System.out.println(st.replaceAll("[^a-zA-Z0-9]",""));
	}
  static void whitespaceremove() {
	  String st="j a  v a s t a r";
	  String s2=st.replaceAll("\\s","");
	  System.out.println(s2);
  }
	
public static void main(String ar[]) {
   // removeSpecialchar();
	whitespaceremove();
}
}
