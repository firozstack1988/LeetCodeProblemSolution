package LeetCodeString;

public class subString {
	int result=0;
	String s1="";
	String s2="";
	int calc(String st) {
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch=='5' ||ch=='6') {
				s1+=ch;
			}
			if(ch=='8') {
				s2+=5;
			}
			if(ch=='9') {
				s2+=6;
			}
			 
		 
		}
       if(s1.equalsIgnoreCase(s2)) {
    	   result=2;
       }
      
		
		return result;
	}
	void substr(String st) {
		System.out.println(st.substring(3));//5678911
		System.out.println(st.substring(0,3));//034
	}
	
	public static void main(String ar[]) {
		String st="0345678911";
		subString obj=new subString();
		System.out.println(obj.calc(st));
		obj.substr(st);
	}


}
