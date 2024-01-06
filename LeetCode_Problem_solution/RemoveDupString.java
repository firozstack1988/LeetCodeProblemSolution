package LeetCodeString;

public class RemoveDupString {
	static void dupremove() {
		String st="programming";
		char[] arr=st.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<arr.length;i++) {
			boolean repeat=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeat=true;
					break;
				}
			}
			if(!repeat) {
			sb.append(arr[i]);
			}
			
		}
		System.out.print(sb); 
	}
	static void removeduplicate() {
		String s1="programming";
		String s2="";
		char[]arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			boolean repeat=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeat=true; 
					break;
				}				 
			}
			if(!repeat) {
				s2+=arr[i];
			}
		}
		System.out.print(s2);
	}
	
	public static void main(String ar[]) {
		//dupremove();
		removeduplicate();
	}

}
