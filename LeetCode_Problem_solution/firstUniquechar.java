package LeetCodeString;

import java.util.HashMap;
import java.util.Map;

public class firstUniquechar {
	int index=-1;
	String st="fourbyfour";
	Map<Character,Integer> charFreq=new HashMap<>();
	int getIndex() {
		 for(int i=0;i<st.length();i++)
		 {
			 char ch=st.charAt(i);
			int freq= charFreq.getOrDefault(ch,0);
			System.out.print(freq);
			charFreq.put(ch, (freq+1));
		 }
		 for(int j=0;j<st.length();j++) {
			 if(charFreq.get(st.charAt(j))==1) {
				 index=j;
				 break;
			 }
			 
		 }
		
		return index;
	}
	
	public static void main(String ar[]) {
		firstUniquechar obj=new firstUniquechar();
		System.out.println(obj.getIndex());
	}

}
