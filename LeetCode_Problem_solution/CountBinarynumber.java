package LeetCode;

public class CountBinarynumber {

int countbinarnum(int b[],int len) {
	int count=0;
	for(int i=0;i<=len;i++) {
		if(b[i]==1) {
			count++;
		}
	}
	return count;
}

String toLowerCase() {
	String st="Hello";
	String result="";
	for(char c:st.toCharArray()) {
		if(Character.isUpperCase(c)) {
			result=result+(char)(c+32);
		}
		else {
			result=result+c;
		}
	}
return result;	
}

void reverseString() {
	char st[]= {'h','e','l','l','o'};
	int len=st.length;
	int fast=0;
	int last=len-1;
	char temp=' ';
	while(fast<last) {
		temp=st[fast];
		st[fast]=st[last];
		st[last]=temp;
		fast++;
		last--;
	}
	
}
public static void main(String ar[]) {
	
	int a[]= {1,0,1,0,1,0,1,1};
	int len=a.length-1;
	CountBinarynumber obj=new CountBinarynumber();
	//System.out.print(obj.countbinarnum(a,len));
	//System.out.print(obj.toLowerCase());
	obj.reverseString();
}
}
