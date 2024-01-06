package LeetCodeString;

public class StringSorting {
	
	static void sorting() {
		 String st="rock";
			char ch[]=st.toCharArray();
			char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			System.out.print(ch[i]);
		}
	}
	public static void main(String ar[]) {
		sorting();
	}

}
