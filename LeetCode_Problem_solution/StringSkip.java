package LeetCodeString;

public class StringSkip {
    void skip(char st[],int len) {
    	String reuslt="";
    	char res[]= new char[len];
    	 for(int i=0;i<len;i++) {
    		if(st[i]=='#') {
    			continue;
    		}else {
    			res[i]=st[i];
        		System.out.print(res[i]);
    		}
    	
    	 }
    	
    }
	
	
	public static void main(String ar[]) {
		char st[]= {'a','b','c','#','d'};
		int len=st.length;
		StringSkip obj=new StringSkip();
		obj.skip(st, len);
		
	}
}
